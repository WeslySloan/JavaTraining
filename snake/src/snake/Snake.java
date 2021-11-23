package snake;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Snake {
	JFrame frame;
	int WIDTH = 1024;
	int HEIGHT = 768;
	int speed = 50;
	ArrayList<Madi> snake = new ArrayList<Madi>();
	
	public Snake() {
		frame = new JFrame("¹ì °ÔÀÓ");
		GamePanel gamePanel = new GamePanel();
		frame.getContentPane().add(gamePanel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ´Ý±â¹öÆ° ´©¸£¸é ²¨Áü
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
		
		snake.add(new Madi(x, y));
		snake.add(new Madi(x-1, y));
		snake.add(new Madi(x-2, y));
		snake.add(new Madi(x-3, y));

		foodX = (int) (Math.random() * WIDTH);
		foodY = (int) (Math.random() * HEIGHT);
	}
	
	public void play() {
		while (true) {
			
			x += xDirection;
			y += yDirection;
			
			int length = snake.size();
			
			int lastX = snake.get(length - 1).getX();
			int lastY = snake.get(length - 1).getY();
					
			for (int i = length - 1; i> 0; i--) {
				snake.get(i).setX(snake.get(i-1).getX());
				snake.get(i).setY(snake.get(i-1).getY());
			}
			
			snake.get(0).setX(snake.get(0).getX() + xDirection);
			snake.get(0).setX(snake.get(0).getY() + yDirection);
			
			if ((snake.get(0).getX() == foodX) && (snake.get(0).equals(getY() == food Y)) {
				snake.add(new Madi(lastX, lastY));
			}
			
			
			
			frame.repaint();
			
			try {
				Thread.sleep(speed);
			} catch (InterruptedException e) {
				// TODO auto-generated catch block
				e.printStackTrace();
		}
	}
	
	private class GamePanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			// ??
			
		}
	}
}
