package dkeep.gui;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MapTextArea {
	JTextArea textArea;
	
	public MapTextArea(JFrame frame)
	{
		textArea = new JTextArea();
		textArea.setFont(new Font("Courier New", Font.PLAIN, 13));
		textArea.setBounds(12, 77, 269, 175);
		frame.getContentPane().add(textArea);
	}
	
	public void setText(String input)
	{
		textArea.setText(input);
	}
}
