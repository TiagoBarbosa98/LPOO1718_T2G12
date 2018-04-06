package dkeep.logic;

public class Game {

	protected Map map;
	private boolean gameover = false;
	public enum State {MENU, LEVEL1, LEVEL2, WIN, LOSE}
	public State state = Game.State.LEVEL1;
	
	public Game(){}

	public void initialize() {
		map = new Level1(this);
		while (!gameover) {
			switch (state) {
			case MENU:
			case LEVEL1:
				map.draw();
				map.gameLogic();
				break;
			case LEVEL2:
				map.draw();
				map.gameLogic();
				break;
			case WIN:
				gameover = true;
				map.draw();
				break;
			case LOSE:
				gameover = true;
				map.draw();
				break;
			}
		}
	}
	
	public Map getMap()
	{
		return map;
	}
}
