package net.david.fernandez.oblogatorio.dda.server.dominio;

public class Suerte extends Casilla {

	/*
	 * Atributos y Propiedades
	 */

	private String Accion;
	private int Monto;

	public String getAccion() {
		return Accion;
	}

	public void setAccion(String accion) {
		Accion = accion;
	}

	public int getMonto() {
		return Monto;
	}

	public void setMonto(int monto) {
		Monto = monto;
	}

	/*
	 * Constructores
	 */

	public Suerte(String nombre) {
		super(nombre);
	}

	/*
	 * Metodos
	 */

}
