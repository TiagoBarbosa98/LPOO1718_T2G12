package dkeep.logic;

public class Door extends Object {
	
	//true is the door is opened, and false if the door is closed
	private boolean isOpen;
	
	private Door door1;
	
	public Door(int xpos, int ypos, Game game) 
	{
		super(xpos, ypos, game);
		symbol = 'I';
		isOpen = false;
		this.door1 = null;
	}
	
	public Door(int xpos, int ypos, Game game, Door door) 
	{
		super(xpos, ypos, game);
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
	
	//closes the door, changing his symbol
	public void closeDoor() 
	{
		if (isOpen) {
			isOpen = false;
			symbol = 'I';
		}
	}
}
