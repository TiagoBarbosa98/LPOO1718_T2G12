import java.util.Scanner;

public class Hero {
	static Scanner sc = new Scanner(System.in);
	
	//Key Codes for the arrows
	static final int UP_ARROW = 38;
	static final int DOWN_ARROW = 40;
	static final int LEFT_ARROW = 37;
	static final int RIGHT_ARROW = 39;
	
	
	//current position in the map (the hero starts in pos 1, 1)
	private int x_pos = 1;
	private int y_pos = 1;
	
	//x and y before update (to help update the map)
	private int old_x_pos = 1;
	private int old_y_pos = 1;
	
	
	public Hero()
	{
	}
	
	
	//get methods
	
	public int getX()
	{
		return x_pos;
	}
	
	public int getY()
	{
		return y_pos;
	}
	
	public int getOldX()
	{
		return old_x_pos;
	}
	
	public int getOldY()
	{
		return old_y_pos;
	}
	
	//set methods
	void setX(int newX)
	{
		x_pos = newX;
	}
	void setY(int newY)
	{
		y_pos = newY;
	}
	void setOldX(int newX)
	{
		old_x_pos = newX;
	}
	void setOldY(int newY)
	{
		old_x_pos = newY;
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
