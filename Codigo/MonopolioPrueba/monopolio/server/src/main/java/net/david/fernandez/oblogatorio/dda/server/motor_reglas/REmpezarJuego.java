package net.david.fernandez.oblogatorio.dda.server.motor_reglas;

import net.david.fernandez.oblogatorio.dda.server.dominio.Tablero;
import net.david.fernandez.oblogatorio.dda.server.motor_reglas.ReglasFactory.Opcion;

public class REmpezarJuego implements Regla {

	private Regla siguienteRegla;
	private Tablero tablero;
	
	public REmpezarJuego(Tablero tablero) {
		this.tablero=tablero;
	}
	public REmpezarJuego(Regla siguienteRegla) {
		this.setSiguienteRegla(siguienteRegla);
	}

	public Regla getSiguienteRegla() {
		return siguienteRegla;
	}

	public void setSiguienteRegla(Regla siguienteRegla) {
		this.siguienteRegla = siguienteRegla;
	}

	@Override
	public void accion(OpcionesParaElJugador accionesJugador, AccionJugador jugadaCliente) {
		// TODO Auto-generated method stub
		if(jugadaCliente.getAccion().equals("INICIO_PARTIDA")) { 
			accionesJugador.setJugadorSiguiente(tablero.getJugadores().get(0)); /* setear el jugador que va a inicia*/
			accionesJugador.getOpcionesJugador().add(new AccionJugador("TIRAR_DADOS"));
		
		} else {
			siguienteRegla.accion(accionesJugador, jugadaCliente);
		}	
	}
}
 