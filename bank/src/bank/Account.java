package bank;

public class Account {
	private String name = "";
	private double balance = 0.0;
	// 주소, 신용등급, 대출잔액, 카드, ….
	
	public Account(String name, double balance) {
		super();  // Object
		this.name = name;
		this.balance = balance;
	}
	
	public Account(String name) {
		this(name, 0);
	}
	
	public Account() {
		System.out.println("계좌 생성할 때 최소한 이름은 있어야 합니다.");
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
