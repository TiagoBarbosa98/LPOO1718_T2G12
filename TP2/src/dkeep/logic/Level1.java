package dkeep.logic;

public class Level1 extends Map {
	
	Hero hero = new Hero(1, 1, this);
	Guard guard = new Rookie(1, 8, this);
	Door door1 = new Door(1, 4, this);
	Door door2 = new Door(3, 2, this);
	Door door3 = new Door(3, 4, this);
	Door door4 = new Door(5, 0, this);
	Door door5 = new Door(6, 0, this);
	Door door6 = new Door(8, 2, this);
	Door door7 = new Door(8, 4, this);
	Key key = new Key(8, 7, this, door4, door5);
	
	
	
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

	
	
	@Override
	public void gameLogic() {
		this.resetMap();
		this.drawEntities();
		this.printMap();
		this.updateEntities();
		if (this.hero.isNear(guard)) this.game.state = Game.State.LOSE;
		
	}
	
	public void resetMap() {
		for(int i = 0; i < basemap.length; i++) {
			for(int j = 0; j < basemap[i].length; j++) {
				map[i][j] = basemap[i][j];
			}
		}
	}
}