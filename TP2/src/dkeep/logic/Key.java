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
	
}