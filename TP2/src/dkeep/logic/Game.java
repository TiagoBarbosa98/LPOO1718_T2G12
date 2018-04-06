package dkeep.logic;


/**
 * The Class Game.
 */
public class Game {

	/** The map. */
	protected Map map;
	
	/** True if the game is over (victory or defeat), false if not. */
	private boolean gameover = false;
	
	/**
	 * The Enumerator State.
	 */
	public enum State {
/** The menu. */
MENU, 
 /** The level1. */
 LEVEL1, 
 /** The level2. */
 LEVEL2, 
 /** The win. */
 WIN, 
 /** The lose. */
 LOSE}
	
	/** The actual game state. */
	public State state = Game.State.LEVEL1;
	
	/**
	 * Instantiates a new game.
	 */
	public Game() {
		map = new Level1(this);
	}

	/**
	 * Initializes the game.
	 */
	public void initialize() {
		while (!gameover) {
			switch (state) {
			case MENU:
			case LEVEL1:
				map.draw();
				map.gameLogic();
				break;
			case LEVEL2:
				map.draw();
				map.gameLogic();
				break;
			case WIN:
				gameover = true;
				map.draw();
				break;
			case LOSE:
				gameover = true;
				map.draw();
				break;
			}
		}
	}
	
	/**
	 * Gets the map.
	 *
	 * @return the map
	 */
	public Map getMap()
	{
		return map;
	}
	
	/**
	 * Gets the hero.
	 *
	 * @return the hero
	 */
	public Hero getHero()
	{
		return this.map.getHero();
	}
	
	/**
	 * Gets the game over.
	 *
	 * @return the game over
	 */
	public boolean getGameOver()
	{
		return gameover;
	}
}
