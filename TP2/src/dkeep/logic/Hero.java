package dkeep.logic;

import java.util.Scanner;

import dkeep.gui.Main;

public class Hero extends Entity{
	
	static Scanner sc = new Scanner(System.in);
	
	private Main main;
	
	//constructor
	public Hero(int xpos, int ypos, Map map) 
	{
		super(xpos, ypos, map);
		symbol = 'H';
	}
	
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
