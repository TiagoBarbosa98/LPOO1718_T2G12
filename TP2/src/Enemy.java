import javafx.util.Pair;

public class Enemy extends Entity{
	
	private Game game;
	
	//current position in the map
	protected int x;
		
	protected int y;
		
	//x and y before update (to help update the map)
	protected int old_x;
	
	protected int old_y;
	
	protected Pair<Integer,Integer> coordinates = new Pair<>(x,y);
	
	//symbol displayed
	protected char symbol;
	
	//constructor
	public Enemy(int posx, int posy, Game game)
	{
		super(posx, posy, game);
	}
	
	public void Movement() 
	{
		
	}
	
}
