package dkeep.gui;
import dkeep.logic.*;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextArea;

// TODO: Auto-generated Javadoc
/**
 * The Class MapTextArea.
 */
public class MapTextArea{
	
	/** The text area. */
	private static JTextArea textArea;
	
	/** The Constant newline. */
	private final static String newline = "\n";
	
	/** The game. */
	private static Game game;
	
	/**
	 * Instantiates a new map text area.
	 *
	 * @param frame the frame
	 * @param game the game
	 */
	public MapTextArea(JFrame frame, Game game)
	{
		this.game = game;
		textArea = new JTextArea();
		textArea.setFont(new Font("Courier New", Font.PLAIN, 13));
		textArea.setBounds(12, 77, 269, 175);
		frame.getContentPane().add(textArea);
	}
	
	/**
	 * Sets the text.
	 *
	 * @param input the new text
	 */
	public void setText(String input)
	{
		textArea.setText(input);
	}
	
	/**
	 * Append.
	 *
	 * @param input the input
	 */
	public void append(String input)
	{
		textArea.append(input);
	}
	
	/**
	 * Draw map.
	 *
	 * @param gameMap the game map
	 */
	public static void drawMap(char[][] gameMap)
	{
		textArea.setText(null);
		//confusing
		String newMap = "";
		double counter = 0;
		
		for(int i = 0; i < gameMap.length; i++)
		{
			for(int j = 0; j < gameMap[i].length; j++)
			{
				textArea.append(Character.toString(gameMap[i][j]) + " ");
			}
			
			textArea.append(newline);
		}
	}
}
