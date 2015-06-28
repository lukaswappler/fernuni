Philosopackage fernuni.obj.ea6.a3;

import fernuni.obj.ea6.a3.Tisch.Schuessel;

public class Philosoph extends Thread {
	
	private boolean isAlive = true;

	private String philosophName;
	
	private Schuessel choosenBowl;
	
	private PhilosophState state;
	
	boolean hasLeftBar = false;
	boolean hasRightBar = false;

	boolean isInterrupted = false;
	
	private Tisch choosenTable;
	
	public Philosoph(String philosophName) {
		this.philosophName = philosophName;		
		state = PhilosophState.philosophierend;
		
		System.out.println("Philosoph '" + philosophName +"' kommt zurück ins Leben." );
	}
	
	public void run() {		
		
		synchronized(this){
		
			while(isAlive && !isInterrupted) {
				
				try {
					waitSomeTime();					
					
					//leave bar if no seat is free
					if (choosenBowl == null) {
						System.out.println(philosophName + " hat keine frei Schuessel gefunden und geht wieder nach Hause");
						isAlive = false;
						return;
					}
					
					if (PhilosophState.philosophierend.equals(state)) {					
						handlePhilosophierendState();
						continue;
					}
					
					if (PhilosophState.hungrig.equals(state)) {
						handleHungrigState();
						continue;																																
					}
					
					if (PhilosophState.essend.equals(state)) {										
						handleEssendState();
						continue;
					}
					
				} catch (InterruptedException e) {					
					isInterrupted = true;
				}
			}
		}
	}

	private void handlePhilosophierendState() {
		state = PhilosophState.hungrig;
		System.out.println(philosophName + " hat genug philosophiert und ist jetzt hungrig");
	}

	private void handleHungrigState() {
		if (!hasLeftBar && this.choosenBowl.getLeftBar().isUsed()) {
			System.out.println(philosophName + " wartet auf linkes Stäbchen");
			return;
		} else if (!hasLeftBar && !this.choosenBowl.getLeftBar().isUsed()) {
			this.choosenBowl.getLeftBar().setUsed(true);
			hasLeftBar = true;
			System.out.println(philosophName + " hat das linke Stäbchen");
			return;
		}
		
		if (!hasRightBar && this.choosenBowl.getRightBar().isUsed()) {
			System.out.println(philosophName + " wartet auf rechtes Stäbchen");
			return;
		} else if (!hasRightBar && !this.choosenBowl.getRightBar().isUsed()) {
			this.choosenBowl.getRightBar().setUsed(true);
			hasRightBar = true;
			System.out.println(philosophName + " hat das rechte Stäbchen");
			return;
		}

		if (hasLeftBar && hasRightBar) {
			this.state = PhilosophState.essend;
			System.out.println(philosophName + " hat beide Stabchen uns isst");
			return;
		}		
	}
	
	private void handleEssendState() {
		if (hasLeftBar) {					
			this.choosenBowl.getLeftBar().setUsed(false);
			hasLeftBar = false;
			System.out.println(philosophName + " legt das linke Stäbchen hin");
			
			notifyAll();
			
			return;
		}
		
		if (hasRightBar) {
			this.choosenBowl.getRightBar().setUsed(false);
			hasRightBar = false;
			System.out.println(philosophName + " legt das rechte Stäbchen hin");
			
			notifyAll();
			return;

		}
		
		if (!hasLeftBar && !hasRightBar) {
			state = PhilosophState.philosophierend;
			System.out.println(philosophName + " hat lange genug gegessen, seine Stäbchen hingelegt und ist philosophiert jetzt wieder");

			return;
		}
	}

	

	private void waitSomeTime() throws InterruptedException {
		this.wait( (int) (Math.random() * 10000));		
	}
	
	public void sitDownAndchooseBowlOnTheTable(Tisch tisch) {
		Schuessel freeBowl = tisch.getFreeBowl();
		
		if (freeBowl != null) {
			freeBowl.setIsUsedFrom(this);
			
			tisch.getGuests().add(this);
			
			this.choosenBowl = freeBowl;
			this.choosenTable = tisch;
			
			System.out.println(philosophName + " hat sich an den Tisch gesetzt und Schuessel '" + String.valueOf(freeBowl.getBowlNumber()) +"' bekommen.");
		} else {
			System.out.println(philosophName + " kam zu spaet und hat keinen Sitzplatz mehr bekommen");
		}
	}
	
	public String getPhilosophName() {
		return philosophName;
	}

	public void setPhilosophName(String philosophName) {
		this.philosophName = philosophName;
	}
	
	public enum PhilosophState {
		philosophierend,
		hungrig,
		essend;
	}
}