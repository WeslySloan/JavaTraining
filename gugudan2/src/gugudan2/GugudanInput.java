package gugudan2;

import java.util.Scanner;

public class GugudanInput {
	// 필드변수들??
	
	// 메소드들
	public void go() {
		Scanner scanner = new Scanner(System.in);
		int dan = scanner.nextInt();
		
		Gugudan gugudan = new Gugudan();
		gugudan.go(dan);
	}
}
