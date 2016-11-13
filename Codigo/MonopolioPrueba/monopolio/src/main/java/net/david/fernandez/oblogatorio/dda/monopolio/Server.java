package net.david.fernandez.oblogatorio.dda.monopolio;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Server extends Remote {

	public void sendLogin(String string, char[] c) throws RemoteException;

	//public void sendLogin(String n, String string) throws RemoteException;

}
