package Courier;
public class Colis extends Courrier {
    private double poids;
    private double volume; 
    public Colis(boolean express, String adresseDestination, double poids, double volume) {
        super(express, adresseDestination);
        this.poids = poids;
        this.volume = volume;
    }

    @Override
    public void decrire() {
        super.decrire();
        System.out.println("Type : Colis");
        System.out.println("Poids : " + poids + " g");
        System.out.println("Volume : " + volume + " L");
        System.out.println("Montant d'affranchissement : " + affranchir() + " dinars");
        System.out.println("-----------------------------------");
    }

    @Override
    public double affranchir() {
        if (!estValide()) {
            return 0.0;
        }

        double poidsKilos = poids / 1000.0;
        double montant = (0.25 * volume) + (poidsKilos * 1.0);
        if (express) {
            montant *= 2;
        }

        return montant;
    }
}