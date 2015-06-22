package fernuni.obj.ea6.a3;

public class Wirtschaft {

	
	
	public static void main(String[] args) {
		
		System.out.println("Willkommen in der Fränkischen Philosophen Wirtschaft");
		
		
		Tisch tisch = new Tisch();
		
		Philosoph philosoph1= new Philosoph("Pythagoras");
		Philosoph philosoph2 = new Philosoph("Aristoteles");
		Philosoph philosoph3 = new Philosoph("Archimedes");
		Philosoph philosoph4 = new Philosoph("Sokrates");
		Philosoph philosoph5 = new Philosoph("Platon");
		Philosoph philosoph6 = new Philosoph("Der Philosoph, der zu spät kam");
		
		
		
		philosoph1.sitDownAndchooseBowlOnTheTable(tisch);
		philosoph2.sitDownAndchooseBowlOnTheTable(tisch);
		philosoph3.sitDownAndchooseBowlOnTheTable(tisch);
		philosoph4.sitDownAndchooseBowlOnTheTable(tisch);
		philosoph5.sitDownAndchooseBowlOnTheTable(tisch);
		philosoph6.sitDownAndchooseBowlOnTheTable(tisch);		

		
		philosoph1.start();
		philosoph2.start();
		philosoph3.start();
		philosoph4.start();
		philosoph5.start();
		
		philosoph6.start();
		
	}	
	
}
