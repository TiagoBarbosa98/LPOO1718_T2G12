package dkeep.logic;

import java.util.Scanner;

public class Hero extends Entity{
	
	Scanner sc = new Scanner(System.in);
	//constructor
	public Hero(int xpos, int ypos, Game game) 
	{
		super(xpos, ypos, game);
		symbol = 'H';
	}
	
	public char movementInput()
	{

		String input = sc.next();

		char first = input.charAt(0);
		
		return first;
	}
	
	//updates hero's position based on keyboard input
	public void updateEntity() 
	{
		char first = movementInput();

		switch (first) {
		case 'W' | 'w':
			if (game.buffer[x - 1][y] != 'I') {
				old_y = y;
				old_x = x;
				x--;
			}
			break;
		case 'S' | 's':
			if (game.buffer[x + 1][y] != 'I') {
				old_y = y;
				old_x = x;
				x++;
			}
			break;
		case 'A' | 'a':
			if (game.buffer[x][y - 1] != 'I') {
				old_x = x;
				old_y = y;
				y--;
			}
			else if((game.buffer[x][y - 1] == 'I' & (x == 5 & y - 1 == 6)) | (game.buffer[x][y - 1] == 'I' & (x == 6 & y - 1 == 6)))
					System.out.println('\n' + "The doors are still closed" + '\n');
			break;
		case 'D' | 'd':
			if (game.buffer[x][y + 1] != 'I') {
				old_x = x;
				old_y = y;
				y++;
			}
			break;
		}

		if (game.getMap()[x][y] == 'X') {
			x = old_x;
			y = old_y;
		}
	}

}
