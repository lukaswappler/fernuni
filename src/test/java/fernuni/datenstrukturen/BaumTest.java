package fernuni.datenstrukturen;

import org.junit.Test;

public class BaumTest {
	
	@Test
	public void testBaum() {

		AVLbaum baum = new AVLbaum();
		
		baum.einfuegen(20);
		baum.einfuegen(30);
		baum.einfuegen(40);
		baum.einfuegen(25);
		baum.einfuegen(23);
		baum.einfuegen(28);
		baum.einfuegen(10);
		baum.einfuegen(21);
		baum.einfuegen(22);
		baum.einfuegen(24);

		
		
		
	}
	@Test
	public void testBaum2() {

		AVLbaum baum = new AVLbaum();
		
		baum.einfuegen(5);
		baum.einfuegen(2);
		baum.einfuegen(30);
		baum.einfuegen(1);
		baum.einfuegen(20);
		baum.einfuegen(4);
		baum.einfuegen(50);
		baum.einfuegen(0);
		baum.einfuegen(10);
		baum.einfuegen(40);
		baum.einfuegen(70);
		baum.einfuegen(60);
				

		
		
		
	}
	
}
