package fernuni.obj.ea4.a1.copy;

public class Rechteck extends Geschlossen implements Geometrieobjekt {

    @Override
    public void druckeEigenschaften() {
    	super.druckeEigenschaften();
    	
    	System.out.println("Vier Ecken");
        System.out.println("Vier Symetrieachsen");
        System.out.println("Vier Seiten");
        System.out.println("Ist punktsymetrisch");
          
    }

}
