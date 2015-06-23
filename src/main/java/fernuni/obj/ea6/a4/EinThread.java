package fernuni.obj.ea6.a4;

class EinThread extends Thread {
    static int nummer = 0;
    String name;
    Konto meinKonto;

    public EinThread(String s, Konto k) {
        nummer++;
        name = s;
        meinKonto = k;
    }

    public void run() {
        boolean bv = true;
        while (bv) {
            meinKonto.einzahlen(20);
            yield();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}