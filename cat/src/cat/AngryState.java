package cat;

public class AngryState implements State {
	Cat cat;
	
	public AngryState(Cat cat) {
		this.cat = cat;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("�������, �� ���� �谡 ���� ���Ŀ�.");
		cat.setState(cat.getHungryState());
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("��, ����� ��ġ�ڴ�");		
	}
}
