package net.david.fernandez.oblogatorio.dda.server.dominio;

import net.david.fernandez.oblogatorio.dda.server.entities.User;

public class Login {

	/**
	 * Atributos y Propiedades
	 */

	private String Nombre;
	private String Contrasenia;

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getContrasenia() {
		return Contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		Contrasenia = contrasenia;
	}

	public void resivirLogin(String nombre, String contrasenia) {

		System.out.println("Muestro lo que llega desde ServerImpl a Login");
		System.out.println(nombre);
		System.out.println(contrasenia);
		System.out.println("Fin resivirLogin en Login");

		User logcontr = new User();
		logcontr.buscarLoguin(nombre, contrasenia);
	}

}
