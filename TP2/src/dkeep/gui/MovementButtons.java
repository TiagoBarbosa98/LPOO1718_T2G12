package dkeep.gui;

import dkeep.logic.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import dkeep.logic.Game;

// TODO: Auto-generated Javadoc
/**
 * The Class MovementButtons.
 */
public class MovementButtons{
	
	/** The btn DOWN. */
	JButton btnDOWN = new JButton("Down");
	
	/** The btn LEFT. */
	JButton btnLEFT = new JButton("Left");
	
	/** The btn UP. */
	JButton btnUP = new JButton("Up");
	
	/** The btn RIGHT. */
	JButton btnRIGHT = new JButton("Right");
	
	/** The text area. */
	private static MapTextArea textArea;
	
	/** The game. */
	private static Game game;
	
	
	/**
	 * Instantiates a new movement buttons.
	 *
	 * @param frame the frame
	 * @param textArea the text area
	 * @param game the game
	 */
	public MovementButtons(JFrame frame, MapTextArea textArea, Game game)
	{
		this.textArea = textArea;
		this.game = game;
		
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
				updateGame(1, 0);
			}
		});


		btnLEFT.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				updateGame(0, -1);

				/*TODO*/

			}
		});

		btnUP.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//same as if the user had pressed the W key
				updateGame(-1, 0);
				
			}
		});


		btnRIGHT.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//same as if the user had pressed the D key
				Map map = game.getMap();
				Hero hero = game.getHero();
				if (map.getMap()[hero.getX()][game.getMap().getHero().getY() - 1] != 'I') {
					updateGame(0, 1);
					}
			}
		});
	}
	
	
	/**
	 * Enable movement input.
	 */
	public void enableMovementInput()
	{
		btnDOWN.setEnabled(true);
		btnUP.setEnabled(true);
		btnRIGHT.setEnabled(true);
		btnLEFT.setEnabled(true);
	}
	
	/**
	 * Update game.
	 *
	 * @param x the x
	 * @param y the y
	 */
	public void updateGame(int x, int y)
	{
		Hero hero = game.getHero();
		Map map = game.getMap();
		
		
		hero.setOldX(hero.getX());
		hero.setOldY(hero.getY());
		hero.setX(hero.getX() + x);
		hero.setY(hero.getY() + y);
		
		
		map.updateEntities();
		map.resetMap();
		map.drawEntities();
			
		
		textArea.drawMap(map.getMap());
	}
}