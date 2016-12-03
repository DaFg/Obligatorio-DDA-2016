package net.david.fernandez.oblogatorio.dda.server.entities;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import net.david.fernandez.oblogatorio.dda.server.dominio.Login;
import net.david.fernandez.oblogatorio.dda.server.entities.User;

public class JugadorServicio {

	public List<User> getUsuarios() {
		EntityManager em = ConnectionFactory.getInstance().getEntityManager();
		Query query = em.createQuery("SELECT u FROM User u");
		@SuppressWarnings("unchecked")
		List<User> usuarios = query.getResultList();
		return usuarios;
	}
	
	public User getUsuario(String nombre) {
		EntityManager em = ConnectionFactory.getInstance().getEntityManager();
		Query query = em.createQuery("SELECT u FROM User u WHERE nombre = :nombre");
		query.setParameter("nombre", nombre);
		@SuppressWarnings("unchecked")
		User usuario = (User) query.getSingleResult();
		return usuario;
	}
	
	public void conecDb() {

		/*
		 * TODO Crear conecDB como Factory singleton	
		 */
		
		// --Desde aqui JPA--//
		System.out.println("Comienza JPA");

		EntityManager em = ConnectionFactory.getInstance().getEntityManager();
		/*
		 * em.getTransaction().begin(); User u = new User();
		 * u.setNombre("David"); // u.setId(2); em.persist(u);
		 * System.out.println("Finalizo // Transaccion");
		 * em.getTransaction().commit();
		 */

	}

	/*
	 * public User LoginCorrecto() {// (String nombre, char[] // contrasenia) {
	 * // --Desde aqui JPA--//
	 * 
	 * System.out.println("Comienza JPA en JServicio"); User login = new User();
	 * EntityManagerFactory emf;
	 * 
	 * System.out.println("Creo EMF"); emf =
	 * Persistence.createEntityManagerFactory("jpaDS");
	 * 
	 * System.out.println("Creo EM"); EntityManager em = (EntityManager)
	 * emf.createEntityManager();
	 * 
	 * System.out.println("Comienzo transaccion"); em.getTransaction().begin();
	 * 
	 * User u = new User();
	 * 
	 * List<Usuarios> us = u.
	 * 
	 * 
	 * 
	 * //u.setNombre("David"); // u.setId(2); //em.persist(u);
	 * System.out.println("Finalizo Transaccion"); em.getTransaction().commit();
	 * return u;
	 * 
	 * 
	 * 
	 * 
	 * // Consulat comienzo// String sql = "select * from login"; Query query =
	 * em.createNativeQuery(sql);
	 * 
	 * @SuppressWarnings("unchecked") List<Long> resultado =
	 * query.getResultList();
	 * 
	 * // Estoy aqui estaba con las consultas a la bd.// // List<Long> resultado
	 * = query.getResultList(); // Consulat fin//
	 * 
	 * System.out.println(resultado);
	 * 
	 * System.out.println("Finalizo Transaccion"); em.getTransaction().commit();
	 * 
	 * return login; }
	 */
}
