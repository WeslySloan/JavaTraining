package circle;

public class circle {
	// 필드 변수들
	private double radius = 0.0;
	
	// 정수면 int 실수면 double 딴거 생각 X
	
	//메소드들
	//생성자 메소드
	public circle() {
		// radius = 10.0;
	}
	//게터와 세터 메소드
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return this.radius;
	}
	
	public double area() {
		return radius * radius * Math.PI;
	} 
	// 일반 메소드
	public void start() {
		System.out.println(area());
	}
}
