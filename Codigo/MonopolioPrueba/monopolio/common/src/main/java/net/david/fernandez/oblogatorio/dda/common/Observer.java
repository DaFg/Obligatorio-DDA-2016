package net.david.fernandez.oblogatorio.dda.common;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Observer extends Serializable, Remote{

	public void notify(String message) throws RemoteException;
	
}
