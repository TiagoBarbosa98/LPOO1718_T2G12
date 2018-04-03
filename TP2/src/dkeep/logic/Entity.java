package dkeep.logic;

public abstract class Entity {

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
	public abstract void updateEntity();
	
	public boolean isNear(Entity entity) 
	{
		if(this.getX() == entity.getX() - 1 || this.getX() == entity.getX() + 1 || this.getY() == entity.getY() - 1 || this.getY() == entity.getY() + 1) return true;
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
