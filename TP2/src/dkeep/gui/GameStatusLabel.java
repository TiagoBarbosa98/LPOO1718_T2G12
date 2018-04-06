package dkeep.gui;

import dkeep.logic.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameStatusLabel {
	
	private JLabel lblStatus;
	
	public GameStatusLabel(JFrame frame, MapTextArea textArea, Game game)
	{
		lblStatus = new JLabel("<html>You can start a new game.</html>");
		lblStatus.setBounds(293, 210, 139, 55);
		frame.getContentPane().add(lblStatus);
		textArea.drawMap(game.getMap().getBaseMap());
		
	}
	
	public void setText(String input)
	{
		lblStatus.setText(input);
	}
}
