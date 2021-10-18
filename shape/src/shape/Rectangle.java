package shape;

public class Rectangle implements Shape {
	public double width = 0;
	public double height = 0;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(double width) {
		this(width, width);
	}
	
	public Rectangle() {
		this(10, 10);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public void area() {
		System.out.println(width * height);
	}
}
