package voiture;


public class Voiture {

    private String marque;
    private String modele;
    private double vitesse;
    private int annee;

    // Constructeur par défaut
    public Voiture() {
        this.marque = "Inconnue";
        this.modele = "Standard";
        this.vitesse = 0.0;
        this.annee = 2024;
    }

    // Constructeur paramétré
    public Voiture(String marque, String modele, double vitesse, int annee) {
        this();
        setMarque(marque);
        setModele(modele);
        setVitesse(vitesse);
        setAnnee(annee);
    }

    // Constructeur de copie
    public Voiture(Voiture autreVoiture) {
        this(autreVoiture.marque, autreVoiture.modele,
             autreVoiture.vitesse, autreVoiture.annee);
    }

    // Getters
    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public double getVitesse() {
        return vitesse;
    }

    public int getAnnee() {
        return annee;
    }

    // Setters avec validations
    public void setMarque(String marque) {
        if (marque != null && !marque.trim().isEmpty()) {
            this.marque = marque;
        } else {
            System.out.println("Erreur : Marque invalide.");
        }
    }

    public void setModele(String modele) {
        if (modele != null && !modele.trim().isEmpty()) {
            this.modele = modele;
        } else {
            System.out.println("Erreur : Modèle invalide.");
        }
    }

    public void setVitesse(double vitesse) {
        if (vitesse >= 0 && Double.isFinite(vitesse)) {
            this.vitesse = vitesse;
        } else {
            System.out.println("Erreur : Vitesse invalide.");
        }
    }

    public void setAnnee(int annee) {
        int anneeCourante = java.time.Year.now().getValue();

        if (annee >= 1886 && annee <= anneeCourante) {
            this.annee = annee;
        } else {
            System.out.println("Erreur : Année invalide.");
        }
    }

    // Méthode accélérer
    public void accelerer(double augmentation) {
        if (augmentation > 0 && Double.isFinite(augmentation)) {
            vitesse += augmentation;
            System.out.println("Nouvelle vitesse : " + vitesse + " km/h");
        } else {
            System.out.println("Erreur : Augmentation invalide.");
        }
    }

    // Méthode freiner
    public void freiner(double reduction) {
        if (reduction > 0 && Double.isFinite(reduction)) {
            vitesse = Math.max(0, vitesse - reduction);
            System.out.println("Nouvelle vitesse : " + vitesse + " km/h");
        } else {
            System.out.println("Erreur : Réduction invalide.");
        }
    }

    // Afficher les informations
    public void afficherInformations() {
        System.out.println("=== Informations de la voiture ===");
        System.out.println("Marque : " + marque);
        System.out.println("Modèle : " + modele);
        System.out.println("Vitesse : " + vitesse + " km/h");
        System.out.println("Année : " + annee);
        System.out.println("===================================");
    }

    // Comparer deux voitures
    public boolean compareAvec(Voiture autre) {
        return autre != null
                && this.marque.equals(autre.marque)
                && this.modele.equals(autre.modele);
    }

    // Consommation estimée selon la vitesse
    public double calculerConsommation() {
        if (vitesse <= 50) {
            return 5.0;
        } else if (vitesse <= 90) {
            return 6.0;
        } else {
            return 8.0;
        }
    }
}

