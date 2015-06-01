package fernuni.obj.ea5.a2;

public class Fahnentest {
    public static void main(String[] args) {
        Fahnenmast meinFahnenmast = new Fahnenmast();
        Fahnenbedienung bedienung1 = new Fahnenbedienung(meinFahnenmast);
        Fahnenbedienung bedienung2 = new Fahnenbedienung(meinFahnenmast);
        Fahnenbeobachter anna = new Tourist("Anna");
        Fahnenbeobachter bernd = new Tourist("Bernd");
        Fahnenbeobachter charly = new Tourist("Charly");
        bedienung1.aendereBeflaggung(Fahnenposition.OBEN);
        meinFahnenmast.addFahnenbeobachter(bernd);
        bedienung1.aendereBeflaggung(Fahnenposition.HALBMAST);
        meinFahnenmast.addFahnenbeobachter(anna);
        meinFahnenmast.addFahnenbeobachter(charly);
        meinFahnenmast.removeFahnenbeobachter(bernd);
        bedienung2.aendereBeflaggung(Fahnenposition.UNBEFLAGGT);
        bedienung2.aendereBeflaggung(Fahnenposition.OBEN);
        meinFahnenmast.addFahnenbeobachter(bernd);
    }
}