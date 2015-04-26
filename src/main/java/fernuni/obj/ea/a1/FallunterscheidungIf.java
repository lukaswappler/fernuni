package fernuni.obj.ea.a1;

public class FallunterscheidungIf {
	
	public static void main(String[] args) {
	
		if (args != null && args.length == 1) {
			
			String geometrischeForm = args[0];
			
			if ("Strecke".equals(geometrischeForm)) {			
				print("Ist nicht geschlossen");
				print("Verbindet Zwei Punkte miteinander");
				print("Kürzeste Verbindung zweier Endpunkte");
				print("Hat keine Ecken");
			} 
			else if ("Dreieck".equals(geometrischeForm)) {							
				print("Drei Ecken");
				print("Ist geschlossen");
				print("Drei Seiten");
				print("Alle Winkel ergeben 180 Grad");
				
			} 
			else if ("RechtwinkligesDreieck".equals(geometrischeForm)) {			
				print("Drei Ecken");
				print("Ist geschlossen");
				print("Drei Seiten");
				print("Satz des Pythagoras anwendbar");
				print("Alle Winkel ergeben 180 Grad");
			} 
			else if ("Kreis".equals(geometrischeForm)) {
				print("Ist geschlossen");
				print("Immer gleicher Radius von Mittelpunkt zum Rand");
				print("Einen Kreis zeichnet man mit einem Zirkel");
				print("Hat keine Ecken");
			} 
			else if ("Ellipse".equals(geometrischeForm)) {
				print("Ist geschlossen");
				print("Radius von Mittelpunkt zum Rand ist unterschiedlich");
				print("Hat zwei Brennpunkte");
				print("Zwei Symetrieachsen");
				
			} 
			else if ("Viereck".equals(geometrischeForm)) {
				print("Vier Ecken");
				print("Vier Symetrieachsen");
				print("Vier Seiten");
				print("Ist punktsymetrisch");
				
			} 
			else if ("Secheck".equals(geometrischeForm)) {
				print("Sechs Ecken");
				print("Sechs Symetrieachsen");
				print("Sechs Seiten");
				print("Ist punktsymetrisch");
			} 
			else if ("Parallelogramm".equals(geometrischeForm)) {
				print("Vier Ecken");
				print("Zwei Symetrieachsen");
				print("Ist geschlossen");
				print("Vier Seiten");
			} 
			else if ("Raute".equals(geometrischeForm)) {
				print("Vier Ecken");
				print("Zwei Symetrieachsen");
				print("Ist geschlossen");
				print("Vier Seiten");
			} 
			else if ("Trapez".equals(geometrischeForm)) {
				print("Vier Ecken");
				print("Eine Symetrieachsen");
				print("Ist geschlossen");
				print("Vier Seiten");				
			} 		
			else  {			
				System.out.println("Die angebene Form ist nicht vorhanden");
			}			
			
		} else {
			System.out.println("Ungültige Eingabeparameter, bitte genau eine Zeichenketter übergeben");
		}
		
	}
	
	private static void print(String ausgabe) {
		System.out.println(ausgabe);
	}
	
	
}
