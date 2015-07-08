package fernuni.obj.ea6.a3c;

import java.util.ArrayList;
import java.util.List;

import fernuni.obj.ea6.a3c.Philosoph.PhilosophState;
import fernuni.obj.ea6.a3c.Tisch.Schuessel;

public class Aufsichtsperson  extends Thread {
	
	Tisch table;
	
	List<Philosoph> queue = new ArrayList<Philosoph>();
		
	List<Philosoph> registeredPhilosophs = new ArrayList<Philosoph>();
	
	public Aufsichtsperson(Tisch tisch) {
		table = tisch;
	}

	public void run() {	
		
		while (true) {
			try {
				waitSomeTime();
				
				System.out.println("Aufsichtsperson prüft den status");
				
				for (Philosoph philosoph : registeredPhilosophs) {
					if (philosoph.getPhilosophState().equals(PhilosophState.wartend) && philosoph.getChoosenBowl() == null) {
						if (!queue.contains(philosoph)) {
							queue.add(philosoph);
							
							System.out.println("Aufseher setzt " + philosoph.getPhilosophName() + " in die Wartschlange");
						}
					}
				}
				
				while (table.getGuests().size() < 4) {
					Schuessel freeBowl = table.getFreeBowl();
					
					if (freeBowl != null && queue.size() > 0) {
						Philosoph nextPhilo = queue.remove(0);
						nextPhilo.setChoosenBowl(freeBowl);
						nextPhilo.setChoosenTable(table);
						
						freeBowl.setIsUsedFrom(nextPhilo);	
						table.getGuests().add(nextPhilo);
						
						System.out.println("Aufseher setzt " + nextPhilo.getPhilosophName() + " an Schueesel " + freeBowl.getBowlNumber()); 
					}
				}
				
				System.out.println("Aufsicht: Aktuell " + queue.size() + " Philosophen in der Wartschlange");
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}
	}
	
	public void register(Philosoph philosoph) {
		registeredPhilosophs.add(philosoph);
		queue.add(philosoph);		
	}
	
	
	private void waitSomeTime() throws InterruptedException {
		Thread.sleep( (int) (Math.random() * 10000));		
	}
}
