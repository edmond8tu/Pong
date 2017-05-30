package game;

import java.awt.Graphics;
import java.awt.Color;	
import javax.swing.JPanel;
import java.util.Timer;
import java.util.TimerTask;

public class Ball extends JPanel{
	private final static int WIDTH = 30;
	private final static int HEIGHT = 30;
	private int x = 200;
	private int y = 200;
	private int dx = 25;
	private int dy = 0;

	public Ball() {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			public void run() {
				System.out.println(getWidth());
				x += dx;
				y += dy;

				if (x <= 0) {
					dx = 25;
				} else if (x >= getWidth() - 45) {
					dx = -25;
				}
				
				repaint();
			}
		}, 1000, 500);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.fillOval(x, y, WIDTH, HEIGHT);
	}
}