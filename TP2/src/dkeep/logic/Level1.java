package dkeep.logic;

// TODO: Auto-generated Javadoc
/**
 * The Class Level1.
 */
public class Level1 extends Map {
	
	/** The hero. */
	Hero hero = new Hero(1, 1, this);
	
	/** The guard. */
	Guard guard = new Rookie(1, 8, this);
	
	/** The door 1. */
	Door door1 = new Door(1, 4, this);
	
	/** The door 2. */
	Door door2 = new Door(3, 2, this);
	
	/** The door 3. */
	Door door3 = new Door(3, 4, this);
	
	/** The door 4. */
	Door door4 = new Door(5, 0, this);
	
	/** The door 5. */
	Door door5 = new Door(6, 0, this);
	
	/** The door 6. */
	Door door6 = new Door(8, 2, this);
	
	/** The door 7. */
	Door door7 = new Door(8, 4, this);
	
	/** The key. */
	Key key = new Key(8, 7, this, door4, door5);
	
	
	
	/**
	 * Instantiates a new level 1.
	 *
	 * @param game the game
	 */
	public Level1(Game game){
		super(game);
		entities.add(hero);
		entities.add(guard);
		entities.add(door1);
		entities.add(door2);
		entities.add(door3);
		entities.add(door4);
		entities.add(door5);
		entities.add(door6);
		entities.add(door7);
		entities.add(key);
		this.basemap = new char[][] {
				{ 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X' },
				{ 'X', ' ', ' ', ' ', ' ', ' ', 'X', ' ', ' ', 'X' },
				{ 'X', 'X', 'X', ' ', 'X', 'X', 'X', ' ', ' ', 'X' },
				{ 'X', ' ', ' ', ' ', ' ', ' ', 'X', ' ', ' ', 'X' },
				{ 'X', 'X', 'X', ' ', 'X', 'X', 'X', ' ', ' ', 'X' },
				{ ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X' },
				{ ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X' },
				{ 'X', 'X', 'X', ' ', 'X', 'X', 'X', 'X', ' ', 'X' },
				{ 'X', ' ', ' ', ' ', ' ', ' ', 'X', ' ', ' ', 'X' },
				{ 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X' } };
		this.map = new char[10][10];
	}

	
	
	/* (non-Javadoc)
	 * @see dkeep.logic.Map#gameLogic()
	 */
	@Override
	public void gameLogic() {
		this.updateEntities();
		hero.updateHero(hero.getChar());
		this.draw();
		checkEndLevel();
	}
	
	public void checkEndLevel()
	{
		this.heroCollision();
		this.leverStepped();
		this.enterDoor();
	}
	
	/* (non-Javadoc)
	 * @see dkeep.logic.Map#resetMap()
	 */
	public void resetMap() {
		for(int i = 0; i < basemap.length; i++) {
			for(int j = 0; j < basemap[i].length; j++) {
				map[i][j] = basemap[i][j];
			}
		}
	}
	
	/**
	 * Lever stepped.
	 */
	public void leverStepped() {
		if(key.getX() == hero.getX() && key.getY() == hero.getY()) {
			key.door1.openDoor();
			key.door2.openDoor();
			key.symbol = ' ';
		}
	}

	/**
	 * Hero collision.
	 */
	public void heroCollision() {
		if (hero.getY() != 0) {
			if (hero.getX() == guard.getX() && hero.getY() == guard.getY() - 1 && !guard.sleeping) {
				game.state = Game.State.LOSE;
			} else if (hero.getX() == guard.getX() && hero.getY() == guard.getY() + 1 && !guard.sleeping) {
				game.state = Game.State.LOSE;
			} else if (hero.getX() == guard.getX() + 1 && hero.getY() == guard.getY() && !guard.sleeping) {
				game.state = Game.State.LOSE;
			} else if (hero.getX() == guard.getX() - 1 && hero.getY() == guard.getY() && !guard.sleeping) {
				game.state = Game.State.LOSE;
			} else if (hero.getX() == guard.getX() && hero.getY() == guard.getY()) {
				game.state = Game.State.LOSE;
			}
		}
	}

	/**
	 * Enter door.
	 */
	public void enterDoor() {
		if (hero.getX() == door4.getX() && hero.getY() == door4.getY()) {
			this.game.state = Game.State.LEVEL2;
			game.map = new Level2(game);
		}
		else if (hero.getX() == door5.getX() && hero.getY() == door5.getY()) {
			this.game.state = Game.State.LEVEL2;
			game.map = new Level2(game);
		}
	}
	
}