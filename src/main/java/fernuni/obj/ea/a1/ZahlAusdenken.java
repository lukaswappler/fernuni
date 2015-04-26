package fernuni.obj.ea.a1;

public class ZahlAusdenken {
	
	//Analysiert die übergebene Zahl
	public static void main(String[] args) {
		
		/**
		 * Der beim functionsaufruf übergebene Wert wird versucht zu einer Zahl zu parsen.
		 * Von der Zahl wird der Betrag gebildet und 2 addiert  
		 */
		
		/**
		 * ERRORHANDLING
		 * Felder werden initialisiert
		 * Im Fehlerfalle wird das programm mit ergebnis=-1, dadurch wird die switch case anweisung im defaul genutzt.
		 * Bei der Eingabe der Startzahl ist dann auch nochmal eine kleine Anpassung notwendig gewesen
		 * 
		 * For input string: ""
		 * Fehler!
		 * Eingabe war ungültig
		 */
		int ergebnis = 0;
		int startzahl = 0;
		try {
			startzahl = Integer.parseInt(args[0]);
			ergebnis = startzahl;
			
			if (ergebnis > 0) {
				ergebnis = ergebnis + 2;
			} else {
				ergebnis = ergebnis * (-1) + 2;
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			ergebnis = -1;
		} catch (NumberFormatException e) {
			System.out.println(e);
			ergebnis = -1;
		}	
		
		
		
		//Schrittweise 2 abziehen bis Zahl kleiner 2 ist
		while (ergebnis > 2) {
			ergebnis = ergebnis - 2;
		}
		
		/**
		 * Dieser Block hat keinerlei auswirkung auf das Programm.
		 * Es wird eine Schleife in zweischritten druchlaufen. insgesamt 10x
		 */
		int arbeiten = 4;
		for (int i = 2; i <= 20; i = i + 2) {
			arbeiten = arbeiten + startzahl;
		}
		
		/**
		 * Das Ergebnis wird ausgewerte und es werden entsprechende Ausgaben gemacht.
		 * Dabei wird 0 und default nie erreicht.
		 */
		switch (ergebnis) {
		case 0:
			System.out.println("Das kann nicht sein!");
			break;
		case 1:
			System.out.println("Die urspruengliche Zahl war ungerade!");
			break;
		case 2:
			System.out.println("Die urspruengliche Zahl war gerade!");
			break;
		default:
			System.out.println("Fehler!");
		}
		
		if (ergebnis != -1) {
			//die ursprünglich eingebene Zahl wird ausgeben.
			System.out.println("startzahl = " + startzahl);
		} else {
			System.out.println("Eingabe war ungültig");
		}
	}
}
