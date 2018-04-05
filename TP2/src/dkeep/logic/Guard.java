package dkeep.logic;

public abstract class Guard extends Entity {
	
	//string that defines Guard's normal movement
	protected String sequence = "assssaaaaaasdddddddwwwww";
	
	protected String rev_sequence = "dwwwwddddddwaaaaaaasssss";
	
	
	//constructor
	public Guard(int posx, int posy, Map map) 
	{
		super(posx, posy, map);
		symbol = 'G';
	}

	@Override
	public abstract void updateEntity();
	
	public void move() {
		int i = Math.floorMod(index, movement.length());
		
		char first = movement.charAt(i);
		
		switch (first) {
		case 'W':
			if (map.getMap()[x - 1][y] != 'I') {
				this.old_y = y;
				this.old_x = x;
				this.x--;
			}
			break;
		case 'w':
			if (map.getMap()[x - 1][y] != 'I') {
				this.old_y = y;
				this.old_x = x;
				this.x--;
			}
			break;
		case 'S':
			if (map.getMap()[x + 1][y] != 'I') {
				this.old_y = y;
				this.old_x = x;
				this.x++;
			}
		case 's':
			if (map.getMap()[x + 1][y] != 'I') {
				this.old_y = y;
				this.old_x = x;
				this.x++;
			}
			break;
		case 'A':
			if (map.getMap()[x][y - 1] != 'I') {
				this.old_x = x;
				this.old_y = y;
				this.y--;
			}
			break;
		case 'a':
			if (map.getMap()[x][y - 1] != 'I') {
				this.old_x = x;
				this.old_y = y;
				this.y--;
			}
			break;
		case 'D':
			if (map.getMap()[x][y + 1] != 'I') {
				this.old_x = x;
				this.old_y = y;
				this.y++;
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
