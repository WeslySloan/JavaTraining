package swing2;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Swing2 {
	JFrame frame;
	MyPanel panel;
	
	public Swing2() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 400);
		frame.setVisible(true);
		
		panel = new MyPanel();
		frame.getContentPane().add(panel);
		
		frame.repaint();
	}
	
	public void start() {
		
	}
	
	private class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setColor(Color.red);
			g.fillOval(100, 100, 200, 200);
		}
	}
}
