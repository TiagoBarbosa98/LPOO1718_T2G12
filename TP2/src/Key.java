import javafx.util.Pair;

public class Key extends Static{
	
	private Game game;
	
	protected Pair<Integer,Integer> coordinates = new Pair<>(x,y);
	
	//symbol displayed
	private char symbol = 'k';
	
	//constructor
	public Key(int posx, int posy, Game game) 
	{
		super(posx, posy, game);
	}
	
	//get methods
	public char getSymbol() { return symbol; }
}
