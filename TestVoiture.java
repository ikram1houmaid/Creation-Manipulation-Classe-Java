public class TestVoiture {

    public static void main(String[] args) {

        System.out.println("===== CREATION DES VOITURES =====");

        Voiture voiture1 = new Voiture();

        Voiture voiture2 = new Voiture(
            "Toyota",
            "Corolla",
            0.0,
            2023
        );

        Voiture voiture3 = new Voiture(voiture2);

        voiture1.afficherInformations();
        voiture2.afficherInformations();
        voiture3.afficherInformations();


        System.out.println("\n===== TEST ACCELERATION =====");

        voiture2.accelerer(120);


        System.out.println("\n===== TEST FREINAGE =====");

        voiture2.freiner(30);


        System.out.println("\n===== ETAT DE VOITURE2 =====");

        voiture2.afficherInformations();


        System.out.println("\n===== TEST DE VOITURE3 =====");

        voiture3.accelerer(80);
        voiture3.afficherInformations();


        System.out.println("\n===== TEST DES VALIDATIONS =====");

        voiture2.setVitesse(-50);

        voiture2.setAnnee(1800);

        voiture2.setAnnee(2050);

        voiture2.setMarque("");

        voiture2.setMarque(null);

        voiture2.accelerer(-20);


        voiture2.freiner(-10);


        System.out.println("\n===== TEST FREINAGE EXCESSIF =====");

        voiture2.setVitesse(20);
        voiture2.freiner(50);


        System.out.println("\n===== COMPARAISON DES OBJETS =====");

        System.out.println(
            "voiture2 == voiture3 : " + (voiture2 == voiture3)
        );


        System.out.println("\n===== ETAT FINAL =====");

        voiture2.afficherInformations();
        voiture3.afficherInformations();
    }
}