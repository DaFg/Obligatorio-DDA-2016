package net.david.fernandez.oblogatorio.dda.common;

import java.rmi.RemoteException;
import java.util.List;

import net.david.fernandez.oblogatorio.dda.common.dto.Jugador;

public interface MarcaEsObservable {

	public void notificar(String mensaje) throws RemoteException;
	public void actulizarTimer(int segundo) throws RemoteException;
	public void empezarPartida(Jugador jugador) throws RemoteException;
	public void setJugador(Jugador jugador) throws RemoteException;
	public Jugador getJugador() throws RemoteException;
	public void actualizarPosicionJugador(int posAnterior, int jugadorPos, int posicion) throws RemoteException;
	public void cambiarTurno(int posJugador, Jugador jugador) throws RemoteException;
	public void comprarPropiedad(Jugador jugador, int posicion) throws RemoteException;
	public void acciones(Jugador jugador, List<String> acciones) throws RemoteException;
	public void pagarMulta(Jugador dueño, int cantidad) throws RemoteException;
}
