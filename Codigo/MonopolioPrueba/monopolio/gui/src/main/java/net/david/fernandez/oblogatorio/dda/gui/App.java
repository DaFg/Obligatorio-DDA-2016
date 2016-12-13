package net.david.fernandez.oblogatorio.dda.gui;

import java.awt.EventQueue;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import net.david.fernandez.oblogatorio.dda.common.MarcaEsObservable;
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

		//System.setProperty("java.security.policy", "file:////java.policy");
		System.setProperty("java.security.policy", "file://c:/java.policy");
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
	public void agregarJugador(Jugador jugador) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void agregarObserver(MarcaEsObservable observer) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Jugador> darJugadoresEnPartida() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void accion(Jugador jugador, String accion, boolean dueño) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void empezarPartida() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarPosicionJugador(int posAnterior, int jugadorPos, int posicion) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cambiarTurno(int jugPos) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comprarPropiedad(Jugador jugador, int posicion) throws RemoteException {
		// TODO Auto-generated method stub
		
	}
}
