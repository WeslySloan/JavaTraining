package cat;

public class AngryState implements State {
	Cat cat;
	
	public AngryState(Cat cat) {
		this.cat = cat;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("허겁지겁, 아 아직 배가 조금 고파요.");
		cat.setState(cat.getHungryState());
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("아, 배고파 미치겠다");		
	}
}
