package dkeep.logic;

import java.util.concurrent.ThreadLocalRandom;

public class Ogre extends Entity{
	
	protected boolean stunned = false;
	
	//constructor
	public Ogre(int posx, int posy, Map map) 
	{
		super(posx, posy, map);
		movement = "wasd";
		symbol = 'O';
	}

	@Override
	public void updateEntity() {
		if (!stunned) {
			// random number that defines ogre's movement direction (index)
			index = ThreadLocalRandom.current().nextInt(0, 3 + 1);
			this.move();
			if(map.map[this.x][this.y] == 'k') {
				this.symbol = '$';
			}
			else {
				this.symbol = 'O';
			}
		}
	}
}

