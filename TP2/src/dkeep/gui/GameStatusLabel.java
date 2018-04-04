package dkeep.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameStatusLabel {
	
	JLabel lblStatus;
	
	public GameStatusLabel(JFrame frame)
	{
		lblStatus = new JLabel("<html>You can start a new game.</html>");
		lblStatus.setBounds(293, 210, 139, 55);
		frame.getContentPane().add(lblStatus);
	}
	
	public void setText(String input)
	{
		lblStatus.setText(input);
	}
}
