package net.david.fernandez.oblogatorio.dda.gui;

import java.awt.EventQueue;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import net.david.fernandez.oblogatorio.dda.common.PartidaController;
import net.david.fernandez.oblogatorio.dda.common.Server;
import net.david.fernandez.oblogatorio.dda.common.dto.Jugador;

/**
 * Hello world!
 *
 */
public class App extends UnicastRemoteObject implements PartidaController{

	private Server server;
	private LoginWindow lw;
	private TableroIU tablero;

	public static void main(String[] args) throws RemoteException {
		System.out.println("Hello World! <--App GUI-->");
		System.out.println("Hello World! <--1-->");
		App app = new App();

	}

	public App() throws RemoteException {

		System.setProperty("java.security.policy", "file:////java.policy");
		final App app = this;
		Registry registry = LocateRegistry.getRegistry(1099);
		try {
			server = (Server) registry.lookup("Server");
		} catch (NotBoundException e1) {
			e1.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lw = new LoginWindow();
					System.out.println("Hello World <--2-->");
					lw.frmMonopolio.setVisible(true);
					lw.setServer(server);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	public void recibirOpciones() throws RemoteException {
	 //--this.ser.send
	}

	@Override
	public String notificarAccionDeJugador(Jugador jugador, String[] acciones) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
}
