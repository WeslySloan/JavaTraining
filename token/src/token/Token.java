package token;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Token {
	HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
	
	public Token() {
		File file = new File("c:\\temp\\Bank.java");
		
		Scanner scanner;
		try {
			scanner = new Scanner(file);
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		StringTokenizer tokenizer = null;
		String line = "";
		
		while (true) {
			line = scanner.nextLine();
			tokenizer = new StringTokenizer(line);
			while (tokenizer.hasMoreTokens()) {
				String token = tokenizer.nextToken();
				if (hashMap.containsKey(token)) {
					hashMap.put(token,  hashMap.get(token) + 1);
				} else {
					hashMap.put(token,  1);
				}
			}
		}
		
	}
		
	public void start() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("ã�� �ܾ �Է��ϼ���: , ��Ʈ������ q�� �Է��ϼ���.");
			String word = scanner.nextLine();
			if (word == "q") {
				break;
			}
			
			int count = 0;
			if (hashMap.containsKey(word)) {
				count = hashMap.get(word);
			} 
			else {
				System.out.println("�� �ܾ�� �����.");
			}
//			int count = (int) hashMap.get(word);
			System.out.println(word + "�ܾ��� ���� Ƚ���� " + count + "�Դϴ�.");
		}
	}

}