package net.david.fernandez.oblogatorio.dda.common;

import java.rmi.Remote;
import java.rmi.RemoteException;

import net.david.fernandez.oblogatorio.dda.common.dto.Jugador;

public interface LoginController extends Remote {

	public Jugador autenticar(String username, String password) throws RemoteException;
	
}
