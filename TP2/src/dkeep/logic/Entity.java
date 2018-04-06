package dkeep.logic;

/**
 * The Class Entity.
 */
public abstract class Entity {

	/** The map. */
	protected Map map;

	/** Current position in the map. */
	protected int x,y;
	
	/** x and y before update (to help update the map). */
	protected int old_x, old_y;

	
	/** The symbol displayed. */
	protected char symbol;
	
	/** The old symbol. */
	protected char old_symbol;
	
	/** String that defines enemy movement. */
	protected String movement;
	
	
	/** Index associated to current movement. */
	protected int index;
	
	
	/**
	 * Instantiates a new entity.
	 *
	 * @param xpos the xpos
	 * @param ypos the ypos
	 * @param map the map
	 */
	//constructor
	public Entity(int xpos, int ypos, Map map) 
	{
		this.map = map;
		x = xpos;
		y = ypos;
	}

	/**
	 * Gets the x.
	 *
	 * @return the x
	 */
	//get methods
	public int getX() {	return x; }
	
	/**
	 * Gets the y.
	 *
	 * @return the y
	 */
	public int getY() {	return y; }
	
	/**
	 * Gets the old X.
	 *
	 * @return the old X
	 */
	public int getOldX() { return old_x; }
	
	/**
	 * Gets the old Y.
	 *
	 * @return the old Y
	 */
	public int getOldY() { return old_y; }
	
	/**
	 * Gets the symbol.
	 *
	 * @return the symbol
	 */
	public char getSymbol() { return symbol; }
	
	
	/**
	 * Sets the x.
	 *
	 * @param newX the new x
	 */
	//set methods
	public void setX(int newX) { x = newX; }
	
	/**
	 * Sets the y.
	 *
	 * @param newY the new y
	 */
	public void setY(int newY) { y = newY; }
	
	/**
	 * Sets the old X.
	 *
	 * @param newX the new old X
	 */
	public void setOldX(int newX) { old_x = newX; }

	/**
	 * Sets the old Y.
	 *
	 * @param newY the new old Y
	 */
	public void setOldY(int newY) { old_x = newY; }
	
	/**
	 * Sets the symbol.
	 *
	 * @param newSymbol the new symbol
	 */
	public void setSymbol(char newSymbol) { symbol = newSymbol; }
	
	
	/**
	 * Updates entity.
	 */
	public abstract void updateEntity();
	
	/**
	 * Checks if is near.
	 *
	 * @param entity the entity
	 * @return true, if is near
	 */
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
	
	/**
	 * Move function.
	 */
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
	
	public void doSomething(char first)
	{
		switch (first) {
		
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
