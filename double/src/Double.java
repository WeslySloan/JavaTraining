import java.util.Scanner;

public class Double {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);		// 알바 생성(채용) == 무슨 객체 생성
		int number = scanner.nextInt();
		
		number = number * 2;
		System.out.print(number);					// 출력 담당 알바 == 출력 담당 객체 생성?   예: Math
	}
}
