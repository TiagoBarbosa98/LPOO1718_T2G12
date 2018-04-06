package dkeep.logic;

import java.util.Scanner;

import dkeep.cli.Main;

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
		char first = sc.next().charAt(0);

		switch (first) {
		case 'W':
			this.old_y = y;
			this.old_x = x;
			this.x--;
			break;
		case 'w':
			this.old_y = y;
			this.old_x = x;
			this.x--;
			break;
		case 'S':
			this.old_y = y;
			this.old_x = x;
			this.x++;
		case 's':
			this.old_y = y;
			this.old_x = x;
			this.x++;
			break;
		case 'A':
			this.old_x = x;
			this.old_y = y;
			this.y--;
			break;
		case 'a':
			this.old_x = x;
			this.old_y = y;
			this.y--;
			break;
		case 'D':
			this.old_x = x;
			this.old_y = y;
			this.y++;
			break;
		case 'd':
			this.old_x = x;
			this.old_y = y;
			this.y++;
			break;
		}

		if (map.getMap()[x][y] == 'X') {
			x = old_x;
			y = old_y;
		}
	}
}
