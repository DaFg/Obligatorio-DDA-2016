package net.david.fernandez.oblogatorio.dda.server;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import net.david.fernandez.oblogatorio.dda.server.entities.User;

public class TestJPA {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaDS");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		User u = new User();
		u.setNombre("David");
		em.persist(u);
		em.getTransaction().commit();
	}
}
