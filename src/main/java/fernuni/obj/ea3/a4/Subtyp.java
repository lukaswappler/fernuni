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
		public void entferneSofort();
	}
	
	abstract class Peripheriegeraet {
		public void leseInventarisierungsnummer() {
			
		}
	}
	
	abstract class Eingabegeraet extends Peripheriegeraet {
		public void sendeErneutLetzteEingabe() {
			
		}
	}
	
	abstract class Ausgabegerät extends Peripheriegeraet {
		public void wiederholeLetzteAusgabe() {
			
		}
	}

	
	class Monitor extends Ausgabegerät implements UnverzichtbaresGerät {
	
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
	
	class Scanner extends Eingabegeraet implements ImBetriebEntfernbaresGerät  {
	
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

		@Override
		public void entferneSofort() {
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

		@Override
		public void entferneSofort() {
			// TODO Auto-generated method stub
			
		}
	
	}
	
	class Kamera extends Eingabegeraet implements VerzichtbaresGerät {
		public void macheFoto() {
			
		}

		@Override
		public void istAngeschlossen() {
			// TODO Auto-generated method stub
			
		}
	}
	
	
	class Drucker extends Ausgabegerät implements ImBetriebEntfernbaresGerät  {
	
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

		@Override
		public void entferneSofort() {
			// TODO Auto-generated method stub
			
		}
	
	}
}
