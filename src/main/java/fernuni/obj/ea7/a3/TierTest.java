package fernuni.obj.ea7.a3;

class Tier {
}

class Fisch extends Tier {
}

class Vogel extends Tier {
}

class Huhn extends Vogel {
}

class Spatz extends Vogel {
}

class Karpfen extends Fisch {
}

class Super {
	public void m(Tier t1, Tier t2) {
		System.out.println("1");
	}

	public void m(Tier t, Fisch f) {
		System.out.println("2");
	}

	public void m(Fisch f, Tier t) {
		System.out.println("5");
	}
}

class Sub extends Super {
	public void m(Tier t1, Fisch t2) {
		System.out.println("3");
	}

	public void m(Vogel v, Fisch f) {
		System.out.println("4");
	}
}

public class TierTest {
	public static void main(String[] args) {
		Tier t1 = new Tier();
		Tier t2 = new Vogel();
		Fisch f = new Karpfen();
		Vogel v1 = new Vogel();
		Vogel v2 = new Spatz();
		Huhn h = new Huhn();
		Karpfen k = new Karpfen();
		Super sup1 = new Super();
		Super sup2 = new Sub();
		
		sup1.m(h, v2); // Aufruf #1
		sup2.m(v1, k); // Aufruf #2
		sup1.m(t1, t2); // Aufruf #3
		sup1.m(v1, k); // Aufruf #4
		sup1.m(v2, f); // Aufruf #5
		sup2.m(v1, f); // Aufruf #6		
	}
}

/*
Aufruf #1 
Ausgabe: 1

Passt nur zu:
class Super
	m(Tier t1, Tier t2)
	
	
Aufruf #2
Ausgabe: 3

Passt zu
class Super
	m(Tier t1, Tier t2)
und
class Sub 
	m(Tier t1, Fisch t2)
	
m(Tier t1, Fisch t2) ist spezifischer



Aufruf #3
Ausgabe: 1

Passt nur zu
class Super
	m(Tier t1, Tier t2)

	
Aufruf #4
Ausgabe: 2

Passt zu 
class Super
	m(Tier t1, Tier t2)
und 
class Super
	m(Tier t, Fisch f) {
	
m(Tier t, Fisch f) { ist spezifischer

Aufruf #5
Ausgabe: 2
Passt zu 
class Super
	m(Tier t1, Tier t2)
und 
class Super
	m(Tier t, Fisch f) {
	
Aufruf #6
Ausgabe: 3

Passt zu
class Super
	public void m(Tier t1, Tier t2) {
		System.out.println("1");
	}
	
	//wird aber in Suo überschrieben
	public void m(Tier t, Fisch f) {
		System.out.println("2");
	}
	
und zu
class Sup
	public void m(Tier t1, Fisch t2) {
		System.out.println("3");
	}
	
Normalerweise wäre naheliegend, dass 
public void m(Vogel v, Fisch f) {
	System.out.println("4");
}
aufgerufen wird. Ist aber nicht der Fall, da sup2 als Variable mit der Klasse Super gespeichert wird. Somit sind nur die Methoden aus Super aufrufbar und alle aus Sup, die eine Methode aus Super überschreiben.
	
	
*/
	