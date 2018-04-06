package dkeep.logic;

public abstract class Entity {

	protected Map map;

	protected int x,y; //current position in the map
	
	protected int old_x, old_y;	//x and y before update (to help update the map)

	
	//symbol displayed
	protected char symbol;
	
	protected char old_symbol;
	
	//string that defines enemy movement
	protected String movement;
	
	
	//index associated to current movement
	protected int index;
	
	
	//constructor
	public Entity(int xpos, int ypos, Map map) 
	{
		this.map = map;
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
	public abstract void updateEntity();
	
	public boolean isNear(Entity entity) 
	{
		if(this.getX() == entity.getX()){
			if(this.getY() == entity.getY() + 1 || this.getY() == entity.getY() - 1) {
				return true;
			}
			else {
				return false;
			}
		}
		else if(this.getY() == entity.getY()){
			if (this.getX() == entity.getX() + 1 || this.getX() == entity.getX() - 1) {
				return true;
			}
			else {
				return false;
			}
		}
		else return false;
	}
	
	//returns true if one entity has the object (stepped into object's position)
	public boolean hasObject(Entity object) 
	{
		if (this.x == object.x & this.y == object.y)
		{
			return true;
		}
		else return false;
	}
	
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
