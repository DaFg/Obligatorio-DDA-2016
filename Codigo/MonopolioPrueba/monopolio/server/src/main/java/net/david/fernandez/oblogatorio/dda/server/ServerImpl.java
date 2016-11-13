package net.david.fernandez.oblogatorio.dda.server;

import java.rmi.RemoteException;

import net.david.fernandez.oblogatorio.dda.monopolio.Server;
import net.david.fernandez.oblogatorio.dda.server.dominio.Login;
import net.david.fernandez.oblogatorio.dda.server.entities.LoginController;

public class ServerImpl implements Server {

	public ServerImpl() {
		String path = "C:\\java.policy";
		path = path.replace("\\", "/");
		System.setProperty("java.security.policy", "file:///" + path);
	}

	public void sendLogin(String n, char[] c) throws RemoteException {
		System.out.println("Muestro lo que llega desde la GUI a ServerImpl");
		System.out.println(n);
		System.out.println(c);
		

		Login lo = new Login();
		lo.resivirLogin(n, c);
	}

	/*
	 * public void sendLogin(String n, String string) throws RemoteException {
	 * System.out.println(string); }
	 */

}
