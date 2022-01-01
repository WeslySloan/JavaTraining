package cat;

public class HappyState implements State {
	Cat cat;
	
	public HappyState(Cat cat) {
		this.cat = cat;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("�谡 �ҷ��� ¥�������� �� ");
		cat.setState(cat.getFullState());
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("�� �������");
		cat.setState(cat.getHungryState());
	}
}
