package net.david.fernandez.oblogatorio.dda.server.dominio;

import net.david.fernandez.oblogatorio.dda.server.entities.LoginController;

public class Login {

	/**
	 * Atributos y Propiedades
	 */

	private String Nombre;
	private char[] Contrasenia;

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public char[] getContrasenia() {
		return Contrasenia;
	}

	public void setContrasenia(char[] contrasenia) {
		Contrasenia = contrasenia;
	}

	public void resivirLogin(String nombre, char[] contrasenia) {

		System.out.println("Muestro lo que llega desde ServerImpl a Login");
		System.out.println(nombre);
		System.out.println(contrasenia);
		System.out.println("Fin resivirLogin en Login");

		LoginController logcontr = new LoginController();
		logcontr.buscarLoguin(nombre, contrasenia);
	}

}
