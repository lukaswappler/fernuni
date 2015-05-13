package fernuni.obj.ea4.a1.copy;

public class Bogenstueck extends Offen implements Geometrieobjekt {

    @Override
    public void druckeEigenschaften() {
    	super.druckeEigenschaften();
    	
        System.out.println("Ist keine Gerade");
        System.out.println("Hat einen Anfang und einen Endpunkt");
        System.out.println("Hat keine Ecken");
        System.out.println("Ist nicht punktsymetrisch");
    }
}
