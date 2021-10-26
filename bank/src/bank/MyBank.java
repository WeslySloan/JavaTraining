package bank;

import java.util.HashMap;
import java.util.Scanner;

public class MyBank {
	// 필드
	private HashMap<Integer, MyAccount> hashMap = new HashMap<Integer, MyAccount>();
	
	
	// 메소드
	public MyBank() {
		
	}
	
	public void prompt(String message) {
		System.out.println(message);
	}
	
	public MyAccount login() {
		Scanner scanner = new Scanner(System.in);
		prompt("주민번호 6자리를 입력해주세요: ");
		
		int id = scanner.nextInt();
		MyAccount account = hashMap.get(id);
		
		return account;
	}
	
	public MyAccount create() {
		Scanner scanner = new Scanner(System.in);
		prompt("주민번호 6자리를 넣어주세요");
		int id =scanner.nextInt();
		prompt("이름을 넣어주세요: ");
		String name = scanner.next();
		
		MyAccount account = new MyAccount(name, 0);
		hashMap.put(id,  account);
		
		return account;
	}
	
	public void deposit(MyAccount account) {
		Scanner scanner = new Scanner(System.in);
		prompt("입금하실 금액을 넣어주세요: ");
		
		double money = scanner.nextDouble();
		double ballance = account.getBalance();
		account.setBalance(ballance + money);
		
		prompt("현재 잔액은 " + account.getBalance() + "입니다.");
	}
	
	
	public void menu() {
		MyAccount account = null;
		while (true) {
			System.out.println("원하는 업무를 선택해주세요. 1)로그인, 2) 신규 계좌 개설, 3) 입금, 4) 출금, 5) 이체, 0) 종료");
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
					prompt("안녕히가십시오.");
					return;
			}
		}
	}

}
