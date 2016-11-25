package net.david.fernandez.oblogatorio.dda.common;

import java.rmi.Remote;
import java.rmi.RemoteException;

import net.david.fernandez.oblogatorio.dda.common.dto.Jugador;

public interface Server extends Remote {

	public void sendLogin(String string, char[] c) throws RemoteException;

	public void addJugador(Jugador jugador) throws RemoteException;
	
	public LoginController getLoginController() throws RemoteException;
	
	public PartidaController getPartidaController() throws RemoteException;
	
	
}
