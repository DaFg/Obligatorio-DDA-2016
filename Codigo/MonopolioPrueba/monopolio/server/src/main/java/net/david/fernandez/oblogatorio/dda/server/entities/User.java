package net.david.fernandez.oblogatorio.dda.server.entities;

import java.io.Serializable;
import java.rmi.Remote;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Table;

import net.david.fernandez.oblogatorio.dda.server.App;
import net.david.fernandez.oblogatorio.dda.server.dominio.Login;

@Entity
@Table(name = "Usuario")
public class User extends Login implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -744650942744856564L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;

	private String Nombre;
	private String Contrasenia;

	public User() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}

	public String getContrasenia() {
		return Contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		Contrasenia = contrasenia;
	}

	// public char[] getContrasenia() {
	// return Contrasenia;
	// }
	//
	// public void setContrasenia(char[] contrasenia) {
	// Contrasenia = contrasenia;
	// }
	//
	public void buscarLoguin(String nombre, String contrasenia) {

		// Busco el usuario y verifico la contraseñ que me envian de ServerImpl.

		System.out.println("Muestro lo que llega desde Login a LoginController");
		System.out.println(nombre);
		System.out.println(contrasenia);
		System.out.println("Fin resivir Login en LoginController");

	}

	/*
	 * Me parece que este metodo se va a repetir mucho, talvez tengamos que
	 * pensar algun patron.
	 */

	/*
	 * public static void conecDb() { // --Desde aqui JPA--//
	 * System.out.println("Comienza JPA");
	 * 
	 * EntityManagerFactory emf; System.out.println("Creo EMF"); emf =
	 * Persistence.createEntityManagerFactory("jpaDS");
	 * System.out.println("Creo EM"); EntityManager em = (EntityManager)
	 * emf.createEntityManager(); System.out.println("Comienzo transaccion");
	 * em.getTransaction().begin(); Login log = new Login(); Login l =
	 * em.find(Login.class, log.getNombre());
	 * System.out.println("Finalizo Transaccion"); em.getTransaction().commit();
	 * }
	 */

}
