package dkeep.gui;

import java.awt.EventQueue;
import dkeep.logic.*;

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
	private static Game game = new Game();

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
		
		GameStatusLabel gameStatus = new GameStatusLabel(frmDungeonKeep);
		GuardPersoInput guardInput = new GuardPersoInput(frmDungeonKeep);
		GuardPersoMsg guardMsg = new GuardPersoMsg(frmDungeonKeep);
		MapTextArea textArea = new MapTextArea(frmDungeonKeep);
		MovementButtons movButtons = new MovementButtons(frmDungeonKeep, game, textArea);
		NumberOgresInput ogresInput = new NumberOgresInput(frmDungeonKeep);
		NumberOgresMsg ogresMsg = new NumberOgresMsg(frmDungeonKeep);
		NewExitButtons newExitButtons = new NewExitButtons(frmDungeonKeep, game, movButtons, gameStatus);
		
		//Delete this after final changes
	
	}
	
}
