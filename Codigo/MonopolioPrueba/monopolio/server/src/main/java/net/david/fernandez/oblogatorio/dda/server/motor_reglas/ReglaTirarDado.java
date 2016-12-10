package net.david.fernandez.oblogatorio.dda.server.motor_reglas;

import net.david.fernandez.oblogatorio.dda.server.dominio.Tablero;

public class ReglaTirarDado implements Regla {
	private Regla siguienteRegla;
	private Tablero tablero;
	
	public ReglaTirarDado(Tablero tablero) {
		this.tablero = tablero;
	}

	public ReglaTirarDado(Regla siguienteRegla) {
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
		if(jugadaCliente.getAccion().equals("TIRAR_DADOS")) { 
			// TODO	tirar dados y devolverlos al jugador
			accionesJugador.setValorDados(tirarDados());
			accionesJugador.setJugadorSiguiente(accionesJugador.getJugadorActual());
			//if(accionesJugador.getJugadorActual())
			accionesJugador.getOpcionesJugador().add(new AccionJugador(""));
			
		} else {
			siguienteRegla.accion(accionesJugador, jugadaCliente);
		}
	}
	public int[] tirarDados(){
		int[] valores= new int[2];
		valores[1]=(int) (Math.random() * 6) + 1;
		valores[0]=(int) (Math.random() * 6) + 1;
		
		return valores;
	}
}
