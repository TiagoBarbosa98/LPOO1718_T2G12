import javafx.util.Pair;

public class Entity {

	private Game game;
	
	//current position in the map
	protected int x;
		
	protected int y;
	
	protected Pair<Integer,Integer> coordinates = new Pair<>(x,y);
	
	//x and y before update (to help update the map)
	protected int old_x;
	
	protected int old_y;
	
	//symbol displayed
	protected char symbol;
	
	public Entity(int xpos, int ypos, Game game) 
	{
		this.game = game;
		x = xpos;
		y = ypos;
	}
	
	//get methods
	public int getX() {	return x; }
	
	public int getY() {	return y; }
	
	public int getOldX() { return old_x; }
	
	public int getOldY() { return old_y; }
	
	public char getSymbol() { return symbol; }
	
	//set methods
	void setX(int newX) { x = newX; }
	
	void setY(int newY) { y = newY; }
	
	void setOldX(int newX) { old_x = newX; }

	void setOldY(int newY) { old_x = newY; }
	
	void updatePosition() {}
}
