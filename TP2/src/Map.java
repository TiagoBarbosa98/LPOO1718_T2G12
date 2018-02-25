import java.util.Scanner;

public class Map {

	Scanner sc = new Scanner(System.in);
	//private fields
	//private Hero hero = new Hero();
	
	private int heroX = 1;
	private int heroY = 1;
	private int heroOldX= 1;
	private int heroOldY = 1;
	
	 char[][] map = {
				{'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
				{'X', 'H', ' ', ' ', 'I', ' ', 'X', ' ', 'G', 'X'},
				{'X', 'X', 'X', ' ', 'X', 'X', 'X', ' ', ' ', 'X'},
				{'X', ' ', 'I', ' ', 'I', ' ', 'X', ' ', ' ', 'X'},
				{'X', 'X', 'X', ' ', 'X', 'X', 'X', ' ', ' ', 'X'},
				{'I', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X'},
				{'I', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X'},
				{'X', 'X', 'X', ' ', 'X', 'X', 'X', ' ', ' ', 'X'},
				{'X', ' ', 'I', ' ', 'I', ' ', 'X', 'k', ' ', 'X'},
				{'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'}
		};
	 
	 
	 //methods
	
	public Map(){
		
	}
	
	public char[][] getMap()
	{
		return map;
	}
	
	public int updateHero()
	{
		while(!sc.hasNext())
		{
			sc.next();
		}
		
		String input = sc.next();
		
		char first = input.charAt(0);
		
		if(first == 'W' | first == 'w')
		{	return 1;}
		else if(first == 'S' | first == 's')
		{	return 2;}
		else if(first == 'A' | first == 'a')
		{	return 3;}
		else if(first == 'D' | first == 'd')
		{	return 4;}
		else
			return 0;
	}
	
	public void updateHeroPos()
	{
		int update = updateHero();
		
		switch(update)
		{
			case 1:
				if(map[heroX - 1][heroY] != 'X' & map[heroX - 1][heroY] != 'I')
				{
					heroOldX = heroX;
					heroOldY = heroY;
					heroX--;
					
					map[heroX][heroY] = 'H';
					map[heroOldX][heroOldY] = ' ';
				}
				break;	
			case 2:
				if(map[heroX + 1][heroY] != 'X' & map[heroX + 1][heroY] != 'I')
				{
					heroOldX = heroX;
					heroOldY = heroY;
					heroX++;
					
					map[heroX][heroY] = 'H';
					map[heroOldX][heroOldY] = ' ';
				}
				break;
			case 3:
				if(map[heroX][heroY - 1] != 'X' & map[heroX][heroY - 1] != 'I')
				{
					heroOldX = heroX;
					heroOldY = heroY;
					heroY--;
					
					map[heroX][heroY] = 'H';
					map[heroOldX][heroOldY] = ' ';
				}
				break;
			case 4:
				if(map[heroX][heroY + 1] != 'X' & map[heroX][heroY + 1] != 'I')
				{
					heroOldX = heroX;
					heroOldY = heroY;
					heroY++;
					
					map[heroX][heroY] = 'H';
					map[heroOldX][heroOldY] = ' ';
				}
				break;		
		}
		
	}
	
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
