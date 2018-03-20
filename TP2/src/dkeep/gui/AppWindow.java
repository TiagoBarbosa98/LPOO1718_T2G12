package dkeep.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;

public class AppWindow {

	private JFrame frmDungeonKeep;
	private JTextField fldOgresInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppWindow window = new AppWindow();
					window.frmDungeonKeep.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDungeonKeep = new JFrame();
		frmDungeonKeep.setTitle("Dungeon Keep");
		frmDungeonKeep.setResizable(false);
		frmDungeonKeep.setBounds(100, 100, 700, 500);
		frmDungeonKeep.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDungeonKeep.getContentPane().setLayout(null);
		
		JLabel lblStatus = new JLabel("<html>You can start a new game.</html>");
		lblStatus.setBounds(293, 210, 139, 55);
		frmDungeonKeep.getContentPane().add(lblStatus);
		
		JLabel lblNumberOgres = new JLabel("Number of Ogres");
		lblNumberOgres.setBounds(12, 13, 98, 16);
		frmDungeonKeep.getContentPane().add(lblNumberOgres);
		
		fldOgresInput = new JTextField();
		fldOgresInput.setBounds(120, 13, 53, 22);
		frmDungeonKeep.getContentPane().add(fldOgresInput);
		fldOgresInput.setColumns(10);
		fldOgresInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				String input = fldOgresInput.getText();
				//checking if input is an int between 0 and 10
				boolean isNumber = Pattern.matches("[0-9]+", input);
				int numberOgres = 0;
				
				if(isNumber) {
				   numberOgres = Integer.parseInt(input);
				}
				//set the number of ogres to numberOgres
			}
		});
		
		JLabel lblGuardPersonality = new JLabel("Guard personality");
		lblGuardPersonality.setBounds(12, 42, 100, 16);
		frmDungeonKeep.getContentPane().add(lblGuardPersonality);
		
		
		
		String[] ogrePersonalities = {"Rookie", "Drunken", "Suspicious"};
		JComboBox comboBox = new JComboBox(ogrePersonalities);
		comboBox.setToolTipText("");
		comboBox.setEditable(true);
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(120, 42, 121, 22);
		frmDungeonKeep.getContentPane().add(comboBox);
		
		JButton btnNewGame = new JButton("New Game");
		btnNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblStatus.setText("<html>Playing first level.</html>");
				/*
				 * Initialize the game on the first level
				 * After finishing the first level
				 */
				lblStatus.setText("<html>Playing the second level.</html>");
			}
		});
		
		btnNewGame.setBounds(320, 13, 97, 25);
		frmDungeonKeep.getContentPane().add(btnNewGame);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(320, 43, 97, 25);
		frmDungeonKeep.getContentPane().add(btnExit);
		btnExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Courier New", Font.PLAIN, 13));
		textArea.setBounds(12, 77, 269, 175);
		frmDungeonKeep.getContentPane().add(textArea);
		
		JButton btnDOWN = new JButton("Down");
		btnDOWN.setBounds(331, 182, 65, 25);
		frmDungeonKeep.getContentPane().add(btnDOWN);
		btnDOWN.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//same as if the user had pressed the S key
			}
		});
		
		JButton btnLeft = new JButton("Left");
		btnLeft.setBounds(297, 150, 61, 25);
		frmDungeonKeep.getContentPane().add(btnLeft);
		btnLeft.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//same as if the user had pressed the A key
			}
		});
		
		JButton btnUP = new JButton("Up");
		btnUP.setBounds(331, 118, 65, 25);
		frmDungeonKeep.getContentPane().add(btnUP);
		btnUP.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//same as if the user had pressed the W key
			}
		});
		
		JButton btnRight = new JButton("Right");
		btnRight.setBounds(371, 150, 61, 25);
		frmDungeonKeep.getContentPane().add(btnRight);
		btnRight.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//same as if the user had pressed the D key
			}
		});

	}
	
}
