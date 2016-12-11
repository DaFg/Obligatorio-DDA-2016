package net.david.fernandez.oblogatorio.dda.server.dominio;

import net.david.fernandez.oblogatorio.dda.common.dto.Jugador;

public class Lugar {

	/**
	 * Atributos y Propiedades
	 */

	private String ColorCasilla;
	private int NumCasas;
	private int NumHoteles;
	private int CostoHotel;
	private int CostoCasa;

	public String getColorCasilla() {
		return ColorCasilla;
	}

	public void setColorCasilla(String colorCasilla) {
		ColorCasilla = colorCasilla;
	}

	public int getNumCasas() {
		return NumCasas;
	}

	public void setNumCasas(int numCasas) {
		NumCasas = numCasas;
	}

	public int getNumHoteles() {
		return NumHoteles;
	}

	public void setNumHoteles(int numHoteles) {
		NumHoteles = numHoteles;
	}

	public int getCostoHotel() {
		return CostoHotel;
	}

	public void setCostoHotel(int costoHotel) {
		CostoHotel = costoHotel;
	}

	public int getCostoCasa() {
		return CostoCasa;
	}

	public void setCostoCasa(int costoCasa) {
		CostoCasa = costoCasa;
	}

	/**
	 * Construcroes
	 */

	public Lugar() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Metodos
	 */

	public void ObtenerNumProp(Jugador jugador) {

	}

	public void Construido() {

	}

	public void CostoTotalCyH() {

	}

}
