package net.david.fernandez.oblogatorio.dda.server.dominio;

import net.david.fernandez.oblogatorio.dda.common.dto.Jugador;

public class Propiedades extends Casilla {

	/**
	 * Atributos y Propiedades
	 */

	private Boolean Comprado;
	private Jugador Duenio;
	private Boolean Hipotecado;
	private int Alquiler;
	private int CostoCompra;
	private int CostoHipoteca;
	private String Tipo;

	public Propiedades(String nombre,int precioPropiedad,int precioHipoteca, int precioRenta) {
		super(nombre);
		this.Hipotecado=false;
		this.Duenio=null;
		this.Comprado=false;
		this.CostoCompra=precioPropiedad;
		this.Alquiler=precioRenta;
		this.CostoHipoteca=precioHipoteca;
		
	}
	public Boolean getComprado() {
		return Comprado;
	}

	public void setComprado(Boolean comprado) {
		Comprado = comprado;
	}

	public Jugador getDuenio() {
		return Duenio;
	}

	public void setDuenio(Jugador duenio) {
		Duenio = duenio;
	}

	public Boolean getHipotecado() {
		return Hipotecado;
	}

	public void setHipotecado(Boolean hipoteca) {
		Hipotecado = hipoteca;
	}

	public int getAlquiler() {
		return Alquiler;
	}

	public void setAlquiler(int alquiler) {
		Alquiler = alquiler;
	}

	public int getCostoCompra() {
		return CostoCompra;
	}

	public void setCostoCompra(int costoCompra) {
		CostoCompra = costoCompra;
	}

	public int getCostoHipoteca() {
		return CostoHipoteca;
	}

	public void setCostoHipoteca(int costoHipoteca) {
		CostoHipoteca = costoHipoteca;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public void pagarRenta(Jugador jugador){
		
		jugador.setDinero(jugador.getDinero()-Alquiler);
		Duenio.setDinero(Duenio.getDinero()+Alquiler);
		
	}
	/**
	 * Constructores
	 */


	/**
	 * Metodos
	 */

}
