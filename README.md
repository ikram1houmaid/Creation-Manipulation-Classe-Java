# TP Java — Gestion d'une classe Voiture

## 1. Présentation

Ce projet a pour objectif de mettre en pratique les concepts fondamentaux de la programmation orientée objet (POO) en Java à travers la création et la manipulation d'une classe `Voiture`.

## 2. Objectifs

- Créer une classe et déclarer des attributs privés.
- Utiliser les constructeurs.
- Comprendre l'encapsulation.
- Implémenter les getters et les setters.
- Valider les données avant leur modification.
- Créer des méthodes métier.
- Créer, modifier et comparer plusieurs objets.
- Tester les cas valides et invalides.

## 3. Structure du projet

```text
TPVoiture/
└── src/
    └── voiture/
        ├── Voiture.java
        └── TestVoiture.java
```

## 4. Description des classes

### Voiture.java

Cette classe représente une voiture et contient :

**Attributs :**
- `marque` : marque de la voiture.
- `modele` : modèle de la voiture.
- `vitesse` : vitesse actuelle en km/h.
- `annee` : année de fabrication.

**Constructeurs :**
- Constructeur par défaut.
- Constructeur paramétré.
- Constructeur de copie.

**Méthodes :**
- Getters et setters avec validations.
- `accelerer()` : augmenter la vitesse.
- `freiner()` : réduire la vitesse sans descendre sous zéro.
- `afficherInformations()` : afficher les informations de la voiture.
- `compareAvec()` : comparer la marque et le modèle de deux voitures.
- `calculerConsommation()` : estimer la consommation selon la vitesse.

### TestVoiture.java

Cette classe contient la méthode `main()` permettant de :

- Créer plusieurs objets `Voiture`.
- Tester les trois constructeurs.
- Afficher les informations.
- Tester l'accélération et le freinage.
- Vérifier les validations des attributs.
- Comparer deux objets.
- Tester le calcul de consommation.

## 5. Concepts POO utilisés

- **Classe et objet :** définir un modèle et créer des instances.
- **Encapsulation :** protéger les attributs avec `private`.
- **Constructeurs :** initialiser les objets.
- **Surcharge des constructeurs :** proposer plusieurs façons de créer un objet.
- **Validation :** empêcher l'affectation de valeurs invalides.
- **Méthodes métier :** définir les comportements de la voiture.

## 6. Exemple d'utilisation

```java
Voiture voiture = new Voiture("Toyota", "Corolla", 0.0, 2023);

voiture.accelerer(120);
voiture.freiner(30);
voiture.afficherInformations();
```

La vitesse finale est de 90 km/h.

## 7. Exécution

1. Ouvrir le projet dans Eclipse.
2. Vérifier que les deux classes appartiennent au package `voiture`.
3. Ouvrir `TestVoiture.java`.
4. Cliquer sur **Run As → Java Application**.
5. Consulter les résultats dans la console.

## 8. Conclusion

Ce TP permet de comprendre les bases de la programmation orientée objet en Java, notamment l'encapsulation, les constructeurs, la validation des données et la manipulation d'objets indépendants.
<img width="960" height="540" alt="image" src="https://github.com/user-attachments/assets/4f4f08b8-1a40-4bbb-8404-10d67bb48bb1" />
