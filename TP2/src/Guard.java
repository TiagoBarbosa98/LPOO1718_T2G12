
public class Guard {

	private int x = 1;
	private int y = 8;
	private int oldx;
	private int oldy;
	
	public int getGuardX()
	{
		return x;
	}
	
	public int getGuardY()
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
	
	public void updateGuard()
	{	
		if(x == 1 & y == 8)
		{
			oldy = y;
			oldx = x;
			y--;
		}
		else if(y == 7 & x < 5)
		{
			oldx = x;
			oldy = y;
			x++;
		}
		else if(x == 5 & y > 1 & y < 8)
		{	
			oldx = x;
			oldy = y;
			y--;
		}
		else if(x == 5 & y == 1)
		{
			oldx = x;
			oldy = y;
			x++;
		}
		else if(x == 6 & y < 8)
		{
			oldx = x;
			oldy = y;
			y++;
		}
		else if(x > 1 & y == 8)
		{
			oldx = x;
			oldy = y;
			x--;
		}
	}
	
}
