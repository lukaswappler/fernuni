package fernuni.obj.ea6.a4;

public class GemeinsameVariablen {
    public static void main(String[] args) {
        Konto k1 = new Konto();
        Konto k2 = new Konto();
        Thread threadPit = new EinThread("Pit", k1);
        Thread threadTom = new EinThread("Tom", k2);
        Thread threadEva = new NochEinThread("Eva", k1);
        threadPit.start();
        threadTom.start();
        threadEva.start();
    }
}