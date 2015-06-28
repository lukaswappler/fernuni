package fernuni.obj.ea6.a3c;

import java.util.ArrayList;
import java.util.List;

public class Tisch {
	
	private Stab[] staebchen = new Stab[5];
	private Schuessel[] schuesseln = new Schuessel[5];
	
	private List<Philosoph> guests = new ArrayList<>();	
	
	public Tisch() {
		super();
		
		for (int i = 0; i < staebchen.length; i++) {
			staebchen[i] = new Stab();
		}
		for (int i = 0; i < schuesseln.length; i++) {
			schuesseln[i] = new Schuessel(i + 1);
			
			//set the related bars for the bowls
			if (i != 4) {
				schuesseln[i].setLeftBar(staebchen[i]);
				schuesseln[i].setRightBar(staebchen[i + 1]);				
			} else {
				schuesseln[i].setLeftBar(staebchen[i]);
				schuesseln[i].setRightBar(staebchen[0]);
			}
		}
	}

	public class Schuessel {
		
		private int bowlNumber;
		private Stab leftBar;
		private Stab rightBar;
		private Philosoph isUsedFrom;

		public Schuessel(int bowlNumber) {
			this.setBowlNumber(bowlNumber);
		}
		
		public Philosoph getIsUsedFrom() {
			return isUsedFrom;
		}

		public void setIsUsedFrom(Philosoph isUsedFrom) {
			this.isUsedFrom = isUsedFrom;
		}

		public Stab getRightBar() {
			return rightBar;
		}

		public void setRightBar(Stab rightBar) {
			this.rightBar = rightBar;
		}

		public Stab getLeftBar() {
			return leftBar;
		}

		public void setLeftBar(Stab leftBar) {
			this.leftBar = leftBar;
		}

		public int getBowlNumber() {
			return bowlNumber;
		}

		public void setBowlNumber(int bowlNumber) {
			this.bowlNumber = bowlNumber;
		}
		
	}


	public class Stab {
		private boolean used;

		public boolean isUsed() {
			return used;
		}

		public void setUsed(boolean used) {
			this.used = used;
		}
	}


	public Schuessel getFreeBowl() {
		List<Schuessel> freeBowls = new ArrayList<Tisch.Schuessel>(); 
		
		for (int i = 0; i < this.schuesseln.length; i++) {
			if (schuesseln[i].isUsedFrom == null) {								
				freeBowls.add(schuesseln[i]); 
			}
		}
		
		//get randomized free bowl;
		if (freeBowls.size() > 0) {
			int randomIndex = (int) ((Math.random() * 10) % freeBowls.size());
			return freeBowls.get(randomIndex);			
		} else {
			return null;
		}
	}


	public List<Philosoph> getGuests() {
		return guests;
	}
		
}