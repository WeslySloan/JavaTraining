package shape;

public class Circle implements Shape {
	// �ʵ� ������
	private double radius = 0;
	
	// ������
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle() {
		this(10.0);
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println(radius * radius * Math.PI);
	}


}
