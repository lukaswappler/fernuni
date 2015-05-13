package fernuni.obj.ea3.a3;

public enum Dienstgrade {

    HELFER("Helfer"),

    TRUPPFUEHRER("Truppfuehrer"),

    GRUPPENFUEHRER("Gruppenfuehrer"),

    ZUGTRUPPFUEHER("Zugtruppfuehrer"),

    ZUGFUEHRER("Zugfuehrer");

    String label;

    Dienstgrade(String label) {
        this.label = label;
    }

    public static void main(String[] args) {
        printAll();
        System.out.println(HELFER.istVorgesetzterVor(GRUPPENFUEHRER));
        System.out.println(TRUPPFUEHRER.istVorgesetzterVor(HELFER));
        System.out.println(GRUPPENFUEHRER.istVorgesetzterVor(GRUPPENFUEHRER));
    }

    public static void printAll() {
        Dienstgrade[] values = Dienstgrade.values();
        for (Dienstgrade dienstgrad : values) {
            System.out.println(String.valueOf(dienstgrad.getLabel()));
        }
    }

    public boolean istVorgesetzterVor(Dienstgrade grad) {

        if (this.compareTo(grad) > 0) {
            return true;
        }

        return false;

    }

    public String getLabel() {
        return this.label;
    }

}
