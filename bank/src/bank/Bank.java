package bank;

import java.util.HashMap;
import java.util.Scanner;

public class Bank {
	// �ʵ� ������?
	private HashMap<Integer, Account> hashMap = new HashMap<Integer, Account>();
	
	// ===========================
	// �޼ҵ��
	public Bank() {
		
	}
	
	public void prompt(String message) {
		System.out.println(message);
	}
	
	public Account login() {
		Scanner scanner = new Scanner(System.in);
		prompt("�ֹι�ȣ 6�ڸ��� �־��ּ���: ");
		
		int id = scanner.nextInt();
		Account account = hashMap.get(id);
		
		return account;
	}
	
	public Account create() {
		Scanner scanner = new Scanner(System.in);
		prompt("�ֹι�ȣ 6�ڸ��� �־��ּ���: ");
		int id = scanner.nextInt();
		prompt("�̸��� �־��ּ���: ");
		String name = scanner.next();
		
		Account account = new Account(name, 0);
		hashMap.put(id, account);
		
		return account;
	}
	
	public void deposit(Account account) {
		Scanner scanner = new Scanner(System.in);
		prompt("�Ա��Ͻ� �ݾ��� �־��ּ���: ");
		
		double money = scanner.nextDouble();
		double ballance = account.getBalance();
		account.setBalance(ballance + money);
		
		prompt("���� �ܾ��� " + account.getBalance() + "�Դϴ�.");
	}
	
	public void menu() {
		Account account = null;
		
		while (true) {
			prompt("���ϴ� ������ �������ּ���. 1) �α���, 2) �ű� ���� ����, 3) �Ա�, 4) ���, 5) ��ü, 0) ����");
			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();
			switch (choice) {
				case 1: account = login();
					break;
				case 2: account = create();
					break;
				case 3: deposit(account);
					break;
//				case 4: withdraw();
//					break;
//				case 5: transfer();
//					break;
				case 0: prompt("�ȳ��� ���ʽÿ�.");
					return;
			}
		}	
	}
}
