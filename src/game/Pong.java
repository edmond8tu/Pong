package game;

import javax.swing.JFrame;
import java.awt.Color; 

public class Pong extends JFrame {
	private final int WIDTH = 500;
	private final int HEIGHT = 500;
	private final static String NAME = "PONG GAME";

	public Pong(String title, Ball ball) {
		super(title);
		setSize(WIDTH, HEIGHT);
		add(ball);
		//setBackground(Color.BLACK);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String [] args) {
		new Pong(NAME, new Ball());
	}
}