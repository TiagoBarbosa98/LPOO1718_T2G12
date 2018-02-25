
public class Game {

	public static void main(String[] args) {
		Map map = new Map();
		int i = 30;
		
		while(i != 0)
		{
			map.printMap();
			map.updateHeroPos();
			i--;
		}
		map.printMap();

	}

}
