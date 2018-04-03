package dkeep.logic;
import java.util.Random;

public class Ogre extends Entity{

	Random rn = new Random();
	
	//constructor
	public Ogre(int posx, int posy, Map map) 
	{
		super(posx, posy, map);
		symbol = 'O';
		movement = "wasd";
		index = rn.nextInt(4);
	}
	
	
}
