package dkeep.logic;

import java.util.concurrent.ThreadLocalRandom;

/**
 * The Class Drunken.
 */
public class Drunken extends Guard {

	/** The sleeping. */
	boolean sleeping = false;
	
	/** The reverse. */
	boolean reverse = false;
	
	/** The time out s. */
	//number of iterations before he can sleeping again
	int time_out_s = 0;
	
	/**
	 * Instantiates a new drunken.
	 *
	 * @param posx the posx
	 * @param posy the posy
	 * @param map the map
	 */
	public Drunken(int posx, int posy, Map map) {
		super(posx, posy, map);
		movement = sequence;
		index = 0;
		
	}

	/* (non-Javadoc)
	 * @see dkeep.logic.Guard#updateEntity()
	 */
	@Override
	public void updateEntity() {
		//random int that defines probability of drunken falling asleeping
		int sleeping_prob = ThreadLocalRandom.current().nextInt(0, 2 + 1);
		//random int that defines probability of drunken waking up
		int wake_prob = ThreadLocalRandom.current().nextInt(0, 1 + 1);
		//random int that defines probability of drunken turning backwards
		int turn_prob = ThreadLocalRandom.current().nextInt(0, 1 + 1);
		
		if(!sleeping && time_out_s == 0) {
			if(sleeping_prob == 0) {
				sleeping = true;
				this.symbol = 'g';
			}
			else {
				if(!reverse) {
					this.move();
					index++;
				}
				else if(reverse) {
					move();
					index--;
				}
			}
		}
		else if(!sleeping && time_out_s != 0) {
			if(!reverse) {
				this.move();
				index = index + 1;
			}
			else if(reverse) {
				move();
				index = index - 1;
			}
			time_out_s --;
		}
		else if(sleeping) {
			if(wake_prob == 0) {
				sleeping = false;
				this.symbol = 'G';
				time_out_s = 5;
				if(turn_prob == 0) {
					if(!reverse) {
						movement = rev_sequence;
						reverse = true;
						index--;
					}
					else if(reverse) {
						movement = sequence;
						reverse = false;
						index++;
					}
				}
			}
		}
	}
}
