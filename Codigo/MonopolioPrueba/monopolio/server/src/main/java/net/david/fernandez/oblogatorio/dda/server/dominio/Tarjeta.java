package net.david.fernandez.oblogatorio.dda.server.dominio;

public class Tarjeta {

	/**
	 * Atributos y Propiedades
	 */

	private String Tipo;
	private int MoverPosi;
	private int Cobrar;
	private int Pagar;

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public int getMoverPosi() {
		return MoverPosi;
	}

	public void setMoverPosi(int moverPosi) {
		MoverPosi = moverPosi;
	}

	public int getCobrar() {
		return Cobrar;
	}

	public void setCobrar(int cobrar) {
		Cobrar = cobrar;
	}

	public int getPagar() {
		return Pagar;
	}

	public void setPagar(int pagar) {
		Pagar = pagar;
	}

	/**
	 * Constructores
	 */

	public Tarjeta() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Metodos
	 */

}
