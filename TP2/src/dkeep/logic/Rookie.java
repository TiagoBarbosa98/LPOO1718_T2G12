package dkeep.logic;

public class Rookie extends Guard{

	public Rookie(int posx, int posy, Map map) {
		super(posx, posy, map);
		movement = sequence;
		index = 0;
	}

	@Override
	public void updateEntity() 
	{
		this.moveForward();
	}
}
