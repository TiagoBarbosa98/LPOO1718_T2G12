package dkeep.logic;

public abstract class Guard extends Entity {
	
	//string that defines Guard's normal movement
	protected String sequence = "assssaaaaaasdddddddwwwww";
	
	protected String rev_sequence = "dwwwwddddddwaaaaaaasssss";
	
	
	//constructor
	public Guard(int posx, int posy, Map map) 
	{
		super(posx, posy, map);
		symbol = 'G';
	}

	@Override
	public abstract void updateEntity();
	
	public void move() {
		int i = Math.floorMod(index, movement.length());
		
		char first = movement.charAt(i);
		char input = Character.toLowerCase(first);
		
		doSomething(input);
	}
}
