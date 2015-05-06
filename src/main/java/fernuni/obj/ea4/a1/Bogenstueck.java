package fernuni.obj.ea4.a1;

public class Bogenstueck implements Geometrieobjekt {

    @Override
    public void druckeEigenschaften() {
        System.out.println("Ist nicht geschlossen");
        System.out.println("Ist keine Gerade");
        System.out.println("Hat einen Anfang und einen Endpunkt");
        System.out.println("Hat keine Ecken");
    }
}
