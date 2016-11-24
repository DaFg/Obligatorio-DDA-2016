package net.david.fernandez.oblogatorio.dda.server.dominio;

public class Jugador {

	/**
	 * Atributos y Propiedades
	 */

	private int Posicion;
	private int Dinero;
	private Boolean EnCarcel;
	private int Movimientos;
	private Propiedades ListPropiedades;
	private int Id;
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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
}
