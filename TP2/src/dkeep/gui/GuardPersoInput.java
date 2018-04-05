package dkeep.gui;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GuardPersoInput {
	public GuardPersoInput(JFrame frame)
	{
		String[] ogrePersonalities = {"Rookie", "Drunken", "Suspicious"};
		JComboBox comboBox = new JComboBox(ogrePersonalities);
		comboBox.setToolTipText("");
		comboBox.setEditable(true);
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(120, 42, 121, 22);
		frame.getContentPane().add(comboBox);
	}
}
