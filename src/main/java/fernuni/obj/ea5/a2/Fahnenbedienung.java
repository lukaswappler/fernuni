package fernuni.obj.ea5.a2;

class Fahnenbedienung {
    private Fahnenmast fahnenmast;

    public Fahnenbedienung(Fahnenmast fahnenmast) {
        this.fahnenmast = fahnenmast;
    }

    public void aendereBeflaggung(Fahnenposition fahnenposition) {
        fahnenmast.setStatus(fahnenposition);
    }
}
