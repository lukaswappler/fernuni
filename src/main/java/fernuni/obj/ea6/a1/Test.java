package fernuni.obj.ea6.a1;

class Test extends Thread {
    public void run() {
        while (true) {
            System.out.println("Hallo, ich komme.");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Zum Beenden Enter-Taste druecken
    void dotry() {
        try {
            while (System.in.read() == 0) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Ich gehe. Auf Wiedersehen!");
    }
}