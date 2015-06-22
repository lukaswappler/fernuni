package fernuni.obj.ea6.a3;

import fernuni.obj.ea6.a3.Tisch.Schuessel;

public class Philosoph extends Thread {
	
	private boolean isAlive = true;

	private String philosophName;
	
	private Schuessel choosenBowl;
	
	private PhilosophState state;
	
	public Philosoph(String philosophName) {
		this.philosophName = philosophName;		
		state = PhilosophState.philosophierend;
		
		System.out.println("Philosoph '" + philosophName +"' kommt zurück ins Leben." );
	}
	
	
	public void run() {		
		//TODO refactory this logic
		
		
		//TODO use notify or notify all
		
		//TODO
		
		while(isAlive) {
			
			try {
				if (choosenBowl == null) {
					System.out.println(philosophName + " hat keine frei Schuessel gefunden und geht wieder nach Hause");
					isAlive = false;
					continue;
				}
				
				if (PhilosophState.philosophierend.equals(state)) {
					Philosoph.sleep(getRandomWaitTime());
					state = PhilosophState.hungrig;
					System.out.println(philosophName + " hat genug philosophiert und ist jetzt hungrig");
					
					
				}
				
				if (PhilosophState.hungrig.equals(state)) {
					Philosoph.sleep(getRandomWaitTime());
					System.out.println(philosophName + " wartet auf linkes Stäbchen");					
					while(this.choosenBowl.getLeftBar().isUsed()) {
						Philosoph.sleep(getRandomWaitTime());						
					}
					this.choosenBowl.getLeftBar().setUsed(true);
					System.out.println(philosophName + " hat linkes Stäbchen");
					
					Philosoph.sleep(getRandomWaitTime());
					
					System.out.println(philosophName + " wartet auf rechtes Stäbchen");					
					while(this.choosenBowl.getRightBar().isUsed()) {
						Philosoph.sleep(getRandomWaitTime());						
					}
					this.choosenBowl.getRightBar().setUsed(true);
					System.out.println(philosophName + " hat rechtes Stäbchen");
					
					
					this.state = PhilosophState.essend;
					System.out.println(philosophName + " hat beide Stabchen uns isst");
					Philosoph.sleep(getRandomWaitTime());																			
				}
				
				
				
				if (PhilosophState.essend.equals(state)) {										
					this.choosenBowl.getLeftBar().setUsed(false);
					System.out.println(philosophName + " legt das linkes Stäbchen hin");
					Philosoph.sleep(getRandomWaitTime());
//					Philosoph.
					
					
					this.choosenBowl.getRightBar().setUsed(false);
					System.out.println(philosophName + " legt das rechte Stäbchen hin");
					Philosoph.sleep(getRandomWaitTime());
					
					state = PhilosophState.philosophierend;
					System.out.println(philosophName + " hat lange genug gegessen und ist philosophiert jetzt wieder");
					Philosoph.sleep(getRandomWaitTime());
				}
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private int getRandomWaitTime() {
		return (int) (Math.random() * 100000);		
	}
	
	public String getPhilosophName() {
		return philosophName;
	}

	public void setPhilosophName(String philosophName) {
		this.philosophName = philosophName;
	}


	public void sitDownAndchooseBowlOnTheTable(Tisch tisch) {
		Schuessel freeBowl = tisch.getFreeBowl();
		
		if (freeBowl != null) {
			freeBowl.setIsUsedFrom(this);
			
			this.choosenBowl = freeBowl;
			
			System.out.println(philosophName + " hat sich an den Tisch gesetzt und Schuessel '" + String.valueOf(freeBowl.getBowlNumber()) +"' bekommen.");
		} else {
			System.out.println(philosophName + " kam zu spaet und hat keinen Sitzplatz mehr bekommen");
		}
	}
	
	public enum PhilosophState {
		philosophierend,
		hungrig,
		essend;
	}


}