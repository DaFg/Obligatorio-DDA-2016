package net.david.fernandez.oblogatorio.dda.common;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PartidaController extends Remote, Serializable {
	
	public void actualizar() throws RemoteException;
}
