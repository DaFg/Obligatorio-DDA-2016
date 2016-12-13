package net.david.fernandez.oblogatorio.dda.server.controller;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import net.david.fernandez.oblogatorio.dda.common.LoginController;
import net.david.fernandez.oblogatorio.dda.common.dto.Jugador;
import net.david.fernandez.oblogatorio.dda.common.dto.UsuarioCom;
import net.david.fernandez.oblogatorio.dda.server.entities.JugadorServicio;
import net.david.fernandez.oblogatorio.dda.server.entities.User;
//import net.david.fernandez.oblogatorio.dda.common.dto.User;

public class LoginControllerImpl extends UnicastRemoteObject implements LoginController {

	private static final long serialVersionUID = 1L;
	private static LoginController instance = null;

	public static LoginController getInstance() throws RemoteException {
		if (instance == null) {
			instance = new LoginControllerImpl();
		}
		return instance;
	}

	public LoginControllerImpl() throws RemoteException {
		super();
	}

	public Jugador autenticar(String username, String password) throws RemoteException {
		System.out.println("Estoy en autenticar dentro de loginControllerImpl.");
		Jugador js = new JugadorServicio().getInstance().getUsuario(username, password);
		return js;
	}

	public Object autenticarU(String username, String password) throws RemoteException {
		System.out.println("Estoy en autenticarU dentro de loginControllerImpl.");
		Object juga = new JugadorServicio().getInstance().getDatosUsuario(username, password);
		return juga;
	}

	

	public Object autenticarUS(String username, String password) throws RemoteException {
		System.out.println("Estoy en autenticar dentro de loginControllerImpl.");
		Object js = new JugadorServicio().getInstance().getDatosUsuario(username, password);
		return js;
	}

}