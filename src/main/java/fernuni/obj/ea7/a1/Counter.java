package fernuni.obj.ea7.a1;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

class Counter extends UnicastRemoteObject implements CounterInterface {
	
	private static final long serialVersionUID = -3112791128193082812L;
	
	private int startValue;
	private int value;
	private int min = 0;
	private int max = 99;

	Counter(int start) throws RemoteException {
		startValue = start;
		value = start;
	}
	
	public static void main(String args[]) throws Exception {
        System.out.println("RMI server started");

        try { // special exception handler for registry creation
            LocateRegistry.createRegistry(1099);
            System.out.println("java RMI registry created.");
        } catch (RemoteException e) {
            // do nothing, error means registry already exists
            System.out.println("java RMI registry already exists.");
        }

        //Instanciate Remote Object
        Counter obj = new Counter(50);

        // Bind this object instance to the name "Counter"
        Naming.rebind("//localhost/Counter", obj);        
    }
	
	public void incr() {
		if (value < max)
			value++;
	}

	public void decr() {
		if (value > min)
			value--;
	}

	public void resetCounter() {
		value = startValue;
	}

	public String getValue() {
		return "" + value;
	}
}