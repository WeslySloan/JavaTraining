

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest {
	HashMap<String, Integer> map = new HashMap<String, Integer>();

		public void test() {
			Scanner scanner = new Scanner(System.in);
			String input = "";
			System.out.println("���Ͽ� �� �ܾ���� �Է����ּ���");
			while (true) {

				input = scanner.nextLine();
				if (input.isEmpty()) {
					System.out.println("�Է� �� !!");
					break;
				} else if (map.containsKey(input)) {
					map.put(input, map.get(input)+1);
				} else {
					map.put(input, 1);
					}		
				}
			System.out.println("���ε� ����� ...");

			for (String key : map.keySet()) {
				System.out.println(key + " �ܾ " + map.get(key) + "��");
			}
		}
}