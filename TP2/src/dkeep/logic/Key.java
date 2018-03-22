package dkeep.logic;

public class Key extends Object{
	
	private Door door1, door2;
	
	//constructor
	public Key(int posx, int posy, Game game, Door door1, Door door2) 
	{
		super(posx, posy, game);
		symbol = 'k';
		this.door1 = door1;
		this.door2 = door2;		
	}
	
	public Key(int posx, int posy, Game game, Door door1) 
	{
		super(posx, posy, game);
		symbol = 'k';
		this.door1 = door1;
		this.door2 = null;
	}

	//returns the symbol
	public char getSymbol() { return symbol; }
	
	
	public void updateEntity() {
		if (game.getHero().getX() == this.x & game.getHero().getY() == this.y) {
			this.door1.openDoor();
			if(door2 != null)
				this.door2.openDoor();
			this.symbol = ' ';
		}
	}
}