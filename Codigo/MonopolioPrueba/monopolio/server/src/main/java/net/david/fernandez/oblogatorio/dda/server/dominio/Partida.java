package net.david.fernandez.oblogatorio.dda.server.dominio;

import java.awt.Canvas;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import net.david.fernandez.oblogatorio.dda.server.imports.AlQueue;

public class Partida extends Canvas implements Runnable{

	private static final long serialVersionUID=1L;
	public Monopoly board;
	private AlQueue<Jugador> jugadores;
	private Suerte suerte;
	private Comunidad comunidad;
	public static final int WIDTH = 500, HEIGHT = WIDTH / 12 * 9;
	public static final String NAME = "Monopoly";

	private JFrame frame;
	private JPanel sidePanel;
	private JPanel overPanel;
	private Thread thread;
	//private ImagePanel panel;
	private JButton newGame, buy, payRent, draw, nextTurn;
	private JTextArea scoreBoard;

	private Jugador currPlayer;
	private ArrayList<Integer> locP; // locations of players;
	private int turns;// turns left in the game
	private int numPlayers;
	
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	

}
