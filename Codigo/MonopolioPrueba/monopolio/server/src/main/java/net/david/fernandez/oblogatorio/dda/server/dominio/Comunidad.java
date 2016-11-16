package net.david.fernandez.oblogatorio.dda.server.dominio;

public class Comunidad extends Casilla {

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

	public Comunidad(String nombre) {
		// TODO Auto-generated constructor stub
		super(nombre)
	}

	/*
	 * Metodos
	 */

}
