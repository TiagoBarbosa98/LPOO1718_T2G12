package dkeep.logic;

public class Dungeon extends Map {
	
	Hero hero = new Hero(1, 1, this);
	Guard guard = new Guard(1, 8, this);
	Door door1 = new Door(1, 4, this);
	Door door2 = new Door(3, 2, this);
	Door door3 = new Door(3, 4, this);
	Door door4 = new Door(5, 0, this);
	Door door5 = new Door(6, 0, this);
	Door door6 = new Door(8, 2, this);
	Door door7 = new Door(8, 4, this);
	Key key = new Key(8, 7, this, door4, door5);
	
	
	public Dungeon(){
		super();
		this.map = new char[][] { 
			{ 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X' },
			{ 'X', ' ', ' ', ' ', ' ', ' ', 'X', ' ', ' ', 'X' }, 
			{ 'X', 'X', 'X', ' ', 'X', 'X', 'X', ' ', ' ', 'X' },
			{ 'X', ' ', ' ', ' ', ' ', ' ', 'X', ' ', ' ', 'X' }, 
			{ 'X', 'X', 'X', ' ', 'X', 'X', 'X', ' ', ' ', 'X' },
			{ ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X' }, 
			{ ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X' },
			{ 'X', 'X', 'X', ' ', 'X', 'X', 'X', 'X', ' ', 'X' }, 
			{ 'X', ' ', ' ', ' ', ' ', ' ', 'X', ' ', ' ', 'X' },
			{ 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X' } 
		};
	}
	
	@Override
	public void gameLogic() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEntity() {
		// TODO Auto-generated method stub
		
	}
}