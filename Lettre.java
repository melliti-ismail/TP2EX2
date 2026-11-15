package Courier;
public class Lettre extends Courrier {
    private double poids; 
    private String format;
    public Lettre(boolean express, String adresseDestination, double poids, String format) {
        super(express, adresseDestination);
        this.poids = poids;
        this.format = format;
    }
    @Override
    public void decrire() {
        super.decrire();
        System.out.println("Type : Lettre");
        System.out.println("Format : " + format);
        System.out.println("Poids : " + poids + " g");
        System.out.println("Montant d'affranchissement : " + affranchir() + " dinars");
        System.out.println("-----------------------------------");
    }

    @Override
    public double affranchir() {
        if (!estValide()) {
            return 0.0;
        }

        double tarifBaseLettre = 0.0;
        if ("A4".equalsIgnoreCase(format)) {
            tarifBaseLettre = 2.50;
        } else if ("A3".equalsIgnoreCase(format)) {
            tarifBaseLettre = 3.50;
        }
        double poidsKilos = poids / 1000.0;
        double montant = tarifBaseLettre + (0.5 * poidsKilos);
        if (express) {
            montant *= 2;
        }
        return montant;
    }
}