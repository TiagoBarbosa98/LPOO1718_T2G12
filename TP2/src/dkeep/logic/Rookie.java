package dkeep.logic;

// TODO: Auto-generated Javadoc
/**
 * The Class Rookie.
 */
public class Rookie extends Guard{

	/**
	 * Instantiates a new rookie.
	 *
	 * @param posx the posx
	 * @param posy the posy
	 * @param map the map
	 */
	public Rookie(int posx, int posy, Map map) {
		super(posx, posy, map);
		movement = sequence;
		index = 0;
	}

	/* (non-Javadoc)
	 * @see dkeep.logic.Guard#updateEntity()
	 */
	@Override
	public void updateEntity() 
	{
		this.move();
		index++;
	}
}
