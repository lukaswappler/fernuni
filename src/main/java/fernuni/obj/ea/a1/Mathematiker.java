package fernuni.obj.ea.a1;

public class Mathematiker {
	public static void main(String[] args) {
		try {
			try {
				int i = 7 % 5;
				//1. i ist 2 und i%2 ergiebt 0 und somit Division durch 0
				if ((i / (i % 2)) == 1) {					
					throw new Exception();
				}
				System.out.println("Ich mag");
			} catch (Exception e) {
				System.out.println("Ich liebe");
				try {
					// 1 / 1 == 1 
					if ((7 % 6 / (7 % 6 % 2)) == 1) {
						//Exception wird erzeugt
						throw new Exception();
					}
					System.out.println("nichts mehr, als");
				} catch (Exception u) {
					System.out.println("es,");
				}
			}
			System.out.println("wenn");
			try {
				//logische Verküpfung von true und false fürht zu false somit zu 1
				int i = true & false ? 0 : 1;
				switch (i) {
				case 0:
					System.out.println("eine Formel");
				case 1:
					//wird ausgegeben aber break fehlt
					System.out.println("ein Programm");
				default:
					//diese Exception wird geworfen
					throw new Exception();
				}
			} catch (ArithmeticException e) {
				System.out.println("abbricht.");
			} catch (Exception e) {
				System.out.println("funktioniert.");
			} finally {
				//wird zu 0 ausgewertet
				int i = false && true ? 0 : 2;
				// 0 ist im switch case nicht enthalten somit wird in default gesprungen und wieder eine Exception geworfen
				switch (i) {
				case 1:
					System.out.println(";)");
				default:
					throw new Exception();
				}
			}
		} catch (ArithmeticException e) {
			System.out.println(":(");
		} catch (Exception e) {
			System.out.println(" ");
		}
	}
}