package net.david.fernandez.oblogatorio.dda.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import javax.swing.SpringLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TableroIU {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableroIU window = new TableroIU();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TableroIU() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 641, 423);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(197, 80, 227, 216);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnNewButton = new JButton("Tirar dado");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		btnNewButton.setBounds(66, 96, 89, 23);
		panel_4.add(btnNewButton);
		
		JButton btnSi = new JButton("SI");
		btnSi.setBounds(23, 166, 89, 23);
		panel_4.add(btnSi);
		
		JButton btnNo = new JButton("NO");
		btnNo.setBounds(122, 166, 89, 23);
		panel_4.add(btnNo);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		panel.setBounds(124, 11, 74, 71);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.YELLOW);
		panel_1.setBounds(199, 11, 74, 71);
		frame.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GRAY);
		panel_2.setBounds(274, 11, 74, 71);
		frame.getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.YELLOW);
		panel_3.setBounds(350, 11, 74, 71);
		frame.getContentPane().add(panel_3);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.BLUE);
		panel_5.setBounds(424, 11, 74, 71);
		frame.getContentPane().add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.YELLOW);
		panel_6.setBounds(124, 82, 74, 71);
		frame.getContentPane().add(panel_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.YELLOW);
		panel_7.setBounds(124, 153, 74, 71);
		frame.getContentPane().add(panel_7);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.YELLOW);
		panel_8.setBounds(124, 225, 74, 71);
		frame.getContentPane().add(panel_8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.PINK);
		panel_9.setBounds(124, 299, 74, 71);
		frame.getContentPane().add(panel_9);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.YELLOW);
		panel_10.setBounds(424, 82, 74, 71);
		frame.getContentPane().add(panel_10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(Color.YELLOW);
		panel_11.setBounds(424, 153, 74, 71);
		frame.getContentPane().add(panel_11);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(Color.YELLOW);
		panel_12.setBounds(424, 225, 74, 71);
		frame.getContentPane().add(panel_12);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(Color.YELLOW);
		panel_13.setBounds(197, 299, 74, 71);
		frame.getContentPane().add(panel_13);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(Color.GREEN);
		panel_14.setBounds(274, 299, 74, 71);
		frame.getContentPane().add(panel_14);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(Color.YELLOW);
		panel_15.setBounds(350, 299, 74, 71);
		frame.getContentPane().add(panel_15);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(Color.CYAN);
		panel_16.setBounds(424, 299, 74, 71);
		frame.getContentPane().add(panel_16);
	}
}
