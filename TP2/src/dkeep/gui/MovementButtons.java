package dkeep.gui;

import dkeep.logic.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import dkeep.logic.Game;

public class MovementButtons{
	JButton btnDOWN = new JButton("Down");
	JButton btnLEFT = new JButton("Left");
	JButton btnUP = new JButton("Up");
	JButton btnRIGHT = new JButton("Right");
	private static MapTextArea textArea;
	private static Game game;
	
	
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
	
	
	public void enableMovementInput()
	{
		btnDOWN.setEnabled(true);
		btnUP.setEnabled(true);
		btnRIGHT.setEnabled(true);
		btnLEFT.setEnabled(true);
	}
	
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