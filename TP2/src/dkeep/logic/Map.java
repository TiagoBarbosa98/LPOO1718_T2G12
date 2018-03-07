package dkeep.logic;

public class Map {
	
	//actual map
	private char[][] map;
	
	//map1
	private char[][] dungeon = 
		{ 
			{ 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X' },
			{ 'X', ' ', ' ', ' ', ' ', ' ', 'X', ' ', ' ', 'X' }, 
			{ 'X', 'X', 'X', ' ', 'X', 'X', 'X', ' ', ' ', 'X' },
			{ 'X', ' ', ' ', ' ', ' ', ' ', 'X', ' ', ' ', 'X' }, 
			{ 'X', 'X', 'X', ' ', 'X', 'X', 'X', ' ', ' ', 'X' },
			{ ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X' }, 
			{ ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X' },
			{ 'X', 'X', 'X', ' ', 'X', 'X', 'X', 'X', ' ', 'X' }, 
			{ 'X', ' ', ' ', ' ', ' ', ' ', 'X', ' ', ' ', 'X' },
			{ 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X' } 
		};

	// map2
	private char[][] boss = 
		{ 
			{ 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X' },
			{ 'I', ' ', ' ', ' ', ' ', 'O', ' ', ' ', 'k', 'X' }, 
			{ 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X' },
			{ 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X' }, 
			{ 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X' },
			{ 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X' },
			{ 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X' },
			{ 'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X' }, 
			{ 'X', 'H', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X' },
			{ 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X' }
		};

	//basic constructor for the class
	public Map(int mapNumber) //1 for first level, 2 for second level)
	{	
		if(mapNumber == 1)
			map = dungeon;
		else if(mapNumber == 2)
			map = boss;		
	}
	
	//set method for the current map
	public void setNewMap()
	{
		this.map = boss;
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
