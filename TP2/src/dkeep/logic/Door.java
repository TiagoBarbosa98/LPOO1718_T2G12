package dkeep.logic;

public class Door extends Object {
	
	//true is the door is opened, and false if the door is closed
	private boolean isOpen;
	
	private Door door1;
	
	//constructor for simple door
	public Door(int xpos, int ypos, Map map) 
	{
		super(xpos, ypos, map);
		symbol = 'I';
		isOpen = false;
		this.door1 = null;
	}
	
	//constructor for double door
	public Door(int xpos, int ypos, Map map, Door door) 
	{
		super(xpos, ypos, map);
		symbol = 'I';
		isOpen = false;
		this.door1 = door;
	}
	
	//opens the door, changing his symbol
	public void openDoor()
	{
		if (!isOpen) {
			isOpen = true;
			symbol = 'S';
		}
	}
	
}
