package net.david.fernandez.oblogatorio.dda.server.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {

	private static ConnectionFactory instance = null;
	
	private EntityManager em;
	
	public static ConnectionFactory getInstance() {
		if(instance == null) {
			instance = new ConnectionFactory();
		}
		return instance;
	}
	
	private ConnectionFactory() {
		EntityManagerFactory emf;
		System.out.println("Creo EMF");
		emf = Persistence.createEntityManagerFactory("jpaDS");
		System.out.println("Creo EM");
		em = (EntityManager) emf.createEntityManager();
		System.out.println("Comienzo transaccion");
	}

	public EntityManager getEntityManager() {
		return em;
	}
}