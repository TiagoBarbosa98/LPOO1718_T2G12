package dkeep.logic;

public class Hero extends Entity{
	
	//constructor
	public Hero(int xpos, int ypos, Game game) 
	{
		super(xpos, ypos, game);
		symbol = 'H';
	}	
	
	//updates hero's position based on keyboard input
	public void updateEntity() 
	{

		String input = game.sc.next();

		char first = input.charAt(0);

		switch (first) {
		case 'W' | 'w':
			if (game.buffer[x - 1][y] != 'I') {
				this.old_y = y;
				this.old_x = x;
				this.x--;
			}
			break;
		case 'S' | 's':
			if (game.buffer[x + 1][y] != 'I') {
				this.old_y = y;
				this.old_x = x;
				this.x++;
			}
			break;
		case 'A' | 'a':
			if (game.buffer[x][y - 1] != 'I') {
				this.old_x = x;
				this.old_y = y;
				this.y--;
			}
			else if((game.buffer[x][y - 1] == 'I' & (x == 5 & y - 1 == 6)) | (game.buffer[x][y - 1] == 'I' & (x == 6 & y - 1 == 6)))
					System.out.println('\n' + "The doors are still closed" + '\n');
			break;
		case 'D' | 'd':
			if (game.buffer[x][y + 1] != 'I') {
				this.old_x = x;
				this.old_y = y;
				this.y++;
			}
			break;
		}

		if (game.map.getMap()[x][y] == 'X') {
			x = old_x;
			y = old_y;
		}
	}

}
