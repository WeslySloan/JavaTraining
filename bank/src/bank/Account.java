package bank;

public class Account {
	private String name = "";
	private double balance = 0.0;
	// �ּ�, �ſ���, �����ܾ�, ī��, ��.
	
	public Account(String name, double balance) {
		super();  // Object
		this.name = name;
		this.balance = balance;
	}
	
	public Account(String name) {
		this(name, 0);
	}
	
	public Account() {
		System.out.println("���� ������ �� �ּ��� �̸��� �־�� �մϴ�.");
		System.exit(-1);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
