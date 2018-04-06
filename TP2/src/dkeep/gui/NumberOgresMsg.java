package dkeep.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;

// TODO: Auto-generated Javadoc
/**
 * The Class NumberOgresMsg.
 */
public class NumberOgresMsg {
	
	/**
	 * Instantiates a new number ogres msg.
	 *
	 * @param frame the frame
	 */
	public NumberOgresMsg(JFrame frame)
	{
		JLabel lblNumberOgres = new JLabel("Number of Ogres");
		lblNumberOgres.setBounds(12, 13, 98, 16);
		frame.getContentPane().add(lblNumberOgres);
	}

}
