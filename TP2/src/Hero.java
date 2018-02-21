import java.util.Scanner;
import java.awt.event.KeyEvent;

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
	
	
	//receives keycode and updates the hero's coordinates
	public void keyPressed(KeyEvent e)
	{
		int key = e.getKeyCode();
		
		switch(key)
		{
			case UP_ARROW:
				old_y_pos = y_pos;
				y_pos--;
				break;
			case DOWN_ARROW:
				old_y_pos = y_pos;
				y_pos++;
				break;
			case LEFT_ARROW:
				old_x_pos = x_pos;
				x_pos--;
			case RIGHT_ARROW:
				old_x_pos = x_pos;
				x_pos++;			
		}
	}
	
}
