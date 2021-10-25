
import java.util.HashMap;
import java.util.Scanner;

public class HashmapTest {
	HashMap<String, Integer> map = new HashMap<String, Integer>();

		public void test() {
			Scanner scanner = new Scanner(System.in);
			String input = "";
			System.out.println("파일에 들어갈 단어들을 입력해주세요");
			while (true) {

				input = scanner.nextLine();
				if (input.isEmpty()) {
					System.out.println("입력 끝 !!");
					break;
				} else if (map.containsKey(input)) {
					map.put(input, map.get(input)+1);
				} else {
					map.put(input, 1);
					}		
				}
			System.out.println("색인된 결과는 ...");

			for (String key : map.keySet()) {
				System.out.println(key + " 단어가 " + map.get(key) + "개");
			}
		}
}