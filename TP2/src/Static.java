import javafx.util.Pair;

public class Static extends Entity {
	
	private Game game;

	protected Pair<Integer,Integer> coordinates = new Pair<>(x,y);
	
	//symbol displayed
	private char symbol;
	
	//constructor
	public Static(int posx, int posy, Game game) 
	{
		super(posx, posy, game);
	}
}
