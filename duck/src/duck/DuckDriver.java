package duck;

import java.util.ArrayList;

public class DuckDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Duck> ducks = new ArrayList<Duck>();
		ducks.add(new MallardDuck());
		ducks.add(new RedHeadDuck());
		ducks.add(new MallardDuck());
		ducks.add(new RubberDuck());
		// ....
		
		for (Duck duck : ducks) {
			duck.fly();		// ´ÙÇü¼º
		}
		
//		Duck duck1 = new RedHeadDuck();
//		duck1.fly();
//		duck1.setFlyBehavior(new FlyWell());
//		duck1.fly();
	}

}
