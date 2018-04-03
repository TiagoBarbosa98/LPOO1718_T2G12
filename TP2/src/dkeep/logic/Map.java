package dkeep.logic;
import java.util.ArrayList;

public abstract class Map {
	
	protected Game game;
	
	//list of entities
	protected ArrayList<Entity> entities = new ArrayList<Entity>();	
	
	//updated map
	protected char[][] map;
	
	//base map
	protected char[][] basemap;
	
	//basic constructor for the class
	public Map(Game game) 
	{	
		this.game = game;
	}	
	
	//returns the map
	public char[][] getMap()
	{
		return map;
	}
	
	//prints the map
	public void printMap() 
	{
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
	
	public void updateEntities() {
		for(int i = 0; i < entities.size(); i++) {
			entities.get(i).updateEntity();
		}
	}
	
	public void drawEntities() {
		for(int i = 0; i < entities.size(); i++) {
			if(map[entities.get(i).x][entities.get(i).y] == ' ') {
				map[entities.get(i).x][entities.get(i).y] = entities.get(i).symbol;
			}
		}
	}
}

