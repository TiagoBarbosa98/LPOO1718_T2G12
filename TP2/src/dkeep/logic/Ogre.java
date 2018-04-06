package dkeep.logic;

import java.util.concurrent.ThreadLocalRandom;

// TODO: Auto-generated Javadoc
/**
 * The Class Ogre.
 */
public class Ogre extends Entity{
	
	/** The stunned. */
	protected boolean stunned = false;
	 
 	/** The stun time. */
 	//number of rounds that ogre passes stunned
	protected int stun_time = 0;
	
	/**
	 * Instantiates a new ogre.
	 *
	 * @param posx the posx
	 * @param posy the posy
	 * @param map the map
	 */
	//constructor
	public Ogre(int posx, int posy, Map map) 
	{
		super(posx, posy, map);
		movement = "wasd";
		symbol = 'O';
	}

	/* (non-Javadoc)
	 * @see dkeep.logic.Entity#updateEntity()
	 */
	@Override
	public void updateEntity() {
		// random number that defines ogre's movement direction (index)
		index = ThreadLocalRandom.current().nextInt(0, 3 + 1);
		if (!stunned) {
			this.move();
			if(map.map[this.x][this.y] == 'k') {
				this.symbol = '$';
			}
			else {
				this.symbol = 'O';
			}
		}
		else {
			if(stun_time != 0) {
				stun_time--;
			}
			else {
				this.symbol = 'O';
				this.move();
			}
		}
	}
}

