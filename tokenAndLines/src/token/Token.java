package token;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Token {
	HashMap<String, LinesAndCount> hashMap = new HashMap<String, LinesAndCount>();
	
	public Token() {
		File file = new File("D:\\temp\\Bank.java");
		int lineNumber = 0;

		Scanner scanner = null;
		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		StringTokenizer tokenizer = null;
		String line = "";
		LinesAndCount linesAndCount = null;
		
		while (scanner.hasNext()) {
			lineNumber++;
			line = scanner.nextLine();
			System.out.println(line);
			
			tokenizer = new StringTokenizer(line);
			while (tokenizer.hasMoreTokens()) {
				String token = tokenizer.nextToken();
				if (hashMap.containsKey(token)) {
					linesAndCount = hashMap.get(token);
					linesAndCount.setCount(linesAndCount.getCount() + 1);
					linesAndCount.getLines().add(lineNumber);
					
					hashMap.put(token, linesAndCount);
				} else {
					linesAndCount = new LinesAndCount();
					linesAndCount.setCount(1);
					linesAndCount.getLines().add(lineNumber);
					hashMap.put(token, linesAndCount);
				}
			}
		}
	}
	
	public void start() {
		Scanner scanner = new Scanner(System.in);
		LinesAndCount linesAndCount = null;
		
		while (true) {
			System.out.println("ã�� �ܾ �Է��ϼ���: , �������� q�� �Է��ϼ���.");
			String word = scanner.nextLine();
			if (word == "q") {
				break;
			}
			
			int count = 0;
			if (hashMap.containsKey(word)) {
				linesAndCount = hashMap.get(word);				
			} else {
				System.out.println("�� �ܾ�� �����.");
			}

			System.out.println(word + "�ܾ��� ���� Ƚ���� " + linesAndCount.getCount() + "�̰�, ��ġ�� ");
			for (int lineNumber : linesAndCount.getLines()) {
				System.out.print(lineNumber + ", ");
			}
		}
	}
}
