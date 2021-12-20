package PingPong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;


public class Ball implements Runnable
{
	//global variables
	int x, y, xDirection, yDirection;
	
	int p1score, p2score;
	
	boolean scorecheck;
	
	Paddle p1 = new Paddle(100, 390, 1);
	Paddle p2 = new Paddle(1480, 390, 2);
	
	Rectangle ball;

	public Ball(int x, int y){
		p1score = p2score = 0;
		this.x = x;
		this.y = y;
		
		//Set ball moving randomly
		Random r = new Random();
		int rXDir = r.nextInt(3);
		if (rXDir == 0)
			rXDir--;
		setXDirection(rXDir);
		
		int rYDir = r.nextInt(3);
		if (rYDir == 0)
			rYDir--;
		setYDirection(rYDir);
		
		//create "ball"
		ball = new Rectangle(this.x, this.y, 30, 30);
	}
	
	public void setXDirection(int xDir){
		xDirection = xDir;
	}
	public void setYDirection(int yDir){
		yDirection = yDir;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.orange);
		g.fillRect(ball.x, ball.y, ball.width, ball.height);
		g.setColor(Color.white);
		g.fillRect(795, 40, 10, 860);
	}
	
	public void collision(){
        if(ball.intersects(p1.paddle))
            setXDirection(+3);
        if(ball.intersects(p2.paddle))
            setXDirection(-3);
	}	
	
	public void move() {
		collision();
		ball.x += xDirection;
		ball.y += yDirection;
		//bounce the ball when it hits the edge of the screen
		if (ball.x <= 0) {
			setXDirection(+3);
			p2score++;
	}
		if (ball.x >= 1600) {
			setXDirection(-3);
			p1score++;
		}
		
		if (ball.y <= 40) {
			setYDirection(+3);
		}
		
		if (ball.y >= 900) {
			setYDirection(-3);
		}
		
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				move();
				Thread.sleep(8);
			}
		}catch(Exception e) { System.err.println(e.getMessage()); }

	}

}