package cat;

public class HungryState implements State {
	Cat cat;
	
	public HungryState(Cat cat) {
		this.cat = cat;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("아, 딱 좋아요");
		cat.setState(cat.getHappyState());
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("아, 진짜 배고파진다");
		cat.setState(cat.getAngryState());
	}
}
