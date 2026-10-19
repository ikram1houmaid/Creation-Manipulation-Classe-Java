package voiture;


public class TestVoiture {

    public static void main(String[] args) {

        // Étape 9 : Création des objets
        Voiture voiture1 = new Voiture();

        Voiture voiture2 =
                new Voiture("Toyota", "Corolla", 0.0, 2023);

        Voiture voiture3 = new Voiture(voiture2);

        voiture1.afficherInformations();
        voiture2.afficherInformations();
        voiture3.afficherInformations();

        // Étape 10 : Accélération et freinage
        System.out.println("\n=== Modification de voiture2 ===");

        voiture2.accelerer(120);
        voiture2.freiner(30);
        voiture2.afficherInformations();

        System.out.println("\n=== Modification de voiture3 ===");

        voiture3.accelerer(80);
        voiture3.afficherInformations();

        // Étape 11 : Tests des validations
        System.out.println("\n=== Tests des validations ===");

        voiture2.setVitesse(-50);
        voiture2.setAnnee(1800);
        voiture2.setMarque("");
        voiture2.setAnnee(2050);

        voiture2.afficherInformations();

        // Comparaison
        System.out.println("\n=== Comparaison ===");

        System.out.println("voiture2 == voiture3 : "
                + (voiture2 == voiture3));

        System.out.println("Même marque et modèle : "
                + voiture2.compareAvec(voiture3));

        System.out.println("Consommation estimée : "
                + voiture2.calculerConsommation()
                + " L/100 km");
    }
}

