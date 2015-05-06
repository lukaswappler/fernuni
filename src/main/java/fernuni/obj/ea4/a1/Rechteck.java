package fernuni.obj.ea4.a1;

public class Rechteck implements Geometrieobjekt {

    @Override
    public void druckeEigenschaften() {
        System.out.println("Vier Ecken");
        System.out.println("Vier Symetrieachsen");
        System.out.println("Vier Seiten");
        System.out.println("Ist punktsymetrisch");
    }

}
