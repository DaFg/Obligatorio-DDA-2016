package net.david.fernandez.oblogatorio.dda.server;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import net.david.fernandez.oblogatorio.dda.common.Server;
import net.david.fernandez.oblogatorio.dda.server.entities.JugadorServicio;
import net.david.fernandez.oblogatorio.dda.server.entities.User;

/**
 * Hello world!
 *
 */
public class App {

	private static char[] david;

	public static void main(String[] args) throws RemoteException, AlreadyBoundException {

		System.out.println("Hello World!<--App Server -->");

		conecSer();

	}

	/* Este metodo es el de coneccion con RMI */
	public static void conecSer() throws RemoteException, AlreadyBoundException {
		// ---0---0---0---0---0---0//
		// --Desde aqui RMI--//
		System.out.println("Comienza RMI");

		System.setProperty("java.security.policy", "file://c:/java.policy");

		LocateRegistry.createRegistry(1099);
		ServerImpl obj = new ServerImpl();
		Server stub = (Server) UnicastRemoteObject.exportObject(obj, 0);
		// Bind the remote
		// object's stub in the registry
		Registry registry = LocateRegistry.getRegistry(1099);
		registry.bind("Server", stub);

		//JugadorServicio js = new JugadorServicio();
		// js.setUsuario();
		//js.getUsuario("David", "yo");
		// js.getUsuario("David");
		// js.getUsuarios();

		System.out.println("Finaliza RMI");
		// ----0---0---0---0---0//
	}

	/*
	 * public static void conecDb() { // --Desde aqui JPA--//
	 * System.out.println("Comienza JPA");
	 * 
	 * EntityManagerFactory emf; System.out.println("Creo EMF"); emf =
	 * Persistence.createEntityManagerFactory("jpaDS");
	 * System.out.println("Creo EM"); EntityManager em = (EntityManager)
	 * emf.createEntityManager(); System.out.println("Comienzo transaccion");
	 * em.getTransaction().begin(); User u = new User(); u.setNombre("David");
	 * // u.setId(2); em.persist(u); System.out.println("Finalizo Transaccion");
	 * em.getTransaction().commit();
	 * 
	 * }
	 */

}
