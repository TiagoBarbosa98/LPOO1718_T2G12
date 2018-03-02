import java.util.Scanner;

public class Hero {
	static Scanner sc = new Scanner(System.in);
	
	//Key Codes for the arrows
	static final int UP_ARROW = 38;
	static final int DOWN_ARROW = 40;
	static final int LEFT_ARROW = 37;
	static final int RIGHT_ARROW = 39;
	
	
	//current position in the map (the hero starts in pos 1, 1)
	private int x = 1;
	private int y = 1;
	
	//x and y before update (to help update the map)
	private int oldx;
	private int oldy;
	
	
	public Hero()
	{
	}
	
	
	//get methods
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public int getOldX()
	{
		return oldx;
	}
	
	public int getOldY()
	{
		return oldy;
	}
	
	//set methods
	void setX(int newX)
	{
		x = newX;
	}
	void setY(int newY)
	{
		y = newY;
	}
	void setOldX(int newX)
	{
		oldx = newX;
	}
	void setOldY(int newY)
	{
		oldy = newY;
	}
	
	//receives keycode and updates the hero's coordinates (1 for up, 2 for down, 3 for left, 4 for right)
	public int updateHero()
	{
		while(!sc.hasNext())
		{
			sc.next();
		}
		
		String input = sc.next();
		
		int result = 0;
		
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
	
}
