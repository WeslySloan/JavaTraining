package cat;

public class HappyState implements State {
	Cat cat;
	
	public HappyState(Cat cat) {
		this.cat = cat;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("배가 불러서 짜증나려고 해 ");
		cat.setState(cat.getFullState());
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("쫌 배고프네");
		cat.setState(cat.getHungryState());
	}
}
