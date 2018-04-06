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

	switch (input) {
	case 'w':
		if (map.getMap()[x - 1][y] != 'I') {
			this.old_y = y;
			this.old_x = x;
			this.x--;
		}
		break;

	case 's':
		if (map.getMap()[x + 1][y] != 'I') {
			this.old_y = y;
			this.old_x = x;
			this.x++;
		}
		break;

	case 'a':
		if (map.getMap()[x][y - 1] != 'I') {
			this.old_x = x;
			this.old_y = y;
			this.y--;
		}
		break;

	case 'd':
		if (map.getMap()[x][y + 1] != 'I') {
			this.old_x = x;
			this.old_y = y;
			this.y++;
		}
		break;
	}

	if (map.getMap()[x][y] == 'X') {
		x = old_x;
		y = old_y;
		
	}
}
}
