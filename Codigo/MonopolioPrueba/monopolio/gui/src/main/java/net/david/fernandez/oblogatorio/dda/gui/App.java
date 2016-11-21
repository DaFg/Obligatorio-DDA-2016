package net.david.fernandez.oblogatorio.dda.gui;

import java.awt.EventQueue;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import net.david.fernandez.oblogatorio.dda.common.Server;

/**
 * Hello world!
 *
 */
public class App extends UnicastRemoteObject {

	private Server ser;
	private LoginWindow lw;

	public static void main(String[] args) throws RemoteException {
		System.out.println("Hello World! <--App GUI-->");
		System.out.println("Hello World! <--1-->");
		App app = new App();

	}

	public App() throws RemoteException {

		System.setProperty("java.security.policy", "file:////java.policy");
		final App app = this;

		EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {
					lw = new LoginWindow();
					System.out.println("Hello World <--2-->");
					Registry registry = LocateRegistry.getRegistry(1099);
					ser = (Server) registry.lookup("ser");
					lw.frmMonopolio.setVisible(true);
					lw.setServer(ser);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
}
