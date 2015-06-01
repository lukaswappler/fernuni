package fernuni.obj.ea4.a3;

class Fahrzeug { /* ... */
}

class Personenwagen extends Fahrzeug { /* ... */
}

class Smart extends Personenwagen { /* ... */
}

class Lastwagen extends Fahrzeug { /* ... */
}

class Mercedes extends Lastwagen { /* ... */
}

class Crash {
	void adac_testen(Fahrzeug a, Lastwagen d) { /* ... */
		int count = 0;
		count++;
	} // Deklaration #1

	void adac_testen(Personenwagen b, Fahrzeug a) { /* ... */
		int count = 0;
		count++;
	} // Deklaration #2

	void adac_testen(Smart c, Lastwagen d) { /* ... */
		int count = 0;
		count++;		
		
	} // Deklaration #3

	
	
	public void CrashTest() {
		Fahrzeug a = new Fahrzeug();
		Personenwagen b = new Personenwagen();
		Smart c = new Smart();
		Lastwagen d = new Lastwagen();
		Mercedes e = new Mercedes();
		adac_testen(a, d); // Aufruf #1
		adac_testen(c, a); // Aufruf #2
		adac_testen(c, e); // Aufruf #3
//		adac_testen(b, d); // Aufruf #4
	}
}