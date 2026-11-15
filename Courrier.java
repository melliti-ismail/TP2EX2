package Courier;
public class Courrier {
    public static final double TARIF_DE_BASE = 0.5;

    protected boolean express;
    protected String adresseDestination;

    public Courrier(boolean express, String adresseDestination) {
        this.express = express;
        this.adresseDestination = adresseDestination;
    }

    public boolean estValide() {
        return this.adresseDestination != null && !this.adresseDestination.trim().isEmpty();
    }

    public void decrire() {
        System.out.println("Adresse de destination : " + (adresseDestination != null ? adresseDestination : "Inconnue"));
        System.out.println("Mode d'expédition : " + (express ? "Express" : "Normal"));
        System.out.println("Valide : " + (estValide() ? "Oui" : "Non"));
    }

    public double affranchir() {
        if (!estValide()) {
            return 0.0;
        }
        double montant = TARIF_DE_BASE;
        if (express) {
            montant *= 2;
        }
        return montant;
    }
}