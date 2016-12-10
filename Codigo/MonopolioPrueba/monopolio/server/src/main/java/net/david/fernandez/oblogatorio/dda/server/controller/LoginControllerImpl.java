package net.david.fernandez.oblogatorio.dda.server.controller;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import net.david.fernandez.oblogatorio.dda.common.LoginController;
import net.david.fernandez.oblogatorio.dda.common.dto.Jugador;
import net.david.fernandez.oblogatorio.dda.server.entities.JugadorServicio;

public class LoginControllerImpl extends UnicastRemoteObject implements LoginController {

	private static final long serialVersionUID = 1L;
	private static LoginController instance = null;

	public static LoginController getInstance() throws RemoteException {
		if (instance == null) {
			instance = new LoginControllerImpl();
		}
		return instance;
	}

	private LoginControllerImpl() throws RemoteException {
		super();
	}

	public Jugador autenticar(String username, char[] password) throws RemoteException {
		JugadorServicio js = new JugadorServicio();
		// js.getUsuario(username);

		js.getUsuario(username, password);

		Jugador jugador = new Jugador();
		// jugador.setId(25);
		return jugador;
	}

	/*
	 * public List<User> consulta() throws RemoteException{
	 * 
	 * JServicio js = new JServicio(); js.conecDb();
	 * 
	 * 
	 * String query = "select * from usuario"; Query emquery = em.
	 * 
	 * }
	 */

}
