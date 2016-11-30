package net.david.fernandez.oblogatorio.dda.server.dominio;

public class Jugador extends net.david.fernandez.oblogatorio.dda.common.dto.Jugador {

	/**
	 * Atributos y Propiedades
	 */

	private int Posicion;
	private int Dinero;
	private Boolean EnCarcel;
	private int Movimientos;
	private Propiedades ListPropiedades;

	/**
	 * Constructores
	 */
	public Jugador() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Metodos
	 */
	
	public void ComprobarCompra() {
	}
	
	public void ComprobarPosicion() {
		
	}
	
	public int getPosicion() {
		return Posicion;
	}

	public void setPosicion(int posicion) {
		Posicion = posicion;
	}

	public int getDinero() {
		return Dinero;
	}

	public void setDinero(int dinero) {
		Dinero = dinero;
	}

	public Boolean getEnCarcel() {
		return EnCarcel;
	}

	public void setEnCarcel(Boolean enCarcel) {
		EnCarcel = enCarcel;
	}

	public int getMovimientos() {
		return Movimientos;
	}

	public void setMovimientos(int movimientos) {
		Movimientos = movimientos;
	}

	public Propiedades getListPropiedades() {
		return ListPropiedades;
	}

	public void setListPropiedades(Propiedades listPropiedades) {
		ListPropiedades = listPropiedades;
	}

}
