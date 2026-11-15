package Courier;
public class BoiteCourrier {
    private Courrier[] courriers;
    private int taille;
    public BoiteCourrier(int n) {
        courriers = new Courrier[n];
        taille = 0;
    }
    public boolean ajouterCourrier(Courrier c) {
        if (taille < courriers.length) {
            courriers[taille] = c;
            taille++;
            return true;
        }
        return false;
    }
    public double affranchir() {
        double montantTotal = 0.0;
        for (int i = 0; i < taille; i++) {
            if (courriers[i] != null) {
                montantTotal += courriers[i].affranchir();
            }
        }
        return montantTotal;
    }
    public int courriersInvalides() {
        int count = 0;
        for (int i = 0; i < taille; i++) {
            if (courriers[i] != null && !courriers[i].estValide()) {
                count++;
            }
        }
        return count;
    }
    public void afficher() {
        System.out.println("=== CONTENU DE LA BOITE AUX COURRIERS ===");
        for (int i = 0; i < taille; i++) {
            if (courriers[i] != null) {
                System.out.println("Courrier n°" + (i + 1) + " :");
                courriers[i].decrire();
                if (!courriers[i].estValide()) {
                    System.out.println("-> ATTENTION : Ce courrier est invalide (adresse nulle ou vide) !\n");
                }
            }
        }
        System.out.println("Nombre total de courriers invalides : " + courriersInvalides());
        System.out.println("Montant total d'affranchissement : " + affranchir() + " dinars");
    }
}
