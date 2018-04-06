package dkeep.logic;
import java.util.ArrayList;

public abstract class Map {
	
	protected Game game;
	protected Hero hero = new Hero(1, 1, this);
	
	//list of entities
	protected ArrayList<Entity> entities = new ArrayList<Entity>();	
	
	//updated map
	protected char[][] map = new char[10][10];
	
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

	public void draw() {
		this.resetMap();
		this.drawEntities();
		this.printMap();

	}
	
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
	
	public abstract void resetMap();
	public Hero getHero()
	{
		return hero;
	}
	
	public char[][] getBaseMap()
	{
		return basemap;
	}
}

