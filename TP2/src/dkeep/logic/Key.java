package dkeep.logic;

// TODO: Auto-generated Javadoc
/**
 * The Class Key.
 */
public class Key extends Entity{
	
	/** The door 2. */
	protected Door door1, door2;
	
	/**
	 * Instantiates a new key.
	 *
	 * @param posx the posx
	 * @param posy the posy
	 * @param map the map
	 * @param door1 the door 1
	 */
	//constructor of a key for single door
	public Key(int posx, int posy, Map map, Door door1) 
	{
		super(posx, posy, map);
		symbol = 'k';
		this.door1 = door1;
		this.door2 = null;
	}
	
	/**
	 * Instantiates a new key.
	 *
	 * @param posx the posx
	 * @param posy the posy
	 * @param map the map
	 * @param door1 the door 1
	 * @param door2 the door 2
	 */
	//constructor of a key for double doors
	public Key(int posx, int posy, Map map, Door door1, Door door2) 
	{
		super(posx, posy, map);
		symbol = 'k';
		this.door1 = door1;
		this.door2 = door2;		
	}

	/* (non-Javadoc)
	 * @see dkeep.logic.Entity#updateEntity()
	 */
	@Override
	public void updateEntity() {}
	
}