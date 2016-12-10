package net.david.fernandez.oblogatorio.dda.server.dominio;

import net.david.fernandez.oblogatorio.dda.common.dto.Jugador;

public class Casilla {

	/**
	 * Atributos y Propiedades
	 */

	private String Tipo;
	private String Nombre;
	private int Posicion;
	private Jugador jugadorActual;

	public Casilla(String nombre) {
		this.Nombre=nombre;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getPosicion() {
		return Posicion;
	}

	public void setPosicion(int posicion) {
		Posicion = posicion;
	}

	public Jugador getJugadorActual() {
		return jugadorActual;
	}

	public void setJugadorActual(Jugador jugadorActual) {
		this.jugadorActual = jugadorActual;
	}
	
}
