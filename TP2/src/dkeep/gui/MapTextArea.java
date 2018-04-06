package dkeep.gui;
import dkeep.logic.*;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MapTextArea{
	private static JTextArea textArea;
	private final static String newline = "\n";
	private static Game game;
	
	public MapTextArea(JFrame frame, Game game)
	{
		this.game = game;
		textArea = new JTextArea();
		textArea.setFont(new Font("Courier New", Font.PLAIN, 13));
		textArea.setBounds(12, 77, 269, 175);
		frame.getContentPane().add(textArea);
	}
	
	public void setText(String input)
	{
		textArea.setText(input);
	}
	
	public void append(String input)
	{
		textArea.append(input);
	}
	
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
