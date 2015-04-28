package fernuni.obj.ea2.a4.chefetage;

public class Chef {
    protected String naechsterTermin;
    
    public String getNaechsterTermin() {
        return naechsterTermin;
    }
    
    protected void setNaechsterTermin(String termin) {
        naechsterTermin = termin;
    }
    
    public void setNextAppointment(Chef chef, String naechsterTermin) {
        chef.naechsterTermin = naechsterTermin;
    }
}
