package dkeep.logic;

// TODO: Auto-generated Javadoc
/**
 * The Class Level2.
 */
public class Level2 extends Map{

	/** The hero. */
	Hero hero = new Hero(7, 1, this);
	
	/** The ogre. */
	Ogre ogre = new Ogre(1, 4, this);
	
	/** The door 1. */
	Door door1 = new Door(1, 0, this);
	
	/** The key. */
	Key key = new Key(1, 7, this, door1);
	
	/** The club. */
	Club club = new Club(1, 4, ogre, this);
	
	/** The sword. */
	Club sword = new Club(7, 2, null, this);
	
	/** The key armed. */
	private boolean keyArmed = false;
	
	/** The sword armed. */
	private boolean swordArmed = false;
	
	/**
	 * Instantiates a new level 2.
	 *
	 * @param game the game
	 */
	public Level2(Game game) {
		super(game);
		entities.add(hero);
		entities.add(ogre);
		entities.add(door1);
		entities.add(key);
		entities.add(club);
		entities.add(sword);
		this.basemap = new char[][]	{ 
			{ 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
			{ ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X'}, 
			{ 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X'},
			{ 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X'}, 
			{ 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X'},
			{ 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X'},
			{ 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X'},
			{ 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X'}, 
			{ 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'}};
		this.map = new char[9][9];
	}

	/* (non-Javadoc)
	 * @see dkeep.logic.Map#gameLogic()
	 */
	@Override
	public void gameLogic() {
		this.updateEntities();
		this.drawEntities();
		this.openDoor();
		this.heroCollision();
		this.leverStepped();
		this.enterDoor();
	}
	
	/**
	 * Open door.
	 */
	private void openDoor() {
		if(hero.getX() == door1.getX() && hero.getY() == door1.getY() && !door1.isOpen && !keyArmed) {
			hero.x = hero.old_x;
			hero.y = hero.old_y;
		}
		else if(hero.getX() == door1.getX() && hero.getY() == door1.getY() && !door1.isOpen && keyArmed) {
			door1.openDoor();
			hero.x = hero.old_x;
			hero.y = hero.old_y;
			hero.symbol = hero.old_symbol;
		}
	}

	/**
	 * Enter door.
	 */
	private void enterDoor() {
		if (hero.getX() == door1.getX() && hero.getY() == door1.getY()) {
			game.state = Game.State.WIN;
		}
		
	}

	/**
	 * Lever stepped.
	 */
	private void leverStepped() {
		if (hero.getX() == key.getX() && hero.getY() == key.getY()) {
			hero.old_symbol = hero.symbol;
			hero.symbol = 'K';
			key.symbol = ' ';
			keyArmed = true;
		}
	}

	/**
	 * Hero collision.
	 */
	private void heroCollision() {
		if (hero.getY() != 0) {
			if (hero.getX() == club.getX() && hero.getY() == club.getY() - 1) {
				game.state = Game.State.LOSE;
			} else if (hero.getX() == club.getX() && hero.getY() == club.getY() + 1) {
				game.state = Game.State.LOSE;
			} else if (hero.getX() == club.getX() - 1 && hero.getY() == club.getY()) {
				game.state = Game.State.LOSE;
			} else if (hero.getX() == club.getX() + 1 && hero.getY() == club.getY()) {
				game.state = Game.State.LOSE;
			} else if (hero.getX() == club.getX() && hero.getY() == club.getY()) {
				game.state = Game.State.LOSE;
			} else if (hero.getX() == sword.getX() && hero.getY() == sword.getY()) {
				hero.symbol = 'A';
				sword.symbol = ' ';
				swordArmed = true;

			} else if (hero.getX() == ogre.getX() && hero.getY() == ogre.getY() - 1) {
				if (swordArmed) {
					ogre.stunned = true;
					ogre.stun_time = 4;
					ogre.symbol = '8';
				} else {
					game.state = Game.State.LOSE;
				}
			}
			else if (hero.getX() == ogre.getX() && hero.getY() == ogre.getY() + 1) {
				if (swordArmed) {
					ogre.stunned = true;
					ogre.stun_time = 4;
					ogre.symbol = '8';
				} else {
					game.state = Game.State.LOSE;
				}
			}
			else if (hero.getX() == ogre.getX() + 1 && hero.getY() == ogre.getY()) {
				if (swordArmed) {
					ogre.stunned = true;
					ogre.stun_time = 4;
					ogre.symbol = '8';
				} else {
					game.state = Game.State.LOSE;
				}
			}
			else if (hero.getX() == ogre.getX() - 1 && hero.getY() == ogre.getY()) {
				if (swordArmed) {
					ogre.stunned = true;
					ogre.stun_time = 4;
					ogre.symbol = '8';
				} else {
					game.state = Game.State.LOSE;
				}
			} else if (hero.getX() == ogre.getX() && hero.getY() == ogre.getY()) {
				game.state = Game.State.LOSE;
			}
		}
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
}
