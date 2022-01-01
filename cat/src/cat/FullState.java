package cat;

public class FullState implements State {
	Cat cat;
	
	public FullState(Cat cat) {
		this.cat = cat;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("아, 진짜 배 터져 죽겠다");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("아, 딱 좋아");
		cat.setState(cat.getHappyState());
	}
}
