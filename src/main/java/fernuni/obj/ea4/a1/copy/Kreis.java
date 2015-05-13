package fernuni.obj.ea4.a1.copy;

public class Kreis extends Geschlossen implements Geometrieobjekt {

    @Override
    public void druckeEigenschaften() {
    	super.druckeEigenschaften();
    	           
        System.out.println("Immer gleicher Radius von Mittelpunkt zum Rand");
        System.out.println("Einen Kreis zeichnet man mit einem Zirkel");
        System.out.println("Hat keine Ecken");
        System.out.println("Ist punktsymetrisch");
    }

}
