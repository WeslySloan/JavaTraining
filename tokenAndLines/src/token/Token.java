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
			System.out.println("찾는 단어를 입력하세요: , 끝내려면 q를 입력하세요.");
			String word = scanner.nextLine();
			if (word == "q") {
				break;
			}
			
			int count = 0;
			if (hashMap.containsKey(word)) {
				linesAndCount = hashMap.get(word);				
			} else {
				System.out.println("그 단어는 없어요.");
			}

			System.out.println(word + "단어의 등장 횟수는 " + linesAndCount.getCount() + "이고, 위치는 ");
			for (int lineNumber : linesAndCount.getLines()) {
				System.out.print(lineNumber + ", ");
			}
		}
	}
}
