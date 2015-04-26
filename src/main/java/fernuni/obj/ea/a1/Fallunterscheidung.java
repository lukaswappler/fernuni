package fernuni.obj.ea.a1;

public class Fallunterscheidung {
	
	
	public static void main(String[] args) {
	
		if (args != null && args.length == 1) {
			
			String geometrischeForm = args[0];
			
			switch (geometrischeForm) {
			case "Strecke":
				print("Ist nicht geschlossen");
				print("Verbindet Zwei Punkte miteinander");
				print("Kürzeste Verbindung zweier Endpunkte");
				print("Hat keine Ecken");
			
				break;
			case "Dreieck":
				
				print("Drei Ecken");
				print("Ist geschlossen");
				print("Drei Seiten");
				print("Alle Winkel ergeben 180 Grad");
				
				break;
			case "RechtwinkligesDreieck":
				
				print("Drei Ecken");
				print("Ist geschlossen");
				print("Drei Seiten");
				print("Satz des Pythagoras anwendbar");
				print("Alle Winkel ergeben 180 Grad");
				
				break;
			case "Kreis":
				
				print("Ist geschlossen");
				print("Immer gleicher Radius von Mittelpunkt zum Rand");
				print("Einen Kreis zeichnet man mit einem Zirkel");
				print("Hat keine Ecken");
				
				break;
			case "Ellipse":
				
				print("Ist geschlossen");
				print("Radius von Mittelpunkt zum Rand ist unterschiedlich");
				print("Hat zwei Brennpunkte");
				print("Zwei Symetrieachsen");
				
				break;
			case "Viereck":
				
				print("Vier Ecken");
				print("Vier Symetrieachsen");
				print("Vier Seiten");
				print("Ist punktsymetrisch");
				
				break;
			case "Secheck":
				
				print("Sechs Ecken");
				print("Sechs Symetrieachsen");
				print("Sechs Seiten");
				print("Ist punktsymetrisch");
				break;
				
			case "Parallelogramm":
				
				print("Vier Ecken");
				print("Zwei Symetrieachsen");
				print("Ist geschlossen");
				print("Vier Seiten");
				
				break;
			case "Raute":
				
				print("Vier Ecken");
				print("Zwei Symetrieachsen");
				print("Ist geschlossen");
				print("Vier Seiten");
				
				break;
			case "Trapez":
				
				print("Vier Ecken");
				print("Eine Symetrieachsen");
				print("Ist geschlossen");
				print("Vier Seiten");
				
				break;

			default:
				System.out.println("Die angebene Form ist nicht vorhanden");
				break;
			}			
			
		} else {
			System.out.println("Ungültige Eingabeparameter, bitte genau eine Zeichenketter übergeben");
		}
		
	}
	
	private static void print(String ausgabe) {
		System.out.println(ausgabe);
	}
	
	
}
