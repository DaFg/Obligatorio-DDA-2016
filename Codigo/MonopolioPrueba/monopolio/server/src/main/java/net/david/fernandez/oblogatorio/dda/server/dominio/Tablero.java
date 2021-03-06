package net.david.fernandez.oblogatorio.dda.server.dominio;

import java.util.ArrayList;
import java.util.List;

import net.david.fernandez.oblogatorio.dda.common.dto.Jugador;

public class Tablero {

	private Casilla[] board = new Casilla[16];
	private List<Jugador> jugadores = null;

	public Tablero() {

		board[0] = new Go();
		board[1] = new Estate("Avenida Mediterranea", 60, 30, 2, 50, 50, 10, 30, 90, 160, 250);
		board[2] = new Comunidad("Cofre comunidad");
		board[3] = new Estate("Avenida Baltico", 60, 30, 4, 50, 50, 20, 60, 180, 320, 450);
		board[4] = new Casilla("Jail");

		board[5] = new Estate("Plaza San Carlos", 140, 70, 10, 100, 100, 50, 150, 450, 625, 750);
		board[6] = new Estate("Avenida Estados", 140, 70, 10, 100, 100, 50, 150, 450, 625, 750);
		board[7] = new Estate("Avenida Virginia", 160, 80, 12, 100, 100, 60, 180, 500, 700, 900);
		board[8] = new Casilla("Free Parking");

		board[9] = new Estate("Avenida Kentucky", 220, 110, 18, 150, 150, 90, 250, 700, 875, 1050);
		board[10] = new Suerte("Suerte");
		board[11] = new Estate("Avenida Indiana", 220, 110, 18, 150, 150, 90, 250, 700, 875, 1050);
		board[12] = new GoToJail();

		board[13] = new Estate("Avenida Pacifico", 300, 150, 26, 200, 200, 130, 390, 900, 1100, 1275);
		board[14] = new Estate("Avenida Carolina del Norte", 300, 150, 26, 200, 200, 130, 390, 900, 1100, 1275);
		board[15] = new Estate("Avenida Pennsylvania ", 320, 160, 28, 200, 200, 150, 450, 1000, 1200, 1400);

		this.jugadores = new ArrayList<Jugador>();

	}

	public Casilla[] getBoard() {
		return board;
	}

	public void setBoard(Casilla[] board) {
		this.board = board;
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public Casilla getLocation(int num) {
		return board[num];
	}

}
