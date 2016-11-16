package net.david.fernandez.oblogatorio.dda.server.dominio;

public class Dado {

	/**
	 * Atributos y Propiedades
	 */

	private int Valor1;
	private int Valor2;
	private int lados;
	private Boolean Repetido;

	public Boolean getRepetido() {
		return Repetido;
	}

	public void setRepetido(Boolean repetido) {
		Repetido = repetido;
	}

	public int getValor1() {
		return Valor1;
	}

	public void setValor1(int valor1) {
		Valor1 = valor1;
	}

	public int getValor2() {
		return Valor2;
	}

	public void setValor2(int valor2) {
		Valor2 = valor2;
	}

	/**
	 * Constructores
	 */

	public Dado() {
		this.lados = 6;
	}

	/**
	 * Metodos
	 */

	public void TirarDado() {
		this.Valor1 = lanzar();
		this.Valor2 = lanzar();
	}

	public int lanzar() {
		return (int) (Math.random() * lados) + 1;
	}

}
