package dkeep.logic;
import java.util.Set;

public abstract class Map {
	
	protected Hero hero;
	protected Guard guard;
	protected Key key;
	
	//actual map
	protected char[][] map;
	
	//basic constructor for the class
	public Map() 
	{	
	
	}	
	
	//returns the map
	public char[][] getMap()
	{
		return map;
	}
	
	//prints the map
	public void printMap() {
		
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				
				System.out.print(map[i][j]);
				System.out.print(' ');
				} 
			System.out.println();
			}	
	}

	//rules of the game for a specific map
	public abstract void gameLogic();
	
	public abstract void updateEntity();
}

