package dkeep.logic;

public class Game {

	protected Map map;
	private boolean gameover = false;
	public enum State {MENU, LEVEL1, LEVEL2, WIN, LOSE}
	public State state = Game.State.LEVEL1;
	
	public Game() {
		map = new Level1(this);
	}

	public void initialize() {

		map.draw();
		
		while (!gameover) {
			System.out.println(state);
			switch (state) {
			case MENU:
			case LEVEL1:
				map.gameLogic();
				break;
			case LEVEL2:
				map.gameLogic();
				break;
			case WIN:
				gameover = true;
				break;
			case LOSE:
				gameover = true;
				break;
			}
			
		}
	}
	
	public Map getMap()
	{
		return map;
	}
	
	public Hero getHero()
	{
		return this.map.getHero();
	}
	
	public boolean getGameOver()
	{
		return gameover;
	}
}
