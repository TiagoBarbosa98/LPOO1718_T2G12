package dkeep.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GuardPersoMsg {
	public GuardPersoMsg(JFrame frame)
	{
		JLabel lblGuardPersonality = new JLabel("Guard personality");
		lblGuardPersonality.setBounds(12, 42, 100, 16);
		frame.getContentPane().add(lblGuardPersonality);
	}

}
