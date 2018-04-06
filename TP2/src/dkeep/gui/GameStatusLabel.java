package dkeep.gui;

import dkeep.logic.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

// TODO: Auto-generated Javadoc
/**
 * The Class GameStatusLabel.
 */
public class GameStatusLabel {
	
	/** The lbl status. */
	private JLabel lblStatus;
	
	/**
	 * Instantiates a new game status label.
	 *
	 * @param frame the frame
	 * @param textArea the text area
	 * @param game the game
	 */
	public GameStatusLabel(JFrame frame, MapTextArea textArea, Game game)
	{
		lblStatus = new JLabel("<html>You can start a new game.</html>");
		lblStatus.setBounds(293, 210, 139, 55);
		frame.getContentPane().add(lblStatus);
		textArea.drawMap(game.getMap().getBaseMap());
		
	}
	
	/**
	 * Sets the text.
	 *
	 * @param input the new text
	 */
	public void setText(String input)
	{
		lblStatus.setText(input);
	}
}
