package fernuni.obj.ea4.a1.copy;

public class Geometrieobjektverwaltung {
    public static void main(String[] args) {
        Geometrieobjekt geometrieobjekt = null;
        if (args[0].equals("Kreis"))
            geometrieobjekt = new Kreis();
        if (args[0].equals("Bogenstueck"))
            geometrieobjekt = new Bogenstueck();
        if (args[0].equals("Rechteck"))
            geometrieobjekt = new Rechteck();
        /* ... */
        if (geometrieobjekt == null) {
            System.out.println("Ein " + args[0] + " ist bisher nicht implementiert");
        } else {
            geometrieobjekt.druckeEigenschaften();
        }
    }
}