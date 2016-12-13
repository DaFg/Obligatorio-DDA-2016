package net.david.fernandez.oblogatorio.dda.server;

import java.io.InputStream;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import net.david.fernandez.oblogatorio.dda.common.LoginController;
import net.david.fernandez.oblogatorio.dda.common.MarcaEsObservable;
import net.david.fernandez.oblogatorio.dda.common.PartidaController;
import net.david.fernandez.oblogatorio.dda.common.Server;
import net.david.fernandez.oblogatorio.dda.common.dto.Jugador;
import net.david.fernandez.oblogatorio.dda.server.controller.LoginControllerImpl;
import net.david.fernandez.oblogatorio.dda.server.controller.PartidaControllerImpl;

import net.david.fernandez.oblogatorio.dda.server.dominio.Login;

public class ServerImpl implements Server {

	private List<MarcaEsObservable> jugadores;
	private LoginController loginController;
	private PartidaController partidaController;
	
	@SuppressWarnings("deprecation")
	public ServerImpl() throws RemoteException {
		System.out.println("Estoy en ServerImpl");
		System.setProperty("java.security.policy", "file://c:/java.policy");
		
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new RMISecurityManager());
		}
		this.jugadores = new ArrayList<MarcaEsObservable>();
		this.loginController = new LoginControllerImpl();
		this.partidaController = new PartidaControllerImpl();
	}

	public void sendLogin(String n, String c) throws RemoteException {
		System.out.println("Muestro lo que llega desde la GUI a ServerImpl");
		System.out.println(n);
		System.out.println(c);

		Login lo = new Login();
		lo.resivirLogin(n, c);
	}

	public LoginController getLoginController() throws RemoteException {
		System.out.println("Muestro lo que llega desde la GUI a ServerImpl");
		return LoginControllerImpl.getInstance();
	}

	public PartidaController getPartidaController() throws RemoteException {
		return partidaController;
	}

	@Override
	public List<MarcaEsObservable> getObservers() throws RemoteException {
		return this.jugadores;
	}

	@Override
	public void sendMessage(String message) throws RemoteException {
		for(MarcaEsObservable o: this.jugadores)
		{
			o.notificar(message);
		}
	}

	@Override
	public int tirarDado() throws RemoteException {
		return ThreadLocalRandom.current().nextInt(1,7);
	}

	@Override
	public void addObserver(MarcaEsObservable observer) throws RemoteException {
		this.jugadores.add(observer);
	}

	@Override
	public void setJugador(Jugador jugador) throws RemoteException {
		for(MarcaEsObservable o : this.jugadores)
		{
			o.setJugador(jugador);
		}
	}

	@Override
	public void pagarMulta(Jugador dueño, int cantidad) throws RemoteException {
		for(MarcaEsObservable o: this.jugadores){
			o.pagarMulta(dueño, cantidad);
		}
	}

}
