package net.david.fernandez.oblogatorio.dda.server.controller;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import net.david.fernandez.oblogatorio.dda.common.PartidaController;

public class PartidaControllerImpl extends UnicastRemoteObject implements PartidaController {

	private static PartidaController instance = null;
	
	public static PartidaController getInstance() throws RemoteException {
		if(instance == null) {
			instance = new PartidaControllerImpl();
		}
		return instance;
	}
	
	public PartidaControllerImpl() throws RemoteException {
		super();
	}

	public void actualizar() throws RemoteException {
		// TODO Auto-generated method stub
		
	}


}
