import java.util.Random;

public class Ogre extends Entity{

	Random rn = new Random();
	
	//constructor
	public Ogre(int posx, int posy, Game game) 
	{
		super(posx, posy, game);
		movement = "wasd";
		index = rn.nextInt(4);
	}
	
	
}
