package dkeep.logic;
import java.util.Scanner;

public class Hero extends Entity{
	
	static Scanner sc = new Scanner(System.in);
	
	//constructor
	public Hero(int xpos, int ypos, Map map) 
	{
		super(xpos, ypos, map);
		symbol = 'H';
	}	
	
	//updates hero's position based on keyboard input
	public void updateEntity() 
	{

		String input = sc.next();

		char first = input.charAt(0);

		switch (first) {
		case 'W' | 'w':
			if (map.getMap()[x - 1][y] != 'I') {
				this.old_y = y;
				this.old_x = x;
				this.x--;
			}
			break;
		case 'S' | 's':
			if (map.getMap()[x + 1][y] != 'I') {
				this.old_y = y;
				this.old_x = x;
				this.x++;
			}
			break;
		case 'A' | 'a':
			if(map.getMap()[x][y - 1] == 'S')
			{
				
			}
			else if (map.getMap()[x][y - 1] != 'I') {
				this.old_x = x;
				this.old_y = y;
				this.y--;
			}
			else if((map.getMap()[x][y - 1] == 'I' & (x == 5 & y - 1 == 6)) | (map.getMap()[x][y - 1] == 'I' & (x == 6 & y - 1 == 6)))
					System.out.println('\n' + "The doors are still closed" + '\n');
			break;
		case 'D' | 'd':
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
