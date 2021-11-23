package snake;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Snake {
	JFrame frame;
	int WIDTH = 120;
	int HEIGHT = 80;
	int speed = 50;
	ArrayList<Madi> snake = new ArrayList<Madi>();
	
	int x = 10;
	int y = 10;
	
	int xDirection = 1;
	int yDirection = 0;
	
	int foodX = 0;
	int foodY = 0;
	
	int size = 10;
	
	public Snake() {
		frame = new JFrame("¹ì °ÔÀÓ");
		GamePanel gamePanel = new GamePanel();
		frame.getContentPane().add(gamePanel);
		
		frame.addKeyListener(new MyListener());
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(WIDTH * size, HEIGHT * size);
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
			
			for (int i = length - 1; i > 0; i--) {
				snake.get(i).setX(snake.get(i - 1).getX());
				snake.get(i).setY(snake.get(i - 1).getY());
			}
			
			snake.get(0).setX(snake.get(0).getX() + xDirection);
			snake.get(0).setY(snake.get(0).getY() + yDirection);
			
			if ((snake.get(0).getX() == foodX) && (snake.get(0).getY() == foodY)) {
				snake.add(new Madi(lastX, lastY));
				
				foodX = (int) (Math.random() * WIDTH);
				foodY = (int) (Math.random() * HEIGHT);
			}
			
			frame.repaint();
			
			try {
				Thread.sleep(speed);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private class GamePanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			for (Madi madi : snake) {
				g.setColor(Color.cyan);
				g.fillRect(madi.getX() * size, madi.getY() * size, size, size);
				
				g.setColor(Color.red);
				g.drawRect(madi.getX() * size, madi.getY() * size, size, size);				
			}
			
			g.setColor(Color.orange);
			g.fillOval(foodX * size, foodY * size, size, size);
		}
	}
	
	private class MyListener implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			switch (e.getKeyCode()) {
				case KeyEvent.VK_UP:
					xDirection = 0;
					yDirection = -1;
					break;
				case KeyEvent.VK_DOWN:
					xDirection = 0;
					yDirection = 1;
					break;
				case KeyEvent.VK_LEFT:
					xDirection = -1;
					yDirection = 0;
					break;
				case KeyEvent.VK_RIGHT:
					xDirection = 1;
					yDirection = 0;
					break;
			}
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
