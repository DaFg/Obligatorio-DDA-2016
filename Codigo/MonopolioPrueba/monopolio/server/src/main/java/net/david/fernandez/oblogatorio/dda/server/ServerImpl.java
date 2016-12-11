package net.david.fernandez.oblogatorio.dda.server;

import java.io.InputStream;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import net.david.fernandez.oblogatorio.dda.common.LoginController;
import net.david.fernandez.oblogatorio.dda.common.MarcaEsObservable;
import net.david.fernandez.oblogatorio.dda.common.PartidaController;
import net.david.fernandez.oblogatorio.dda.common.Server;
import net.david.fernandez.oblogatorio.dda.common.dto.Jugador;
import net.david.fernandez.oblogatorio.dda.server.controller.LoginControllerImpl;
import net.david.fernandez.oblogatorio.dda.server.controller.PartidaControllerImpl;

import net.david.fernandez.oblogatorio.dda.server.dominio.Login;

public class ServerImpl implements Server {

	private List<Jugador> jugadores;
	private LoginController loginController;
	private PartidaController partidaController;
	
	@SuppressWarnings("deprecation")
	public ServerImpl() {
		System.out.println("Estoy en ServerImpl");
		System.setProperty("java.security.policy", "file://c:/java.policy");
		
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new RMISecurityManager());
		}
		this.jugadores = new ArrayList<Jugador>();
		this.loginController = new LoginControllerImpl();
		this.partidaController = new PartidaControllerImpl()
	}

	public void sendLogin(String n, String c) throws RemoteException {
		System.out.println("Muestro lo que llega desde la GUI a ServerImpl");
		System.out.println(n);
		System.out.println(c);

		Login lo = new Login();
		lo.resivirLogin(n, c);
	}

	public LoginController getLoginController() throws RemoteException {
		return LoginControllerImpl.getInstance();
	}

	public PartidaController getPartidaController() throws RemoteException {
		return PartidaControllerImpl.getInstance();
	}

	public void addJugador(Jugador jugador) throws RemoteException {
		this.jugadores.add(jugador);
	}

	@Override
	public List<MarcaEsObservable> getObservers() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sendMessage(String message) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int tirarDado() throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addObserver(MarcaEsObservable observer) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setJugador(Jugador jugador) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pagarMulta(Jugador dueño, int cantidad) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
