package dkeep.logic;

public class Key extends Object{
	
	private Door door1, door2;
	
	//constructor of a key for single door
	public Key(int posx, int posy, Map map, Door door1) 
	{
		super(posx, posy, map);
		symbol = 'k';
		this.door1 = door1;
		this.door2 = null;
	}
	
	//constructor of a key for double doors
	public Key(int posx, int posy, Map map, Door door1, Door door2) 
	{
		super(posx, posy, map);
		symbol = 'k';
		this.door1 = door1;
		this.door2 = door2;		
	}
	
	public Key(int posx, int posy, Game game, Door door1) 
	{
		super(posx, posy, game);
		symbol = 'k';
		this.door1 = door1;
		this.door2 = null;
	}

	//returns the symbol
	public char getSymbol() { return symbol; }
	
	
	public void updateEntity() {
		if (map.hero.getX() == this.x & map.hero.getY() == this.y) {
			this.door1.openDoor();
			if(door2 != null)
				this.door2.openDoor();
			this.symbol = ' ';
		}
	}
}