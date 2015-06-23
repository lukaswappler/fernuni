package fernuni.obj.ea6.a4;

class NochEinThread extends EinThread {
    public NochEinThread(String s, Konto k) {
        super(s, k);
    }

    public void run() {
        while (true) {
            /*** 1 ***/
            yield();
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
            }
        }
    }
}
