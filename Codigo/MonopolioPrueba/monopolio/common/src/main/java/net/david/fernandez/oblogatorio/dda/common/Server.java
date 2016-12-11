package net.david.fernandez.oblogatorio.dda.common;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import net.david.fernandez.oblogatorio.dda.common.dto.Jugador;

public interface Server extends Remote {

	public void sendLogin(String string, String c) throws RemoteException;
	
	public List<MarcaEsObservable> getObservers() throws RemoteException;
	
	public void sendMessage(String message) throws RemoteException;
	
	public int tirarDado() throws RemoteException;

	public LoginController getLoginController() throws RemoteException;
	
	public PartidaController getPartidaController() throws RemoteException;
	
	public void addObserver(MarcaEsObservable observer) throws RemoteException;

	public void setJugador(Jugador jugador) throws RemoteException;
	
	public void pagarMulta(Jugador dueño, int cantidad) throws RemoteException;
}
