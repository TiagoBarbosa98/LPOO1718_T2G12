package dkeep.logic;

/**
 * The Class Door.
 */
public class Door extends Entity {
	
	/** true is the door is opened, and false if the door is closed. */
	protected boolean isOpen;
	
	/** Door associated to this one. */
	private Door door1;
	
	/**
	 * Instantiates a new door.
	 *
	 * @param xpos the xpos
	 * @param ypos the ypos
	 * @param map the map
	 */
	//constructor for simple door
	public Door(int xpos, int ypos, Map map) 
	{
		super(xpos, ypos, map);
		symbol = 'I';
		isOpen = false;
		this.door1 = null;
	}
	
	/**
	 * Instantiates a new door.
	 *
	 * @param xpos the xpos
	 * @param ypos the ypos
	 * @param map the map
	 * @param door the door
	 */
	//constructor for double door
	public Door(int xpos, int ypos, Map map, Door door) 
	{
		super(xpos, ypos, map);
		symbol = 'I';
		isOpen = false;
		this.door1 = door;
	}
	
	/**
	 * Open door.
	 */
	//opens the door, changing his symbol
	public void openDoor()
	{
		if (!isOpen) {
			isOpen = true;
			symbol = 'S';
		}
	}

	/* (non-Javadoc)
	 * @see dkeep.logic.Entity#updateEntity()
	 */
	@Override
	public void updateEntity() {
		// TODO Auto-generated method stub
		
	}
	
}
