package fernuni.obj.ea3.a4;
public class Subtyp {
		
	interface UnverzichtbaresGerät {
		public void berechneBetriebsdauer();
	}
	
	interface VerzichtbaresGerät {
		public void istAngeschlossen();
	}
	
	interface USBGeraet {
		public void leseUSBSteckertyp();
	}
	
	interface ImBetriebEntfernbaresGerät extends USBGeraet, VerzichtbaresGerät {
		
	}
	
	abstract class Peripheriegeraet {
		public void leseInventarisierungsnummer() {
			
		}
	}
	
	abstract class Eingabegeraet extends Peripheriegeraet {
		public void sendeErneutLetzteEingabe() {
			
		}
	}

	
	class Monitor extends Peripheriegeraet implements UnverzichtbaresGerät {
	
		public void leseBildauflösung() {
			
		}
	
		@Override
		public void berechneBetriebsdauer() {
			// TODO Auto-generated method stub
			
		}
		
		
	}
	
	class Tastatur extends Eingabegeraet implements UnverzichtbaresGerät, USBGeraet {
	
		public void leseLetztesZeichen() {
			
		}
		
		@Override
		public void berechneBetriebsdauer() {
			// TODO Auto-generated method stub
			
		}
	
		@Override
		public void leseUSBSteckertyp() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class Scanner extends Peripheriegeraet implements ImBetriebEntfernbaresGerät  {
	
		public void starteScan() {
			
		}
		
		@Override
		public void leseUSBSteckertyp() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void istAngeschlossen() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class Maus extends Eingabegeraet implements ImBetriebEntfernbaresGerät  {
	
		public void leseAktuelleKoordinaten() {
			
		}
		
		@Override
		public void leseUSBSteckertyp() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void istAngeschlossen() {
			// TODO Auto-generated method stub
			
		}
	
	}
	
	class Kamera extends Peripheriegeraet {
		public void macheFoto() {
			
		}
	}
	
	
	class Drucker extends Peripheriegeraet implements ImBetriebEntfernbaresGerät  {
	
		public void leseTintenstand() {
			
		}
		
		@Override
		public void leseUSBSteckertyp() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void istAngeschlossen() {
			// TODO Auto-generated method stub
			
		}
	
	}


	
	
	
	
	
	public Subtyp() {
		super();
		// TODO Auto-generated constructor stub
		
		Drucker drucker = new Drucker();
		
		
		
	}
	
}
