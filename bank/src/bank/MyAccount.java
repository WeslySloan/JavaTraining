package bank;

public class MyAccount {
	private String name = "";
	private double balance = 0.0;
	
	public MyAccount(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}

	public MyAccount(String name) {
		this(name, 0);
	}
	
	public MyAccount() {
		System.out.println("계좌 생성시, 최소한 이름은 있어야 합니다.");
		System.exit(-1);
	}

	
	
	
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
