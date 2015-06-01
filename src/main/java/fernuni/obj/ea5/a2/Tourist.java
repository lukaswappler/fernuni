package fernuni.obj.ea5.a2;

//Der View
class Tourist implements Fahnenbeobachter {
    private String name = "Unbekannt";

    public Tourist(String name) {
        this.name = name;
    }

    public void fahnenstatusGeaendert(Fahnenmast fahnenmast) {
        System.out.println(name + " vermeldet fuer den Fahnenmast: " + fahnenmast.getFahnenposition());
    }
}