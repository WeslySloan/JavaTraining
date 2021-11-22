package swing2;

public class Jewel {
	int x;
	int y;
	int radius;
	int color;
	
	public Jewel(int width, int height) {
		x = (int) (Math.random() * width);
		y = (int) (Math.random() * height);
		radius = 3 + (int) (Math.random() * 10);
		color = (int) (Math.random() * 0xFFFFFF);
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
}
