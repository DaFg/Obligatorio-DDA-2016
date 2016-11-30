package net.david.fernandez.oblogatorio.dda.common;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

import net.david.fernandez.oblogatorio.dda.common.dto.Jugador;

public interface PartidaController extends Remote, Serializable, MarcaEsObservable {
	
	/**
	 * Devuelve las opciones disponbles que el jugador puede realizar </br>
	 * es llamado desde el cliente </br>
	 * TODO cambiar void paraw que devuelva las opciones que tiene disponible el jugador para realizar
	 * @throws RemoteException
	 */
	public void recibirOpciones() throws RemoteException;
	
	/**
	 * Notifica a los observers registrados que un jugador realizo una accion.
	 * @return
	 * @throws RemoteException
	 */
	String notificarAccionDeJugador(Jugador jugador, String[] acciones) throws RemoteException; 
}
