package dkeep.logic;

// TODO: Auto-generated Javadoc
/**
 * The Class Guard.
 */
public abstract class Guard extends Entity {
	
	/** The sleeping. */
	protected boolean sleeping;
	
	/** The sequence. */
	//string that defines Guard's normal movement
	protected String sequence = "assssaaaaaasdddddddwwwww";
	
	/** The rev sequence. */
	protected String rev_sequence = "dwwwwddddddwaaaaaaasssss";
	
	
	/**
	 * Instantiates a new guard.
	 *
	 * @param posx the posx
	 * @param posy the posy
	 * @param map the map
	 */
	//constructor
	public Guard(int posx, int posy, Map map) 
	{
		super(posx, posy, map);
		symbol = 'G';
	}

	/* (non-Javadoc)
	 * @see dkeep.logic.Entity#updateEntity()
	 */
	@Override
	public abstract void updateEntity();
	
}
