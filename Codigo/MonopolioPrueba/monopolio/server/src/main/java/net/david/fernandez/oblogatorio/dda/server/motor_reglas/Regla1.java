package net.david.fernandez.oblogatorio.dda.server.motor_reglas;

import net.david.fernandez.oblogatorio.dda.server.motor_reglas.ReglasFactory.Opcion;

public class Regla1 implements Regla {

	private Regla siguienteRegla;

	public Regla1(Regla siguienteRegla) {
		this.setSiguienteRegla(siguienteRegla);
	}

	public void accion(OpcionesParaJugador opcionesParaJugador, Opcion jugadaDelCliente) {

		if (jugadaDelCliente.equals("1")) {
			opcionesParaJugador.getOpciones().add("1");
		}

	}

	public Regla getSiguienteRegla() {
		return siguienteRegla;
	}

	public void setSiguienteRegla(Regla siguienteRegla) {
		this.siguienteRegla = siguienteRegla;
	}

	
}
 