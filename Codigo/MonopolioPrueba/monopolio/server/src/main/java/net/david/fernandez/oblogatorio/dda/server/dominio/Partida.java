package net.david.fernandez.oblogatorio.dda.server.dominio;

import java.util.ArrayList;
import java.util.List;
import net.david.fernandez.oblogatorio.dda.common.dto.Jugador;

public class Partida{
	private static List<Jugador> jugadores;

	public Partida() {
		jugadores = new ArrayList<Jugador>();
	}
	
	public void agregarJugador(Jugador jugador){
		if(jugadores.size() <= 4){
			jugadores.add(jugador);
		}
	}
	
	public List<Jugador> darJugadoresEnPartida(){
		return jugadores;
	}
		
}
