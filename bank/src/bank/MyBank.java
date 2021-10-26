package bank;

import java.util.HashMap;
import java.util.Scanner;

public class MyBank {
	// �ʵ�
	private HashMap<Integer, MyAccount> hashMap = new HashMap<Integer, MyAccount>();
	
	
	// �޼ҵ�
	public MyBank() {
		
	}
	
	public void prompt(String message) {
		System.out.println(message);
	}
	
	public MyAccount login() {
		Scanner scanner = new Scanner(System.in);
		prompt("�ֹι�ȣ 6�ڸ��� �Է����ּ���: ");
		
		int id = scanner.nextInt();
		MyAccount account = hashMap.get(id);
		
		return account;
	}
	
	public MyAccount create() {
		Scanner scanner = new Scanner(System.in);
		prompt("�ֹι�ȣ 6�ڸ��� �־��ּ���");
		int id =scanner.nextInt();
		prompt("�̸��� �־��ּ���: ");
		String name = scanner.next();
		
		MyAccount account = new MyAccount(name, 0);
		hashMap.put(id,  account);
		
		return account;
	}
	
	public void deposit(MyAccount account) {
		Scanner scanner = new Scanner(System.in);
		prompt("�Ա��Ͻ� �ݾ��� �־��ּ���: ");
		
		double money = scanner.nextDouble();
		double ballance = account.getBalance();
		account.setBalance(ballance + money);
		
		prompt("���� �ܾ��� " + account.getBalance() + "�Դϴ�.");
	}
	
	
	public void menu() {
		MyAccount account = null;
		while (true) {
			System.out.println("���ϴ� ������ �������ּ���. 1)�α���, 2) �ű� ���� ����, 3) �Ա�, 4) ���, 5) ��ü, 0) ����");
			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();
			switch (choice) {
				case 1:
					account = login();
					break;
				case 2:
					account = create();
					break;
				case 3:
					deposit(account);
				break;
				case 0:
					prompt("�ȳ������ʽÿ�.");
					return;
			}
		}
	}

}