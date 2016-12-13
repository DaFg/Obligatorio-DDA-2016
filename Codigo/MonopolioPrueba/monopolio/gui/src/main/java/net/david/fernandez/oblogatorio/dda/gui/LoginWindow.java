package net.david.fernandez.oblogatorio.dda.gui;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.text.Keymap;

import net.david.fernandez.oblogatorio.dda.common.Server;
import net.david.fernandez.oblogatorio.dda.common.dto.Jugador;
import net.david.fernandez.oblogatorio.dda.common.dto.UsuarioCom;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.awt.event.ActionEvent;

public class LoginWindow {

	JFrame frmMonopolio;
	private JTextField txtNombre;
	private JPasswordField pFcontrasenia;
	private Server server;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { LoginWindow window = new
	 * LoginWindow(); window.frmMonopolio.setVisible(true); } catch (Exception
	 * e) { e.printStackTrace(); } } }); }
	 */

	/**
	 * Create the application.
	 */
	public LoginWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMonopolio = new JFrame();
		frmMonopolio.setTitle("Monopolio");
		frmMonopolio.setBounds(100, 100, 380, 267);
		frmMonopolio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frmMonopolio.getContentPane().setLayout(springLayout);

		JLabel lblLogin = new JLabel("Login");
		springLayout.putConstraint(SpringLayout.NORTH, lblLogin, 10, SpringLayout.NORTH, frmMonopolio.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblLogin, 169, SpringLayout.WEST, frmMonopolio.getContentPane());
		frmMonopolio.getContentPane().add(lblLogin);

		JLabel lblNombre = new JLabel("Nombre:");
		frmMonopolio.getContentPane().add(lblNombre);

		txtNombre = new JTextField();
		springLayout.putConstraint(SpringLayout.EAST, lblNombre, -11, SpringLayout.WEST, txtNombre);
		springLayout.putConstraint(SpringLayout.NORTH, txtNombre, 46, SpringLayout.SOUTH, lblLogin);
		springLayout.putConstraint(SpringLayout.WEST, txtNombre, 128, SpringLayout.WEST, frmMonopolio.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, txtNombre, -141, SpringLayout.EAST,
				frmMonopolio.getContentPane());
		frmMonopolio.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);

		JLabel lblContrasenia = new JLabel("Contraseña:");
		springLayout.putConstraint(SpringLayout.SOUTH, lblNombre, -21, SpringLayout.NORTH, lblContrasenia);
		springLayout.putConstraint(SpringLayout.NORTH, lblContrasenia, 16, SpringLayout.SOUTH, txtNombre);
		springLayout.putConstraint(SpringLayout.EAST, lblContrasenia, -230, SpringLayout.EAST,
				frmMonopolio.getContentPane());
		frmMonopolio.getContentPane().add(lblContrasenia);

		pFcontrasenia = new JPasswordField();
		springLayout.putConstraint(SpringLayout.NORTH, pFcontrasenia, 14, SpringLayout.SOUTH, txtNombre);
		springLayout.putConstraint(SpringLayout.WEST, pFcontrasenia, 154, SpringLayout.WEST,
				frmMonopolio.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, pFcontrasenia, -141, SpringLayout.EAST,
				frmMonopolio.getContentPane());
		frmMonopolio.getContentPane().add(pFcontrasenia);

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = txtNombre.getText();
				// String password = pFcontrasenia.getPassword().toString();
				String p = pFcontrasenia.getText();
				// char[] pass = pFcontrasenia.getPassword().toString();
				System.out.println("Esto es lo que recivo del usuario po la GUI");
				System.out.println(username);
				System.out.println(p);
				try {
					// server.sendLogin(username, p);// para enviar.//
					// Jugador jugador =
					// server.getLoginController().autenticar(username, p);
					System.out.println("Estoy en el boton login");
					// UsuarioCom jugador =
					// server.getLoginController().autenticarUS(username, p);
					Jugador jugador = server.getLoginController().autenticar(username, p);
					// User jugador =
					// server.getLoginController().autenticarU(username,
					// p);
					System.out.println("Estoy en el boton login 2");
					if (jugador != null) {
						TableroIU tablero = new TableroIU();
						tablero.getFrame().setVisible(true);
						tablero.setServer(server);
						frmMonopolio.setVisible(false);
						// exito
					} else {
						frmMonopolio.setVisible(false);
						TableroIU tablero = new TableroIU();
						tablero.getFrame().setVisible(true);

						tablero.setServer(server);
						// no exito
					}
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnLogin, 39, SpringLayout.SOUTH, pFcontrasenia);
		springLayout.putConstraint(SpringLayout.WEST, btnLogin, 145, SpringLayout.WEST, frmMonopolio.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnLogin, -145, SpringLayout.EAST, frmMonopolio.getContentPane());
		frmMonopolio.getContentPane().add(btnLogin);
	}

	public void setServer(Server ser) {
		this.server = ser;
	}
}
