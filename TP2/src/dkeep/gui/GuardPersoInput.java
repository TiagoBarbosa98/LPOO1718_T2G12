package dkeep.gui;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

// TODO: Auto-generated Javadoc
/**
 * The Class GuardPersoInput.
 */
public class GuardPersoInput {
	
	/**
	 * Instantiates a new guard perso input.
	 *
	 * @param frame the frame
	 */
	public GuardPersoInput(JFrame frame)
	{
		String[] ogrePersonalities = {"Rookie", "Drunken", "Suspicious"};
		JComboBox comboBox = new JComboBox(ogrePersonalities);
		comboBox.setToolTipText("");
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(120, 42, 121, 22);
		frame.getContentPane().add(comboBox);
	}
}
