
public class Game {
	
	/*private static boolean gameOver = false;
	
	public void gameEnding()
	{
		gameOver = true;
	}
	*/
	
	public Game()
	{
		Map map = new Map();
		map.printMap();
		
		while(true)
		{
			map.updateMap();
		}

	}

}
