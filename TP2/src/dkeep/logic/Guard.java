package dkeep.logic;

public class Guard extends Entity {
	
	//constructor
	public Guard(int posx, int posy, Map map) 
	{
		super(posx, posy, map);
		symbol = 'G';
		movement = "sssssaaaaaaawddddddwwwwd";
		index = 0;
	}

}
