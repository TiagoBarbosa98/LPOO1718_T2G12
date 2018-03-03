import javafx.util.Pair;

public class Guard extends Enemy {
	
	private Game game;
	
	//current position in the map
	private int x;
			
	private int y;
		
	protected Pair<Integer,Integer> coordinates = new Pair<>(x,y);
	
	//symbol displayed
	private char symbol = 'G';
	
	//get methods
	public int getGuardX() { return x; }
	
	public int getGuardY() { return y; }
	
	//get methods
	public char getSymbol() { return symbol; }
	
	//constructor
	public Guard(int posx, int posy, Game game) 
	{
		super(posx, posy, game);
	}
	
	public void updatePosition() 
	{
		if (y == 1 & x < 6) {
			x++;
		}
		if (x == 6 & y > 1) {
			y--;
		}
		if (y == 1 & x > 5) {
			x--;
		}
		if (x == 5 & y < 7) {
			y++;
		}
		if (y == 7 & x > 1) {
			x--;
		}
	}
	
	public int getOldY()
	{
		return oldy;
	}
	
	public void updateGuard()
	{	
		if(x == 1 & y == 8)
		{
			oldy = y;
			oldx = x;
			y--;
		}
		else if(y == 7 & x < 5)
		{
			oldx = x;
			oldy = y;
			x++;
		}
		else if(x == 5 & y > 1 & y < 8)
		{	
			oldx = x;
			oldy = y;
			y--;
		}
		else if(x == 5 & y == 1)
		{
			oldx = x;
			oldy = y;
			x++;
		}
		else if(x == 6 & y < 8)
		{
			oldx = x;
			oldy = y;
			y++;
		}
		else if(x > 1 & y == 8)
		{
			oldx = x;
			oldy = y;
			x--;
		}
	}
	
}
