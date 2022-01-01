package cat;

public class HungryState implements State {
	Cat cat;
	
	public HungryState(Cat cat) {
		this.cat = cat;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("��, �� ���ƿ�");
		cat.setState(cat.getHappyState());
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("��, ��¥ ���������");
		cat.setState(cat.getAngryState());
	}
}
