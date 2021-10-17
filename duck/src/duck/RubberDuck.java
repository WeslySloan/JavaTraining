package duck;

public class RubberDuck extends Duck {
	
	public RubberDuck() {
		flyBehavior = new NoFly();
	}
}
