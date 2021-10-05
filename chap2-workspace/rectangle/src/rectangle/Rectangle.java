package rectangle;

public class Rectangle {
	// 필드변수들
	private double width = 0.0;
	private double height = 0.0;
	
	// 메소드들
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(double width) {
		this(width, width);
	}
	
	public Rectangle() {
		this(10.0, 8.0);
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
	
	public double area() {
		return width * height;
	}
}
