package dkeep.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import dkeep.logic.Game;

public class MovementButtons {
	JButton btnDOWN = new JButton("Down");
	JButton btnLEFT = new JButton("Left");
	JButton btnUP = new JButton("Up");
	JButton btnRIGHT = new JButton("Right");
	
	public MovementButtons(JFrame frame, Game game, MapTextArea textArea)
	{
		btnDOWN.setBounds(331, 182, 65, 25);
		frame.getContentPane().add(btnDOWN);
		btnDOWN.setEnabled(false);

		
		btnLEFT.setBounds(297, 150, 61, 25);
		frame.getContentPane().add(btnLEFT);
		btnLEFT.setEnabled(false);


		
		btnUP.setBounds(331, 118, 65, 25);
		frame.getContentPane().add(btnUP);
		btnUP.setEnabled(false);

		
		btnRIGHT.setBounds(371, 150, 61, 25);
		frame.getContentPane().add(btnRIGHT);
		btnRIGHT.setEnabled(false);
		

		btnDOWN.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//same as if the user had pressed the S key
				game.getHero().setOldX(game.getHero().getX());
				game.getHero().setOldY(game.getHero().getY());
				game.getHero().setX(game.getHero().getX() + 1);
			}
		});


		btnLEFT.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//same as if the user had pressed the A key
				game.getHero().setOldX(game.getHero().getX());
				game.getHero().setOldY(game.getHero().getY());
				game.getHero().setY(game.getHero().getY() - 1);

				//make changes to Game class first to correct this code
				/*TODO*/
				//clears the text area
				textArea.setText(null);
				//game.playGame(); //without the update entity
				game.setBuffer();
			}
		});

		btnUP.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//same as if the user had pressed the W key
				game.getHero().setOldX(game.getHero().getX());
				game.getHero().setOldY(game.getHero().getY());
				game.getHero().setX(game.getHero().getX() - 1);
				
			}
		});


		btnRIGHT.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//same as if the user had pressed the D key
				game.getHero().setOldX(game.getHero().getX());
				game.getHero().setOldY(game.getHero().getY());
				game.getHero().setY(game.getHero().getY() + 1);
			}
		});
	}
	
	
	public void enableMovementInput()
	{
		btnDOWN.setEnabled(true);
		btnUP.setEnabled(true);
		btnRIGHT.setEnabled(true);
		btnLEFT.setEnabled(true);
	}
}