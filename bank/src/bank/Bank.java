package bank;

import java.util.HashMap;
import java.util.Scanner;

public class Bank {
	// 필드 변수는?
	private HashMap<Integer, Account> hashMap = new HashMap<Integer, Account>();
	
	// ===========================
	// 메소드들
	public Bank() {
		
	}
	
	public void prompt(String message) {
		System.out.println(message);
	}
	
	public Account login() {
		Scanner scanner = new Scanner(System.in);
		prompt("주민번호 6자리를 넣어주세요: ");
		
		int id = scanner.nextInt();
		Account account = hashMap.get(id);
		
		return account;
	}
	
	public Account create() {
		Scanner scanner = new Scanner(System.in);
		prompt("주민번호 6자리를 넣어주세요: ");
		int id = scanner.nextInt();
		prompt("이름을 넣어주세요: ");
		String name = scanner.next();
		
		Account account = new Account(name, 0);
		hashMap.put(id, account);
		
		return account;
	}
	
	public void deposit(Account account) {
		Scanner scanner = new Scanner(System.in);
		prompt("입금하실 금액을 넣어주세요: ");
		
		double money = scanner.nextDouble();
		double ballance = account.getBalance();
		account.setBalance(ballance + money);
		
		prompt("현재 잔액은 " + account.getBalance() + "입니다.");
	}
	
	public void menu() {
		Account account = null;
		
		while (true) {
			prompt("원하는 업무를 선택해주세요. 1) 로그인, 2) 신규 계좌 개설, 3) 입금, 4) 출금, 5) 이체, 0) 종료");
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
				case 0: prompt("안녕히 가십시오.");
					return;
			}
		}	
	}
}
