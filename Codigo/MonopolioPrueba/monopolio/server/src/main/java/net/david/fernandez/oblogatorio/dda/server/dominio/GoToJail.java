package net.david.fernandez.oblogatorio.dda.server.dominio;

import net.david.fernandez.oblogatorio.dda.common.dto.Jugador;

public class GoToJail extends Casilla {

	public GoToJail() {
		super("Go to Jail");
	}
	public void irAlaCarcel(Jugador jugador){
		
		jugador.setPosicion(4);
		jugador.setEnCarcel(true);
	}

}
