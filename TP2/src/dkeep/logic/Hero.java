package dkeep.logic;

import java.util.Scanner;

import dkeep.gui.Main;

// TODO: Auto-generated Javadoc
/**
 * The Class Hero.
 */
public class Hero extends Entity{
	
	/** The sc. */
	static Scanner sc = new Scanner(System.in);
	
	/** The main. */
	private Main main;
	
	/**
	 * Instantiates a new hero.
	 *
	 * @param xpos the xpos
	 * @param ypos the ypos
	 * @param map the map
	 */
	//constructor
	public Hero(int xpos, int ypos, Map map) 
	{
		super(xpos, ypos, map);
		symbol = 'H';
	}
	
	/* (non-Javadoc)
	 * @see dkeep.logic.Entity#updateEntity()
	 */
	//updates hero's position based on keyboard input
	public void updateEntity() 
	{
		
	}
	
	public char getChar()
	{
		char first = sc.next().charAt(0);
		return first;
	}
	
	public void updateHero(char first) {
		char input = Character.toLowerCase(first);

		doSomething(input);
	}
}
