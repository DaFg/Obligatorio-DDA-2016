package net.david.fernandez.oblogatorio.dda.server.motor_reglas;

import java.util.ArrayList;
import java.util.List;

public class OpcionesParaJugador {

	private List<String> opciones;
	
	public OpcionesParaJugador() {
		this.setOpciones(new ArrayList<String>());
	}

	public List<String> getOpciones() {
		return opciones;
	}

	public void setOpciones(List<String> opciones) {
		this.opciones = opciones;
	}

}
