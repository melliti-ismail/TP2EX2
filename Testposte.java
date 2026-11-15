package Courier;
public class Testposte {
    public static void main(String[] args) {
        BoiteCourrier maBoite = new BoiteCourrier(5);
        Courrier l1 = new Lettre(false, "12 Avenue Habib Bourguiba, Tunis", 150, "A4");
        Courrier l2 = new Lettre(true, "5 Rue de la Liberté, Sfax", 500, "A3");
        Courrier c1 = new Colis(false, "Zone Industrielle, Sousse", 5000, 10.0);
        Courrier c2 = new Colis(true, null, 2000, 5.0);
        Courrier cour = new Courrier(false, "Bizerte Principal");
        maBoite.ajouterCourrier(l1);
        maBoite.ajouterCourrier(l2);
        maBoite.ajouterCourrier(c1);
        maBoite.ajouterCourrier(c2);
        maBoite.ajouterCourrier(cour);
        maBoite.afficher();
    }
}