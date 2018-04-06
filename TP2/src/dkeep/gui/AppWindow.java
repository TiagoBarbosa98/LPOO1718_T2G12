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

// TODO: Auto-generated Javadoc
/**
 * The Class AppWindow.
 */
public class AppWindow {

	/** The frm dungeon keep. */
	private JFrame frmDungeonKeep;
	
	/** The fld ogres input. */
	private JTextField fldOgresInput;
	
	/** The game. */
	protected static Game game = new Game();

	/**
	 * Launch the application.
	 *
	 * @param args the arguments
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
	
	public Game getGame()
	{
		return game;
	}
 
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		game = new Game();
		frmDungeonKeep = new JFrame();
		frmDungeonKeep.setTitle("Dungeon Keep");
		frmDungeonKeep.setResizable(false);
		frmDungeonKeep.setBounds(100, 100, 700, 500);
		frmDungeonKeep.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDungeonKeep.getContentPane().setLayout(null);
		
		GuardPersoInput guardInput = new GuardPersoInput(frmDungeonKeep);
		GuardPersoMsg guardMsg = new GuardPersoMsg(frmDungeonKeep);
		MapTextArea textArea = new MapTextArea(frmDungeonKeep, game);
		GameStatusLabel gameStatus = new GameStatusLabel(frmDungeonKeep, textArea, game);
		MovementButtons movButtons = new MovementButtons(frmDungeonKeep, textArea, game);
		NumberOgresInput ogresInput = new NumberOgresInput(frmDungeonKeep);
		NumberOgresMsg ogresMsg = new NumberOgresMsg(frmDungeonKeep);
		NewExitButtons newExitButtons = new NewExitButtons(frmDungeonKeep, movButtons, gameStatus, this);
		
		//Delete this after final changes
	
	}
	
}
