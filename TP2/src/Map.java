
public class Map {
	
	private Game game;
	
	//actual map
	private char[][] map = 
	{
				{'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
				{'X', ' ', ' ', ' ', ' ', ' ', 'X', ' ', ' ', 'X'},
				{'X', 'X', 'X', ' ', 'X', 'X', 'X', ' ', ' ', 'X'},
				{'X', ' ', ' ', ' ', ' ', ' ', 'X', ' ', ' ', 'X'},
				{'X', 'X', 'X', ' ', 'X', 'X', 'X', ' ', ' ', 'X'},
				{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X'},
				{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X'},
				{'X', 'X', 'X', ' ', 'X', 'X', 'X', 'X', ' ', 'X'},
				{'X', ' ', ' ', ' ', ' ', ' ', 'X', ' ', ' ', 'X'},
				{'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'}
	};
	 
	 
	 //methods
	
	 //basic constructor for the class
	public Map(Game game)
	{
		this.game = game;
	}
	
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

}
