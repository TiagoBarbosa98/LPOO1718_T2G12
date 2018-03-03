import javafx.util.Pair;

public class Hero extends Entity{
	
	private Game game;
	
	protected Pair<Integer,Integer> coordinates = new Pair<>(x,y);
	
	//symbol displayed
	protected char symbol = 'H';
	
	public Hero(int xpos, int ypos, Game game) 
	{
		super(xpos, ypos, game);
	}	
	
	//get methods
	public char getSymbol() { return symbol; }
	
	//receives keycode and updates the hero's coordinates
	public void updatePosition()
	{
		
		/*while(!sc.hasNext())
		{
			sc.next();
		}*/
		
		String input = game.sc.next();
		
		char first = input.charAt(0);
		
		switch(first) 
		{
		case 'W' | 'w' :
			this.old_y = y;
			this.x--;
			break;
		case 'S' | 's':
			this.old_y = y;
			this.x++;
			break;
		case 'A' | 'a':
			this.old_x = x;
			this.y--;
			break;
		case 'D' | 'd':
			this.old_x = x;
			this.y++;
			break;
		
		}
		
	}
	
}
