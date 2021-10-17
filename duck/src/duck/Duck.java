package duck;

public class Duck {
	FlyBehavior flyBehavior = null;
	
	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void fly() {
		flyBehavior.fly();
	}
}
