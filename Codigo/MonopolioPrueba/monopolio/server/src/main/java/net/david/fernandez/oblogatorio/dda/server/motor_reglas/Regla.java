package net.david.fernandez.oblogatorio.dda.server.motor_reglas;

import net.david.fernandez.oblogatorio.dda.server.motor_reglas.ReglasFactory.Opcion;

public interface Regla {

	public void accion(OpcionesParaJugador opcionesParaJugador, Opcion jugadaDelCliente);

}
