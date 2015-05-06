package fernuni.obj.ea4.a1;

public class Kreis implements Geometrieobjekt {

    @Override
    public void druckeEigenschaften() {
        System.out.println("Ist geschlossen");
        System.out.println("Immer gleicher Radius von Mittelpunkt zum Rand");
        System.out.println("Einen Kreis zeichnet man mit einem Zirkel");
        System.out.println("Hat keine Ecken");
    }

}
