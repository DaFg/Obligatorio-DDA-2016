package net.david.fernandez.oblogatorio.dda.server;

import java.io.InputStream;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import net.david.fernandez.oblogatorio.dda.common.LoginController;
import net.david.fernandez.oblogatorio.dda.common.PartidaController;
import net.david.fernandez.oblogatorio.dda.common.Server;
import net.david.fernandez.oblogatorio.dda.common.dto.Jugador;
import net.david.fernandez.oblogatorio.dda.server.controller.LoginControllerImpl;
import net.david.fernandez.oblogatorio.dda.server.controller.PartidaControllerImpl;

import net.david.fernandez.oblogatorio.dda.server.dominio.Login;

public class ServerImpl implements Server {

	private List<Jugador> jugadores;

	@SuppressWarnings("deprecation")
	public ServerImpl () {
		String path = "C:\\java.policy";
		path = path.replace("\\", "/");
		System.setProperty("java.security.policy", "file:///" + path);
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new RMISecurityManager());
		}
		
		this.jugadores = new ArrayList<Jugador>();
	}

	public void sendLogin(String n, char[] c) throws RemoteException {
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
	

	


}
