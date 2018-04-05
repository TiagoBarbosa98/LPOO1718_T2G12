package dkeep.logic;

public class Level2 extends Map{

	Hero hero = new Hero(7, 1, this);
	Ogre ogre = new Ogre(1, 4, this);
	Door door1 = new Door(1, 0, this);
	Key key = new Key(1, 7, this, door1);
	
	public Level2(Game game) {
		super(game);
		this.basemap = new char[][]	{ 
			{ 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X' },
			{ ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X' }, 
			{ 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X' },
			{ 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X' }, 
			{ 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X' },
			{ 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X' },
			{ 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X' },
			{ 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X' }, 
			{ 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X' },
			{ 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X' }};
		this.map = new char[10][10];	
		
	}

	@Override
	public void gameLogic() {
		this.updateEntities();
		this.draw();
	}

	public void resetMap() {
		for(int i = 0; i < basemap.length; i++) {
			for(int j = 0; j < basemap[i].length; j++) {
				map[i][j] = basemap[i][j];
			}
		}
	}

}
