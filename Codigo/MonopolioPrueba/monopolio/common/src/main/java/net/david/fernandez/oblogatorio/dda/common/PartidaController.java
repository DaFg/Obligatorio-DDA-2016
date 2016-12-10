package net.david.fernandez.oblogatorio.dda.common;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import net.david.fernandez.oblogatorio.dda.common.dto.Jugador;

public interface PartidaController extends Remote{
	

	public void agregarJugador(Jugador jugador) throws RemoteException;
	public void agregarObserver(MarcaEsObservable observer) throws RemoteException;
	public List<Jugador> darJugadoresEnPartida() throws RemoteException;
	public void accion(Jugador jugador, String accion, boolean dueño) throws RemoteException;
	public void empezarPartida() throws RemoteException;
	public void actualizarPosicionJugador(int posAnterior, int jugadorPos, int posicion) throws RemoteException;
	public void cambiarTurno(int jugPos) throws RemoteException;
	public void comprarPropiedad(Jugador jugador, int posicion) throws RemoteException;
}
