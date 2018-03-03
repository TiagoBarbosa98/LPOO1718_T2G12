import javafx.util.Pair;

public class Door extends Static {
	
	private Game game;

	protected Pair<Integer,Integer> coordinates = new Pair<>(x,y);
	
	//symbol displayed
	protected char symbol = 'I';
	
	//returns true is the door is opened, and false if the door is closed
	private boolean isOpen = false;
	
	public Door(int xpos, int ypos, Game game) 
	{
		super(xpos, ypos, game);
	}
	
	//get methods
	public char getSymbol() { return symbol; }
}
