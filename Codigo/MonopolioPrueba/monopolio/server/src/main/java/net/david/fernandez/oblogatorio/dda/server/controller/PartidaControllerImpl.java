package net.david.fernandez.oblogatorio.dda.server.controller;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import net.david.fernandez.oblogatorio.dda.common.PartidaController;
import net.david.fernandez.oblogatorio.dda.common.dto.Jugador;

public class PartidaControllerImpl extends UnicastRemoteObject implements PartidaController {

	private static PartidaController instance = null;
	
	public static PartidaController getInstance() throws RemoteException {
		if(instance == null) {
			instance = new PartidaControllerImpl();
		}
		return instance;
	}
	
	public PartidaControllerImpl() throws RemoteException {
		super();
	}

	public void recibirOpciones() throws RemoteException {
		// TODO Auto-generated method stub
		
	}
	
	public void recibirJugadaDeJugador(/* Jugada */) {
		// realizar reglas de negocio
		// notificar a jugadores
	}
	
	@Override
	public String notificarAccionDeJugador(Jugador jugador, String[] acciones) throws RemoteException {
		// TODO revisar parametros que recibe esta funcion - lo actual es ejemplo
		// 1 recorrer los observadores
		// 2 enviar la jugada que hizo el jugador
		// 3 enviar el nuevo (puede ser el mismo) jugador con turno junto con las acciones diponibles que tiene para hacer
		return null;
	}


}
