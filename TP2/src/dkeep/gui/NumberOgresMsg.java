package dkeep.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NumberOgresMsg {
	public NumberOgresMsg(JFrame frame)
	{
		JLabel lblNumberOgres = new JLabel("Number of Ogres");
		lblNumberOgres.setBounds(12, 13, 98, 16);
		frame.getContentPane().add(lblNumberOgres);
	}

}
