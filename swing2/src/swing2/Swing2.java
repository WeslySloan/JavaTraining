//package swing2;
//
//import java.awt.Color;
//import java.awt.Graphics;
//
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//
//public class Swing2 {
//	JFrame frame;
//	MyPanel panel;
//	
//	public Swing2() {
//		frame = new JFrame();
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setSize(600, 400);
//		frame.setVisible(true);
//		
//		panel = new MyPanel();
//		frame.getContentPane().add(panel);
//		
//		frame.repaint();
//	}
//	
//	public void start() {
//		
//	}
//	
//	private class MyPanel extends JPanel {
//		public void paintComponent(Graphics g) {
//			super.paintComponent(g);
//					
//			g.setColor(Color.green);
//			g.fillOval(100, 100, 200, 200);
//		}
//	}	
//}
//	 

package swing2;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Swing2 {
	JFrame frame;
	MyPanel panel;
	int x = 0;
	int y = 0;
	int width = 1024;
	int height = 768;
	int speed = 20;
	int radius = 50;
	int stepX = 1;
	int stepY = 1;
	
	
	
	public Swing2() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 400);
		frame.setVisible(true);
		
		panel = new MyPanel();
		frame.getContentPane().add(panel);
		
		frame.repaint();
	}
	
	public void play() {
		while (true) {
			
			if ( x > width - radius *2 ) {
				stepX = -1;
			} else if ( x < 0) {
				stepX = 1;
			}
			if ( y > width - radius *2 ) {
				stepY = -1;
			} else if ( y < 0) {
				stepY = 1;
			}
			 x += stepX;
			 y += stepY;
			
			frame.repaint();
			
			try {
				Thread.sleep(speed);  // ms ´ÜÀ§
			} catch(InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setColor(Color.red);
			g.fillOval(x, y, 100, 100);
		}
	}
}
