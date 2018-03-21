package dkeep.logic;

public class Map {
	
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
		
		for (int i = 0; i < dungeon.length; i++) {
			for (int j = 0; j < dungeon[i].length; j++) {
				
				System.out.print(dungeon[i][j]);
				System.out.print(' ');
				} 
			System.out.println();
			}	
	}

}
