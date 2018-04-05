package dkeep.logic;

public class Game {

	protected Map map;
	private boolean gameover = false;
	public enum State {MENU, LEVEL1, LEVEL2, WIN, LOSE}
	public State state = Game.State.MENU;
	
	public Game(){}

	public void initialize() {

		map = new Level1(this);
		map.draw();
		
		while (!gameover) {

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
}
