package net.david.fernandez.oblogatorio.dda.common;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Server extends Remote {

	public void sendLogin(String string, char[] c) throws RemoteException;

	public void addObserver(Observer observer) throws RemoteException;
	
	public LoginController getLoginController() throws RemoteException;
	
	public PartidaController getPartidaController() throws RemoteException;
	
}
