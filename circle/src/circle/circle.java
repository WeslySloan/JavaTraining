package circle;

public class circle {
	// �ʵ� ������
	private double radius = 0.0;
	
	// ������ int �Ǽ��� double ���� ���� X
	
	//�޼ҵ��
	//������ �޼ҵ�
	public circle() {
		// radius = 10.0;
	}
	//���Ϳ� ���� �޼ҵ�
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return this.radius;
	}
	
	public double area() {
		return radius * radius * Math.PI;
	} 
	// �Ϲ� �޼ҵ�
	public void start() {
		System.out.println(area());
	}
}