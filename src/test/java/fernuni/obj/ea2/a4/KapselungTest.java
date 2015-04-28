package fernuni.obj.ea2.a4;

import org.junit.Test;

import de.wap.fernuni.ea2.aufgabe4.Mitarbeiter;
import de.wap.fernuni.ea2.aufgabe4.chefetage.Chef;
import de.wap.fernuni.ea2.aufgabe4.chefetage.ChefSekretaerin;

public class KapselungTest {

    @Test
    public void testIt () {
        
        Chef chef = new Chef();
        Chef chef2 = new Chef();
        ChefSekretaerin chefSekretaerin = new ChefSekretaerin();
        
        Mitarbeiter mitarbeiter = new Mitarbeiter();
        
        
        
        mitarbeiter.readNextAppointment(chef);
        
        chefSekretaerin.setNextAppointment(chef, "Morgen");
        chef.setNextAppointment(chef, "Morgen");
        
        
        
    }
    
}
