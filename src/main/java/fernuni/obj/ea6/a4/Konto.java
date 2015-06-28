package fernuni.obj.ea6.a4;

class Konto {
    private int kontoStand = 0;

	synchronized public void einzahlen(int betrag) {
        int hilfsvariable = kontoStand;
        hilfsvariable = hilfsvariable + betrag;
        kontoStand = hilfsvariable;
    }
	
	synchronized public int getKontoStand() {
		return kontoStand;
	}

	synchronized public void setKontoStand(int kontoStand) {
		this.kontoStand = kontoStand;
	}
}