package fernuni.obj.ea.a1;

import org.junit.Test;



public class SummiererTest {

	@Test 	
	public void testSummierer() {
		String[]args = new String[1];
		
		args[0] = "1325";
		
		Summierer.main(args);		
	}
	
	@Test (expected=StackOverflowError.class)	
	public void testStackOverflowRekursion() {
		String[]args = new String[1];
		
		args[0] = "10000";
		
		Summierer.main(args);		
	}

	
}
