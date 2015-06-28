package fernuni.obj.ea6.a3;

import java.util.ArrayList;
import java.util.List;

public class Wirtschaft {
	
	public static void main(String[] args) {
		
		System.out.println("Willkommen in der Fränkischen Philosophen Wirtschaft");
		
		Tisch tisch = new Tisch();

		List<Philosoph> philosophList = new ArrayList<Philosoph>();
		
		String[] philosophNames = new String [] {"Pythagoras", "Aristoteles", "Archimedes", "Sokrates", "Platon", "Der Philosoph, der zu spät kam"}; 
		for (String name : philosophNames) {
			Philosoph philosoph= new  Philosoph(name);			
			philosophList.add(philosoph);
			philosoph.sitDownAndchooseBowlOnTheTable(tisch);
			philosoph.start();
		}		
	}
	
}
