package shape;

import java.util.ArrayList;

public class ShapeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Shape shape = new Circle();
//		shape.area();
//		
//		shape = new Rectangle();
//		shape.area();
//		
//		shape = new Triangle();
//		shape.area();
		
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		shapes.add(new Circle());
		shapes.add(new Rectangle());
		shapes.add(new Triangle());
		// .... 수십개의 도형들
		
		for (int i = 0; i < shapes.size(); i++) {
			shapes.get(i).area();
		}
		
	}

}
