package dkeep.logic;

import java.util.concurrent.ThreadLocalRandom;

public class Drunken extends Guard {

	boolean sleep = false;
	
	boolean reverse = false;
	
	//number of iterations before he can sleep again
	int time_out_s = 0;
	
	public Drunken(int posx, int posy, Map map) {
		super(posx, posy, map);
		movement = sequence;
		index = 0;
		
	}

	@Override
	public void updateEntity() {
		//random int that defines probability of drunken falling asleep
		int sleep_prob = ThreadLocalRandom.current().nextInt(0, 2 + 1);
		//random int that defines probability of drunken waking up
		int wake_prob = ThreadLocalRandom.current().nextInt(0, 1 + 1);
		//random int that defines probability of drunken turning backwards
		int turn_prob = ThreadLocalRandom.current().nextInt(0, 1 + 1);
		
		if(!sleep && time_out_s == 0) {
			if(sleep_prob == 0) {
				sleep = true;
				this.symbol = 'g';
			}
			else {
				if(!reverse) {
					this.moveForward();
				}
				else if(reverse) {
					this.moveReverse();
				}
			}
		}
		else if(!sleep && time_out_s != 0) {
			if(!reverse) {
				this.moveForward();
			}
			else if(reverse) {
				this.moveReverse();
			}
			time_out_s --;
		}
		else if(sleep) {
			if(wake_prob == 0) {
				sleep = false;
				this.symbol = 'G';
				time_out_s = 5;
				if(turn_prob == 0) {
					if(!reverse) {
						movement = rev_sequence;
						reverse = true;
					}
					else if(reverse) {
						movement = sequence;
						reverse = false;
					}
				}
			}
		}
	}
}
