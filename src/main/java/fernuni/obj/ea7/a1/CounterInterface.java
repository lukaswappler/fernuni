package fernuni.obj.ea7.a1;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CounterInterface extends Remote{

    
    public void incr() throws RemoteException;

    public void decr() throws RemoteException;

    public void resetCounter() throws RemoteException;
    
    public String getValue() throws RemoteException;
}
