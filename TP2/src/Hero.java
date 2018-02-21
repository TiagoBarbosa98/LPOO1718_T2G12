import java.util.Scanner;
import java.awt.event.KeyEvent;

public class Hero {
	static Scanner sc = new Scanner(System.in);
	
	//Key Codes for the arrows
	static final int UP_ARROW = 38;
	static final int DOWN_ARROW = 40;
	static final int LEFT_ARROW = 37;
	static final int RIGHT_ARROW = 39;
	
	//Updating the position: -1 if down or left, 1 if up or right
	private int dx;
	private int dy;
	
	//current position in the map
	private int x_pos = 1;
	private int y_pos = 1;
	
	
	public Hero()
	{
	}
	
	
	//get methods
	public int getDx()
	{
		return dx;
	}
	
	public int getDy()
	{
		return dy;
	}
	
	public int getX()
	{
		return x_pos;
	}
	
	public int getY()
	{
		return y_pos;
	}
	
	
	public void moveDirection(KeyEvent e)
	{
		
	}
	
	
	//receives keycode
	public void keyPressed(KeyEvent e)
	{
		int key = e.getKeyCode();
		
		switch(key)
		{
			case UP_ARROW:
				y_pos++;
				break;
			case DOWN_ARROW:
				y_pos--;
				break;
			case LEFT_ARROW:
				x_pos--;
			case RIGHT_ARROW:
				x_pos++;			
		}
	}
	
}
