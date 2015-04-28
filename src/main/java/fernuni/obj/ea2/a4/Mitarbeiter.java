package fernuni.obj.ea2.a4;

import fernuni.obj.ea2.a4.chefetage.Chef;
import fernuni.obj.ea2.a4.chefetage.MitarbeiterBudget;


public class Mitarbeiter {
    public MitarbeiterBudget budget;
    
    public int getBudget() {        	
    	return budget.getBudget();				
	}
    
    public void setBudget(int budget) throws Exception {    	
    	
    	throw new Exception("I have no access to set my Budget");
    }
   
    public void setNextChefTermin(Chef m, String nextAppointment) throws Exception {
    	throw new Exception("I have no access to set next appoitnment of a chef");
	}
}