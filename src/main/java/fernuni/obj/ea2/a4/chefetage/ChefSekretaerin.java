package fernuni.obj.ea2.a4.chefetage;

import fernuni.obj.ea2.a4.Mitarbeiter;

public class ChefSekretaerin {

	public String getNextAppointment(Chef c) {
		return c.getNextAppointment();
	}
	
	public void setMitarbeiterBudget(Mitarbeiter m, int budget) {
		m.budget.budget = budget;
	}
	
	public int getMitarbeiterBudget(Mitarbeiter m) {
		return m.getBudget();
	}
	
	public void setNextChefTermin(Chef m, String nextAppointment) {
		m.naechsterTermin = nextAppointment;
	}
}
