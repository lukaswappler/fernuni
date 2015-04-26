package fernuni.obj.ea.a1;

public class Summierer {
	public static void main(String[] args) {
		Summierer summierer = new Summierer();
		int startWert = Integer.parseInt(args[0]);
		System.out.println("Ergebnis mit for-Schleife: "
				+ summierer.forSumme(startWert));
		System.out.println("Ergebnis kleiner Gauss: "
				+ summierer.kleinerGauss(startWert));
		System.out.println("Ergebnis rekursiv: "
				+ summierer.rekursiveSumme(startWert));
		
	}

	int forSumme(int startWert) { 
		int summe = 0;
		for (int i = 0; i <= startWert; i++) {
			summe = summe + i;
		}
		return summe;
	}

	int rekursiveSumme(int startWert) { 
		if (startWert >= 1) {
			return startWert + rekursiveSumme(startWert - 1);
		} else {
			return 0;
		}
		
	}

	int kleinerGauss(int startWert) { 
		//Auf die Variable int summe könnte hier noch verzichte werden 
		int summe = 0;
		summe = (startWert * (startWert + 1) ) / 2;
		return summe;
	}
}