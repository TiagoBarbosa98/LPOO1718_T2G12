import java.util.Scanner;

public class Game {

	static Scanner sc = new Scanner(System.in);
	
	private boolean gameOver;
	
	protected Map map = new Map(this);
	protected Entity hero;
	protected Entity guard;
	protected Door door1;
	protected Door door2;
	protected Door door3;
	protected Door door4;
	protected Door door5;
	protected Door door6;
	protected Door door7;
	protected Entity key;
	
	protected Entity entities[] = {hero, guard, door1, door2, door3, door4, door5, door6, door7, key};
	
	protected char [][] buffer = new char[10][10];

	public Game() {
		hero = new Hero(1, 1, this);
		guard = new Guard(1, 8, this);
		door1 = new Door(1, 4, this);
		door2 = new Door(3, 2, this);
		door3 = new Door(3, 4, this);
		door4 = new Door(5, 0, this);
		door5 = new Door(6, 0, this);
		door6 = new Door(8, 2, this);
		door7 = new Door(8, 4, this);
		key = new Key(8, 7, this, door4, door5);
		while (!gameOver) {
			setBuffer();
			printBuffer();
			hero.updateEntity();
			guard.updateEntity();
			key.updateEntity();
			gameOver = hero.isNear(guard);
		}
	}

	public void setBuffer() {
		for (int i = 0; i < buffer.length; i++) {
			for (int j = 0; j < buffer[i].length; j++) {
				if (i == hero.getX() & j == hero.getY()) {
					buffer[i][j] = hero.getSymbol();
				} else if (i == guard.getX() & j == guard.getY()) {
					buffer[i][j] = guard.getSymbol();
				} else if (i == key.getX() & j == key.getY()) {
					buffer[i][j] = key.getSymbol();
				} else if (i == door1.getX() & j == door1.getY()) {
					buffer[i][j] = door1.getSymbol();
				} else if (i == door2.getX() & j == door2.getY()) {
					buffer[i][j] = door2.getSymbol();
				} else if (i == door3.getX() & j == door3.getY()) {
					buffer[i][j] = door3.getSymbol();
				} else if (i == door4.getX() & j == door4.getY()) {
					buffer[i][j] = door4.getSymbol();
				} else if (i == door5.getX() & j == door5.getY()) {
					buffer[i][j] = door5.getSymbol();
				} else if (i == door6.getX() & j == door6.getY()) {
					buffer[i][j] = door6.getSymbol();
				} else if (i == door7.getX() & j == door7.getY()) {
					buffer[i][j] = door7.getSymbol();
				} else {
					buffer[i][j] = map.getMap()[i][j];
				}
			}
			System.out.println();
		}
	}
	
	// prints the buffer
	public void printBuffer() 
	{
		for (int i = 0; i < buffer.length; i++) {
			for (int j = 0; j < buffer[i].length; j++) {

				System.out.print(buffer[i][j]);
				System.out.print(' ');
			}
			System.out.println();
		}
	}
}
