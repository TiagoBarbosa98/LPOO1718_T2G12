package dkeep.logic;
import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class Map.
 */
public abstract class Map {
	
	/** The game. */
	protected Game game;
	
	/** The hero. */
	protected Hero hero = new Hero(1, 1, this);
	
	/** The entities. */
	//list of entities
	protected ArrayList<Entity> entities = new ArrayList<Entity>();	
	
	/** The map. */
	//updated map
	protected char[][] map;
	
	/** The basemap. */
	//base map
	protected char[][] basemap;
	
	/**
	 * Instantiates a new map.
	 *
	 * @param game the game
	 */
	//basic constructor for the class
	public Map(Game game) 
	{	
		this.game = game;
	}	
	
	/**
	 * Gets the map.
	 *
	 * @return the map
	 */
	//returns the map
	public char[][] getMap()
	{
		return map;
	}
	
	/**
	 * Prints the map.
	 */
	//prints the map
	public void printMap() 
	{
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j]);
				System.out.print(' ');
				} 
			System.out.println();
			}	
	}

	/**
	 * Game logic.
	 */
	//rules of the game for a specific map
	public abstract void gameLogic();

	/**
	 * Draw.
	 */
	public void draw() {
		this.resetMap();
		this.drawEntities();
		this.printMap();

	}
	
	/**
	 * Update entities.
	 */
	public void updateEntities() {
		for(int i = 0; i < entities.size(); i++) {
			entities.get(i).updateEntity();
		}
	}
	
	/**
	 * Draw entities.
	 */
	public void drawEntities() {
		for(int i = 0; i < entities.size(); i++) {
			if(map[entities.get(i).x][entities.get(i).y] == ' ') {
				map[entities.get(i).x][entities.get(i).y] = entities.get(i).symbol;
			}
		}
	}
	
	/**
	 * Reset map.
	 */
	public abstract void resetMap();
	
	/**
	 * Gets the hero.
	 *
	 * @return the hero
	 */
	public Hero getHero()
	{
		return hero;
	}
	
	/**
	 * Gets the base map.
	 *
	 * @return the base map
	 */
	public char[][] getBaseMap()
	{
		return basemap;
	}
}

