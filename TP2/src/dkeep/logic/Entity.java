package dkeep.logic;

public class Entity {

	protected Map map;

	protected int x,y; //current position in the map
	
	protected int old_x, old_y;	//x and y before update (to help update the map)

	
	//symbol displayed
	protected char symbol;
	
	
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
	public void updateEntity()
	{
		
		int i = index % movement.length();
				
		char first = movement.charAt(i);
		
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
			if (map.getMap()[x][y - 1] != 'I') {
				this.old_x = x;
				this.old_y = y;
				this.y--;
			}
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
		index++;
	}
	
	public boolean isNear(Entity entity) 
	{
		if(Math.abs(this.getX() - entity.getX()) < 2 & Math.abs(this.getY() - entity.getY()) < 2)
			return true;
		return false;
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
