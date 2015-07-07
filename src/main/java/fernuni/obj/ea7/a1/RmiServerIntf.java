package fernuni.obj.ea7.a1;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RmiServerIntf extends Remote {
		
	public void increaseCounter() throws RemoteException;
	
	public void decreaseCounter() throws RemoteException;
	
	public int getCounter() throws RemoteException;
	
}