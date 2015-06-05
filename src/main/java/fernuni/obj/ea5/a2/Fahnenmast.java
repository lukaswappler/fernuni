package fernuni.obj.ea5.a2;

import java.util.ArrayList;
import java.util.List;

class Fahnenmast {
	
	List<Fahnenbeobachter> observers = new ArrayList<Fahnenbeobachter>();
	Fahnenposition fahnenposition = Fahnenposition.UNBEFLAGGT;
	
    public void addFahnenbeobachter(Fahnenbeobachter neuerbeobachter) {
        // Hinzufuegen eines Fahnenbeobachters. Um die Beobachter zu verwalten,
        // koennte eine java.util.ArrayList dienen.
    	observers.add(neuerbeobachter);
    }

    public void removeFahnenbeobachter(Fahnenbeobachter neuerbeobachter) {
        // Entfernen eines Fahnenbeobachters.
    	observers.remove(neuerbeobachter);
    }

    public void setStatus(Fahnenposition fahnenposition) {
        // Aendern des Fahnenstatus. Die Fahnenbeobachter sollten hierueber
        // informiert werden.
    	this.fahnenposition = fahnenposition;
    	
    	for (Fahnenbeobachter fahnenbeobachter : observers) {
    		fahnenbeobachter.fahnenstatusGeaendert(this);    		    		
    	}
    }

    public Fahnenposition getFahnenposition() {
        return fahnenposition;
        // Zurueckgeben der aktuellen Fahnenposition
    }
}