package gugudan2;

import java.util.Scanner;

public class GugudanInput {
	// �ʵ庯����??
	
	// �޼ҵ��
	public void go() {
		Scanner scanner = new Scanner(System.in);
		int dan = scanner.nextInt();
		
		Gugudan gugudan = new Gugudan();
		gugudan.go(dan);
	}
}
