package net.david.fernandez.oblogatorio.dda.server.motor_reglas;

import java.util.ArrayList;
import java.util.List;

import net.david.fernandez.oblogatorio.dda.common.dto.Jugador;

public class OpcionesParaElJugador {

	private Jugador jugadorActual;
	private Jugador jugadorSiguiente;
	private AccionJugador accionRealizada;
	private List<AccionJugador> opcionesJugador;
	private int[] valorDados;

	public OpcionesParaElJugador() {
		// TODO Auto-generated constructor stub
	}

	public Jugador getJugadorActual() {
		return jugadorActual;
	}

	public void setJugadorActual(Jugador jugadorActual) {
		this.jugadorActual = jugadorActual;
	}

	public Jugador getJugadorSiguiente() {
		return jugadorSiguiente;
	}

	public void setJugadorSiguiente(Jugador jugadorSiguiente) {
		this.jugadorSiguiente = jugadorSiguiente;
	}

	public AccionJugador getAccionRealizada() {
		return accionRealizada;
	}

	public void setAccionRealizada(AccionJugador accionRealizada) {
		this.accionRealizada = accionRealizada;
	}

	public List<AccionJugador> getOpcionesJugador() {
		return opcionesJugador;
	}

	public void setOpcionesJugador(List<AccionJugador> opcionesJugador) {
		this.opcionesJugador = opcionesJugador;
	}

	public int[] getValorDados() {
		return valorDados;
	}

	public void setValorDados(int[] valorDados) {
		this.valorDados = valorDados;
	}

}
