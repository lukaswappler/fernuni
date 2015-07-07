package fernuni.obj.ea7.a1;

import java.rmi.Naming;

public class RmiClient {
	public static void main(String args[]) throws Exception {
		RmiServerIntf obj = (RmiServerIntf) Naming
				.lookup("//localhost/RmiServer");
		
		obj.increaseCounter();
		obj.increaseCounter();
		obj.increaseCounter();
		obj.increaseCounter();
		obj.increaseCounter();
		obj.increaseCounter();

		
		System.out.println(obj.getCounter());
	}
}