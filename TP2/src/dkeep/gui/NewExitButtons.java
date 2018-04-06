package dkeep.gui;

import dkeep.gui.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import dkeep.logic.Game;


// TODO: Auto-generated Javadoc
/**
 * The Class NewExitButtons.
 */
public class NewExitButtons {
	
	/**
	 * Instantiates a new new exit buttons.
	 *
	 * @param frame the frame
	 * @param game the game
	 * @param movButtons the mov buttons
	 * @param gameStatus the game status
	 */
	public NewExitButtons(JFrame frame, Game game, MovementButtons movButtons, GameStatusLabel gameStatus)
	{
		JButton btnNewGame = new JButton("New Game");
		btnNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Changing the game status label
				movButtons.setText("<html>Playing the game.</html>");
				
				//Enabling movement input
				game.enableMovementInput();
				gameStatus.game = new Game();
			}
		});
		
		btnNewGame.setBounds(320, 13, 97, 25);
		frame.getContentPane().add(btnNewGame);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(320, 43, 97, 25);
		frame.getContentPane().add(btnExit);	
		btnExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

	}
}

