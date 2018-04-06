package dkeep.logic;

import java.util.concurrent.ThreadLocalRandom;

// TODO: Auto-generated Javadoc
/**
 * The Class Suspicious.
 */
public class Suspicious extends Guard{

	/** The sleep. */
	boolean sleep = false;
	
	/** The reverse. */
	boolean reverse = false;
	
	/**
	 * Instantiates a new suspicious.
	 *
	 * @param posx the posx
	 * @param posy the posy
	 * @param map the map
	 */
	public Suspicious(int posx, int posy, Map map) {
		super(posx, posy, map);
		movement = sequence;
		index = 0;
	}

	/* (non-Javadoc)
	 * @see dkeep.logic.Guard#updateEntity()
	 */
	@Override
	public void updateEntity() {

		// random int that defines probability of suspicious turning backwards
		int turn_prob = ThreadLocalRandom.current().nextInt(0, 2 + 1);

		if (turn_prob == 0) {
			if (!reverse) {
				movement = rev_sequence;
				reverse = true;
				index -= 1;
			} else if (reverse) {
				movement = sequence;
				reverse = false;
				index += 1;
			}
		}
		if(reverse) {
			this.move();
			index--;
		}
		else if(!reverse) {
			this.move();
			index++;
		}

	}
}
