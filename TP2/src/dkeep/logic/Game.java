package dkeep.logic;

public class Game {

	private Map map;
	public enum State {MENU, LEVEL1, LEVEL2, WIN, LOSE}
	public State state = Game.State.MENU;
	
	public Game(){}
	
	public void initialize() {
		map = new Level1(this);
		while(state != Game.State.WIN | state != Game.State.LOSE) {
			map.gameLogic();
		}
	}
	
	public Map getMap()
	{
		return map;
	}
}
	
