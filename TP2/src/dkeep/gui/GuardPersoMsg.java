package dkeep.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

// TODO: Auto-generated Javadoc
/**
 * The Class GuardPersoMsg.
 */
public class GuardPersoMsg {
	
	/**
	 * Instantiates a new guard perso msg.
	 *
	 * @param frame the frame
	 */
	public GuardPersoMsg(JFrame frame)
	{
		JLabel lblGuardPersonality = new JLabel("Guard personality");
		lblGuardPersonality.setBounds(12, 42, 100, 16);
		frame.getContentPane().add(lblGuardPersonality);
	}

}
