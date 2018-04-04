package dkeep.gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class NumberOgresInput {
	
	private JTextField fldOgresInput;
	
	public NumberOgresInput(JFrame frame)
	{
		fldOgresInput = new JTextField();
		fldOgresInput.setBounds(120, 13, 53, 22);
		frame.getContentPane().add(fldOgresInput);
		fldOgresInput.setColumns(10);
		fldOgresInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				String input = fldOgresInput.getText();
				//checking if input is an int between 0 and 10
				boolean isNumber = Pattern.matches("[1-6]+", input);
				int numberOgres = 0;
				
				if(isNumber) {
				   numberOgres = Integer.parseInt(input);
				}
				//set the number of ogres in the game to numberOgres
				/*TODO*/
			}
		});
	}

}
