//import java.util.HashMap;
//import javafx.util.Pair;
import java.util.Scanner;

public class Game {

	static Scanner sc = new Scanner(System.in);
	
	Map map = new Map(this);
	Entity hero = new Hero(1, 1, this);
	Entity guard = new Guard(1, 8, this);
	Entity key = new Key(8, 7, this);
	Entity door1 = new Door(1, 4, this);
	Entity door2 = new Door(3, 2, this);
	Entity door3 = new Door(3, 4, this);
	Entity door4 = new Door(5, 0, this);
	Entity door5 = new Door(6, 0, this);
	Entity door6 = new Door(8, 2, this);
	Entity door7 = new Door(8, 4, this);
	
	private boolean gameOver = false;
	
	private char [][] buffer = new char[10][10];

	public Game() {
		while (!gameOver) {
			setBuffer();
			printBuffer();
			hero.updatePosition();
			guard.updatePosition();
			resetBuffer();
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

	public void resetBuffer() 
	{
		buffer = map.getMap();
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
