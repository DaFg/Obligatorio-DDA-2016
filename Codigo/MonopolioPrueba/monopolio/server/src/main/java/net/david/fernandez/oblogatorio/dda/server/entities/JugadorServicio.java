package net.david.fernandez.oblogatorio.dda.server.entities;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import net.david.fernandez.oblogatorio.dda.common.dto.Jugador;
import net.david.fernandez.oblogatorio.dda.common.dto.UsuarioCom;
import net.david.fernandez.oblogatorio.dda.server.dominio.Login;
import net.david.fernandez.oblogatorio.dda.server.entities.User;

public class JugadorServicio {

	private static final JugadorServicio instance = new JugadorServicio();

	public JugadorServicio getInstance() {
		return instance;
	}

	// public List<User> getUsuarios() {
	// System.out.println("Entro en JugadorServicio");
	// System.out.println("Entro en getUsuario List");
	// EntityManager em = ConnectionFactory.getInstance().getEntityManager();
	// Query query = em.createQuery("SELECT u FROM User u");
	// @SuppressWarnings("unchecked")
	// List<User> usuarios = query.getResultList();
	// for (User user : usuarios) {
	// System.out.println(user.getId());
	// System.out.println(user.getNombre());
	// System.out.println(user.getContrasenia());
	// }
	// return usuarios;
	// }

	public User getUsuario(String nombre) {
		System.out.println("Entro en JugadorServicio");
		System.out.println("Entro en getUsurio Usuario");
		EntityManager em = ConnectionFactory.getInstance().getEntityManager();
		Query query = em.createQuery("SELECT u FROM User u WHERE nombre = :nombre");
		query.setParameter("nombre", nombre);
		@SuppressWarnings("unchecked")
		User usuario = (User) query.getSingleResult();
		System.out.println(usuario.getId());
		System.out.println(usuario.getNombre());
		System.out.println(usuario.getContrasenia());
		return usuario;
	}

	public Jugador getUsuario(String nombre, String contrasenia) {
		System.out.println("Entro en JugadorServicio");
		System.out.println("Entro en getUsurio Usuario");
		EntityManager em = ConnectionFactory.getInstance().getEntityManager();
		Query query = em.createQuery("SELECT u FROM User u WHERE nombre = :nombre AND contrasenia = :contrasenia");
		query.setParameter("nombre", nombre).setParameter("contrasenia", contrasenia);
		Jugador usuario = (Jugador) query.getSingleResult();
		System.out.println(usuario.getId());
		System.out.println(usuario.getNombre());
		System.out.println(usuario.getPassword());
		return usuario;
	}

	public User getDatosUsuario(String nombre, String contrasenia) {
		System.out.println("Entro en JugadorServicio");
		System.out.println("Entro en getDatosUsurio Usuario");
		EntityManager em = ConnectionFactory.getInstance().getEntityManager();
		Query query = em.createQuery("SELECT u FROM User u WHERE nombre = :nombre AND contrasenia = :contrasenia");
		query.setParameter("nombre", nombre).setParameter("contrasenia", contrasenia);
		User us = (User) query.getSingleResult();
		System.out.println(us.getId());
		System.out.println(us.getNombre());
		System.out.println(us.getContrasenia());
		System.out.println(us);
		return us;
	}

	public void setUsuario() {
		// --Desde aqui JPA--//
		System.out.println("Entro en JugadorServicio");
		System.out.println("Entro en setUsuario");
		System.out.println("Comienza JPA");
		EntityManager em = ConnectionFactory.getInstance().getEntityManager();
		em.getTransaction().begin();
		User u = new User();
		u.setId(1);
		u.setNombre("Gamarra");
		/*
		 * String con = "gamarra"; char[] con_arr = con.toCharArray();
		 * u.setContrasenia(con_arr);
		 */
		em.persist(u);
		System.out.println("Finalizo // Transaccion");
		em.getTransaction().commit();

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
