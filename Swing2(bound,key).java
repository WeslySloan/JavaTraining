package swing2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Swing2 {
	JFrame frame;
	MyPanel panel;
	int x = 200;
	int y = 0;
	int width = 1024;
	int height = 768;
	int speed = 10;
	int radius = 50;
	int stepX = 1;
	int stepY = 1;
	
	public Swing2() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.setVisible(true);
		frame.addKeyListener(new MyListener());
		
		panel = new MyPanel();
		frame.getContentPane().add(panel);
	}
	
	public void play() {
		while (true) {
			if (x > width - radius * 2) {
				stepX = -1;
			} else if (x < 0) {
				stepX = 1;
			}
			
			if (y > height - radius * 2) {
				stepY = -1;
			} else if (y < 0) {
				stepY = 1;
			}
			
			x += stepX;
			y += stepY;
			
			frame.repaint();
			
			try {
				Thread.sleep(speed);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private class MyListener implements KeyListener {

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				stepX = -1;
				stepY = 0;
			} else if (e.getKeyCode() == KeyEvent.VK_UP) {
				stepX = 0;
				stepY = -1;
			} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				stepX = 1;
				stepY = 0;
			} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
				stepX = 0;
				stepY = 1;
			} 
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setColor(Color.red);
			g.fillOval(x, y, radius * 2, radius * 2);
		}
	}
}
