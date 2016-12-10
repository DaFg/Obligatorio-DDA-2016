package net.david.fernandez.oblogatorio.dda.common.dto;

import java.io.Serializable;
import java.rmi.Remote;

public class Jugador implements Serializable,Remote {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private int dinero;
	private int partGanadas;
	private int partPerdidas;
	private String password;
	private int id;
	
	public Jugador(String nombre, int dinero, int partGanadas, int partPerdidas, String password, int id) {
			super();
			this.nombre = nombre;
			this.password = password;
			this.dinero = dinero;
			this.partGanadas = partGanadas;
			this.partPerdidas = partPerdidas;
	}
	
	public Jugador() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

	public int getPartGanadas() {
		return partGanadas;
	}

	public void setPartGanadas(int partGanadas) {
		this.partGanadas = partGanadas;
	}

	public int getPartPerdidas() {
		return partPerdidas;
	}

	public void setPartPerdidas(int partPerdidas) {
		this.partPerdidas = partPerdidas;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
