package fernuni.obj.ea.a1;

import org.junit.Test;



public class ZahlAusdenkenNachBehebungTest {

	@Test
	public void testExceptions1() {
		String[]args = new String[0];
		
		ZahlAusdenken.main(args);
	}

	@Test
	public void testExceptions2() {
		String[]args = new String[20];
		
		ZahlAusdenken.main(args);
	}
	
	@Test
	public void testHeighNumber() {
		String[]args = new String[20];
			
		Double double1 = new Double("132456789098765432123456");
 		
		args[0] = double1.toString();		
		ZahlAusdenken.main(args);				
	}
	
	@Test
	public void testCommaNumber() {
		String[]args = new String[20];
					
		args[0] = "123.123";		
		ZahlAusdenken.main(args);				
	}

	@Test
	public void testEmptyString() {
		String[]args = new String[20];
		
		args[0] = "";		
		ZahlAusdenken.main(args);				
	}
	
	@Test
	public void testNumberZero() {
		String[]args = new String[20];
		
		args[0] = "0";
		
		ZahlAusdenken.main(args);				
	}
	
	@Test
	public void testNumberUngerade() {
		String[]args = new String[20];
		
		args[0] = "5";		
		ZahlAusdenken.main(args);
		
		args[0] = "-5";		
		ZahlAusdenken.main(args);
	}
	
	@Test
	public void testNumberGerade() {
		String[]args = new String[20];
		
		args[0] = "6";		
		ZahlAusdenken.main(args);
		
		args[0] = "6";		
		ZahlAusdenken.main(args);
	}
	

	
}
