package dkeep.logic;

public class Entity {

	protected Game game;

	protected int x,y; //current position in the map
	
	protected int old_x, old_y;	//x and y before update (to help update the map)

	
	//symbol displayed
	protected char symbol;
	
	
	//string that defines enemy movement
	protected String movement;
	
	
	//index associated to current movement
	protected int index;
	
	
	//constructor
	public Entity(int xpos, int ypos, Game game) 
	{
		this.game = game;
		x = xpos;
		y = ypos;
	}
	
	
	//get methods
	public int getX() {	return x; }
	
	public int getY() {	return y; }
	
	public int getOldX() { return old_x; }
	
	public int getOldY() { return old_y; }
	
	public char getSymbol() { return symbol; }
	
	
	//set methods
	public void setX(int newX) { x = newX; }
	
	public void setY(int newY) { y = newY; }
	
	public void setOldX(int newX) { old_x = newX; }

	public void setOldY(int newY) { old_x = newY; }
	
	public void setSymbol(char newSymbol) { symbol = newSymbol; }
	
	
	//other methods
	public void updateEntity()
	{
		
		int i = index % movement.length();
				
		char first = movement.charAt(i);
		
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
		index++;
	}
	
	public boolean isNear(Entity entity) 
	{
		if (entity.getX() == this.x) {
			if(entity.getY() == this.y - 1 | entity.getY() == this.y +1 | entity.getY() == this.y) {
				return true;
			}
			else return false;
		}
		else if (entity.getY() == this.y) {
			if(entity.getX() == this.x - 1 | entity.getX() == this.x +1 | entity.getX() == this.x) {
				return true;
			}
			else return false;
		}
		else return false;
	}
	
	//returns true if one entity has the object (stepped into object's position)
	public boolean hasObject(Object object) 
	{
		if (this.x == object.x & this.y == object.y)
		{
			return true;
		}
		else return false;
	}
}