package fernuni.obj.ea6.a4;

class Konto {
    int kontoStand = 0;

    public void einzahlen(int betrag) {
        int hilfsvariable = kontoStand;
        hilfsvariable = hilfsvariable + betrag;
        kontoStand = hilfsvariable;
    }
}