import java.util.Scanner;

public class Map {

	Scanner sc = new Scanner(System.in);
	//private fields
	//private Hero hero = new Hero();
	
	private int heroX = 1;
	private int heroY = 1;

	//doors locations
	
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
	
	 //basic constructor for the class
	public Map(){
		
	}
	
	public char[][] getMap()
	{
		return map;
	}

	
	//converts all the closed doors in the map (the I's) into open doors (S's)
	public void openDoors()
	{
		//door locations
		map[1][4] = 'S';
		map[3][4] = 'S';
		map[3][2] = 'S';
		map[5][0] = 'S';
		map[6][0] = 'S';
		map[8][2] = 'S';
		map[8][4] = 'S';
		System.out.println("You've opened the doors! Escape through one of them." + '\n');
		
	}
	
	//prints a simple game over message on the screen and terminates the program
	public void gameOver(int option)
	{
		//receives 0 as a param if game won, or 1 if game lost
		
		if(option == 0)
		{
			System.out.println("Congratulations! You won the game!");
			System.exit(1);
		}
		else if(option == 1)
		{
			System.out.println("Too bad, better luck next time!");
			System.exit(1);
		}
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
	
	//if hero has reached the lever 'k' in the map, open all doors
	public void reachedLever(int x, int y)
	{
		if(map[x][y] == 'k')
		{
			openDoors();
		}
	}
	
	//if hero has reached an open door, end the game with a win
	public void reachedOpenDoor(int x, int y)
	{
		if(map[x][y] == 'S')
		{
			map[x][y] = 'H';
			printMap();
			System.out.println();
			gameOver(0);
		}
	}
	
	//if hero is in an adjacent position to the guard, end the game with a loss
	/*TODO*/
	public void caughtByGuard()
	{
		
	}
	
	//updates the map according to the conditions (hero location, guard location, doors closed or open...)
	public void updateHeroPos()
	{
		int update = updateHero();
		
		for(int i = 0; i < 50; i++)
			System.out.println();
		
		/*If char in front of the hero is neither a wall nor a closed door, advance
		 * If it is the lever, open the doors(I -> S)
		 */
		
		switch(update)
		{
			case 1:
				if(map[heroX - 1][heroY] != 'X' & map[heroX - 1][heroY] != 'I')
				{
					map[heroX][heroY] = ' ';
					heroX--;
					
					//checking if hero has stepped on a lever and opening doors if he has
					reachedLever(heroX, heroY);
					
					//checking if user has reached an open door
					reachedOpenDoor(heroX, heroY);
					
					map[heroX][heroY] = 'H';
					
				}
				printMap();

				break;	
				
			case 2:
				if(map[heroX + 1][heroY] != 'X' & map[heroX + 1][heroY] != 'I')
				{
					map[heroX][heroY] = ' ';
					heroX++;
					
					//checking if hero has stepped on a lever and opening doors if he has
					reachedLever(heroX, heroY);
					
					//checking if user has reached an open door
					reachedOpenDoor(heroX, heroY);
					
					map[heroX][heroY] = 'H';
					
				}
				printMap();

				break;
				
			case 3:
				if(map[heroX][heroY - 1] != 'X' & map[heroX][heroY - 1] != 'I')
				{
					map[heroX][heroY] = ' ';
					heroY--;
					
					//checking if hero has stepped on a lever and opening doors if he has
					reachedLever(heroX, heroY);
					
					//checking if user has reached an open door
					reachedOpenDoor(heroX, heroY);
					
					map[heroX][heroY] = 'H';
				}
					
				printMap();

				break;
					
			case 4:
				if(map[heroX][heroY + 1] != 'X' & map[heroX][heroY + 1] != 'I')
				{
					map[heroX][heroY] = ' ';
					heroY++;
					
					//checking if hero has stepped on a lever and opening doors if he has
					reachedLever(heroX, heroY);
					
					//checking if user has reached an open door
					reachedOpenDoor(heroX, heroY);
					
					map[heroX][heroY] = 'H';
					
				}
				printMap();
				
				break;		
		}
		
	}
	
	//prints all the characters present in the "map" matrix - basically displays the map on the screen
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
