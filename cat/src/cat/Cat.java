package cat;

public class Cat {
	State angryState = new AngryState(this);
	State hungryState = new HungryState(this);
	State happyState = new HappyState(this);
	State fullState = new FullState(this);
	
	State state = angryState;
	
	public Cat() {
		
	}
	
	public void eat() {
		state.eat();
	}
	
	public void play() {
		state.play();
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public State getAngryState() {
		return angryState;
	}

	public State getHungryState() {
		return hungryState;
	}

	public State getHappyState() {
		return happyState;
	}

	public State getFullState() {
		return fullState;
	}
}
