package cat;

public class FullState implements State {
	Cat cat;
	
	public FullState(Cat cat) {
		this.cat = cat;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("��, ��¥ �� ���� �װڴ�");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("��, �� ����");
		cat.setState(cat.getHappyState());
	}
}
