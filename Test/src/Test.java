// 5.6초
//public class Test {
//	public static void main(String[] args) {
//		int v[]=new int[100000000]; // n=1억
//		Random random=new Random();
//		for (int i = 0; i < v.length; i++) v[i]=random.nextInt(Integer.MAX_VALUE);
//		long start=System.currentTimeMillis();
//		Arrays.sort(v);
//		System.out.println(v[v.length-1]);
//		System.out.println((System.currentTimeMillis()-start)+" 밀리초"); 
//	}
//}


//0.026초
//public class Test {
//	public static void main(String[] args) {
//		int v[]=new int[100000000]; // n=1억
//		Random random=new Random();
//		for (int i = 0; i < v.length; i++) v[i]=random.nextInt(Integer.MAX_VALUE);
//		long start=System.currentTimeMillis();
//		int max=v[0];
//		for (int i = 0; i < v.length; i++) if(v[i]>max) max=v[i];
//		System.out.println(max);
//		System.out.println((System.currentTimeMillis()-start)+" 밀리초");
//	}
//}


/* public class Test {
	public static void main(String[] args) {
		System.out.println( 7 / 2 ); // 이거만 3 아래 나머지 전부 3.5임
		System.out.println( 7.0 / 2.0 ); 
		System.out.println( 7.0 / 2 );
		System.out.println( 7 / 2.0 ); // 이렇게 하나라도 0.단위까지 표기되면 3.5인듯
		System.out.println( (double)7 / (double)2 );
		System.out.println( (double)7 / 2 );
		System.out.println( 7 / (double)2 );
	}
}
*/
/*public class Test {
	public static void main(String[] args) {
		int score[ ];
		score = new int[3];
		score[0]=11;
		score[1]=22;
		score[2]=33;
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
	}
}*/

/*public class Test {
	public static void main(String[] args) {
		String title="문제해결기법"; // 도서 제목, 문자열
		int publicationYear=2018; // 출판년도, 정수
		double weight=857.4; // 중량, 실수
		boolean supplementYN=false; // 부록 존재 여부, 불리언(true or false)
		char language='K'; // 언어, 문자
		System.out.println(title+","+publicationYear+","+weight+","+supplementYN+","+language);
	}
}*/
/*
 * public class Test { public static void main(String[] args) { String
 * Title="자료구조"; // 영화 제목, 문자열 int Year=2017; // 개봉년도, 정수 double time=2.5; //
 * 시간, 실수 boolean dubbYN=true; // 더빙존재 여부, 불리언(true or false) char language='한';
 * // 언어, 문자
 * System.out.println(Title+","+Year+","+time+","+dubbYN+","+language);
 * System.out.println } }
 */


/*public class Test {
	public static void main(String[] args) {
		String s1="123"+"456";
		System.out.println(s1);
		String s2="123"+456;
		System.out.println(s2);
		String s3=123+"456";
		System.out.println(s3);
		String s4=""+123+456;
		System.out.println(s4);
		
		String s5=123+456+""; // 덧셈
		System.out.println(s5);
		String s6=""+(123+456); // 덧셈
		System.out.println(s6);
	}
}*/

/*public class Test {
	public static void main(String[] args) {
		int n=14;
		int m=5;
		System.out.println( n/m ); // 몫 출력
		System.out.println( n%m ); // 나머지 출력
	}
}*/

//public class Test {
//	public static void main(String[] args) {
//		int n=1918785932;
//		int k=4;
//		
//		int a = 10^k-2;
//		int b = n%a;
//		System.out.println(b);
//		
//		
//		//
//		
//		
//		int v = 1;
//		for (int i=0; i < k-1; i++) {
//			v*=10;
//		} // n을 10의 k-1승으로 나눈 몫을 구한다
//		System.out.println(n/v);
//		System.out.println((n/v)%10);
//		
//			
//	}
//}
//

//public class Test {
//	public static void main(String[] args) {
//		int n[]={77,88,99};
//		String v="";
//		for (int i = 0; i < n.length; i++) {
//			if (i>0) {
//				v += ", "; // v 에 , 더한값 v에넣기
//			}
//			v += n[i]; // v에 n의[ㅑ]번쨰 배열 값 붙이기
//		}
//		System.out.println("["+v+"]");
//	}
//}

//public class Test {
//	public static void main (String[] args) {
//		Random random=new Random();
//		for (int i = 0; i < 20; i++) {
//			System.out.println(1+random.nextInt);
//		}
//	}
//}


// 자바기초, 배열 실습문제 14번 주사위 20번 던지기

//public class Test {
//	public static void main(String[] args) {
//		String result = "";
//		Random random=new Random();
//		for (int i = 0; i < 20; i++) {
//			int v=random.nextInt(6);
//			while (v==0) {
//				v=random.nextInt(6);
//			}
////			System.out.println(v+" "); // 붙지않고 \n 한다음에 나옴
//			result += v+" ";
//		}
//		System.out.println(result);
//	}
//}


// 6천번던지기후 각 눈값 나온 횟수 표시

//public class Test {
//	public static void main(String[] args) {
//		
//		Random random=new Random();
//		int count[] =new int[6]; // count 에 1의 눈이 출현한 횟수 저장
//		
//		for (int i = 0; i < 20; i++) {
//			int v=random.nextInt(6);
//			for (int i = 0; i < 20; i++) {
////			System.out.println(v+" "); // 붙지않고 \n 한다음에 나옴
//			result += v+" ";
//		}
//		System.out.println(result);
//	}
//}

//public class Test {
//	public static void main(String[] args) {
//		int n[]={5,7,9,1,3,5,8,2,4,9};
//		Arrays.sort(n);
//		System.out.println(Arrays.toString(n));
//	}
//}

//public class Test {
//	public static void main(String[] args) {
//		int n[]={5,7,9,1,3,5,8,2,4,9};
//		String a = "";
//		Arrays.sort(n);
//		for (int i = n.length-1; i >= 0; i--) {
//			a += (n[i]+ " ");
//		}
//		System.out.println(a);
//	}
//}


// 실습문제 22번

//public class Test {
//	public static void main(String[] args) {
//		int n[]= {5,7,9,1,3,5,8,2,4,9};
//		Arrays.sort(n);
//		System.out.println(Arrays.toString(n));
//		for (int i = 0; i < n.length/2; i++) {
//			int temp=n[i];
//			n[i]=n[n.length-1-i];
//			n[n.length-1-i]=temp;
//		}
//		System.out.println(Arrays.toString(n));
//	}
//}

// 실습문제 23번

//public class Test {
//	public static void main(String[] args) {
//		int n[]= {7,8,3,5,6,9};
//
//		// 정렬 방식 : O(nlogn)
//		Arrays.sort(n); //O(nlogn)
//		System.out.println(n[n.length-2]);
//
//		//방법2
//		int firstMax=Integer.MIN_VALUE;
//		int secondMax=Integer.MIN_VALUE;
//		for (int i = 0; i < n.length; i++) {
//			if(n[i]>firstMax) {
//				firstMax=n[i];
//			}		
//		}
//
//		for (int i = 0; i < n.length; i++) {
//			if (n[i]==firstMax) {
//				continue;
//			}
//			if (n[i]>secondMax) {
//				secondMax=n[i];
//			}		
//		}
//		System.out.println(secondMax);
//	}	
//}

//public class Test {
//	public static void main(String[] args) {
//		int n[]= {2,4,6,1,3,5,8,9}; // 배열 크기 짝수
//		// int n[]= {2,4,6,1,3,5,8,9,1}; // 배열 크기 홀수
//		
//		Arrays.sort(n);
//		if (n.length%2==1) {
//			System.out.println(n[n.length/2]);
//		}
//		else {
//			System.out.println((n[n.length/2-1]+n[n.length/2])/2.0);
//		}
//			
//		
//	}
//}

//public class Test {
//	public static void main(String[] args) {
//		Node head=null;
//		Node n1=new Node(1);
//		Node n2=new Node(2);
//		Node n3=new Node(3);
//		head=n1;
//		n1.next=n2;
//		n2.next=n3;
//		
//		for (Node p=head; p != null; p=p.next) System.out.print(p.data+"->");
//		
//		
//		
//	}
//}
//

//public class Test {
//	public static void main(String[] args) {
//		Node head=null;
//		Node n1=new Node(1);
//		Node n2=new Node(2);
//		Node n3=new Node(3);
//		head=n1;
//		n1.next=n2;
//		n2.next=n3;
//		for (Node p=head; p != null; p=p.next) System.out.print(p.data+"->");
//	}
//}

//public class Test {
//	public static void main(String[] args) {
//		int list[]=new int[1000000];
//		Random random=new Random();
//		for (int i = 0; i < list.length; i++) list[i]=random.nextInt(1000000);
//		int key=12345;
//		
//		int i=0;
//		for (; i < list.length; i++) { // 배열리스트 탐색 O(n)
//			if(list[i]==key) break;
//		}
//		if(i==list.length) 
//			System.out.println(-1);
//		else
//			System.out.println(i+"=>"+list[i]);
//		
//		// 균형탐색트리 O(log(n)) n= 10^6~2^20
//		// 해시테이블 O(1)
//	}
//}

//public class Test {
//	public static void main(String[] args) {
//		LinkedList<Integer> list=new LinkedList<>();
//		for (int i = i; i<=10; i++) {
//			list.addLast(i);
//		}
//		System.out.println(list);
//		
//	}
//}

//public class Test {
//	public static void main(String[] args) {
//		String s="대한민국의 수도는 서울이다.";
//		LinkedList<Character> stack=new LinkedList<>();
//		
//		
//		
//	}
//}
//

//public class Test {
//	public static void main(String[] args) {
//		String s="대한민국의 수도는 서울이다.";
//		char stack[] = new char[s.length()];
//		int top = -1;
//		
//		for (int i = 0; i < s.length(); i++) {
//			stack[++top] = s.charAt(i); // push
//		}
//		while (top!=-1) {
//			System.out.println(stack[top--]);
//		}
//	}
//}

//public class Test {
//	public static void main(String[] args) {
//		int n[]={1,2,3,4};
//		System.out.println(Arrays.toString(n));
//		int m[]=Arrays.copyOf(n, n.length*2); // 배열 n과 값이 같으면서 2배 크기의 새 배열 반환
//		n=m;
//		System.out.println(Arrays.toString(n));
//		n=Arrays.copyOf(n, (int) (n.length*0.25)); // 배열 n과 값이 같으면서 1/4배 크기의 새 배열 반환
//		System.out.println(Arrays.toString(n));
//	}
//}

//public class Test {
//	public static void main(String[] args) {
//		int n[]={1,2,3,4};
//		System.out.println(Arrays.toString(n));
//		int m[]=arrayCopy(n, n.length*2); // 2배 확장
//		n=m;
//		System.out.println(Arrays.toString(n));
//		n=arrayCopy(n, (int) (n.length*0.25)); // 1/4로 축소
//		System.out.println(Arrays.toString(n));
//	}
//	private static int[] arrayCopy(int[] n, int newSize) {
//		int t[]=new int[newSize];
//		for (int i = 0; i < t.length; i++) t[i]=n[i];
//		return t;	
//		}
//}
//
//public class Test {
//	public static void main(String[] args) {
//		LinkedList<String> queue=new LinkedList<>();
//		queue.addLast("한국");
//		queue.addLast("미국");
//		queue.addLast("독일");
//		System.out.println("큐 전체 내용:"+queue);
//		
//	}
//}

//
//public class Test {
//	public static void main(String[] args) {
//		System.out.println(solvejosephusProblem(7,3));
//	}
//	private static int solvejosephusProblem(int n, int k) {
//		LinkedList<Integer> queue=new LinkedList<Integer>();
//		
//		for (int i = 1; i<=n; i++) {
//			queue.addLast(i);
//		}
//		while (queue.size()>1){
//			for (int i = 0; i< k-1; i++) {
//				queue.addLast(queue.removeFirst());
//			}
//			queue.removeFirst();
//		}
//		queue.removeFirst();
//	}
//	System.out.println();
//
//}


//public class Test {
//	public static void main(String[] args) {
//		int n[]= {7,2,8,4,1};
//		System.out.pirnltn( sum(n , n.length-1) );
//	}
//	private static int sum(int [] n, int i) { // 합(n[0,,i])
//		// 합(n[0..i])=합(n[0..i-1)+n[i]
//		if(i==0) return n[i]; // 
//		return sum(n, i-1)+n[i];
//	}
//}


//public class Test {
//	public static void main(String[] args) {
//		int n[]= {7,2,8,4,1};
//		System.out.println( sum(n , 0) );
//	}
//	private static int sum(int [] n, int i) { // 합(n[0,,i])
//		// 합(n[0..i])=합(n[0..i-1)+n[i]
//		if(i==n.length-1) return n[i]; // 
//		return n[i]+sum(n, i+1);
//	}
//}
//

//
//class Result {
//    public static int kruskals(int gNodes, List<Integer> gFrom, List<Integer> gTo, List<Integer> gWeight) {
//
//    }
//
//}
//
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] gNodesEdges = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int gNodes = Integer.parseInt(gNodesEdges[0]);
//        int gEdges = Integer.parseInt(gNodesEdges[1]);
//
//        List<Integer> gFrom = new ArrayList<>();
//        List<Integer> gTo = new ArrayList<>();
//        List<Integer> gWeight = new ArrayList<>();
//
//        IntStream.range(0, gEdges).forEach(i -> {
//            try {
//                String[] gFromToWeight = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//                gFrom.add(Integer.parseInt(gFromToWeight[0]));
//                gTo.add(Integer.parseInt(gFromToWeight[1]));
//                gWeight.add(Integer.parseInt(gFromToWeight[2]));
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
//
//        int res = Result.kruskals(gNodes, gFrom, gTo, gWeight);
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}
//


//public class Test {
//	public static void main(String[] args) {
//		TreeMap<String, Integer> map=new TreeMap<>();
//		map.put("Korea", 32); // <key, value>가 <"Korea", 32>인 자료 삽입
//		map.put("Japan", 50);
//		map.put("France", 10);
//		map.put("China", 16);
//		System.out.println(map);
//		map.put("Japan", 70); // key 값 "Japan"의 value를 70으로 변경
//		System.out.println(map);
//		map.remove("Japan"); // key 값 "Japan"에 해당하는 자료 삭제
//		System.out.println(map);
//		System.out.println(map.size()); // 트리 내 총 자료 개수 반환
//		System.out.println(map.containsKey("Korea")); // key "Korea" 존재 시 true 반환
//		System.out.println(map.containsKey("Germany")); // key "Germany" 부재 시 false 반환
//		System.out.println(map.get("Korea")); // key 값 "Korea"에 대응되는 value 반환
//		System.out.println(map.get("Germany")); // key 값 부재 시 null 반환
//		System.out.println("최소 key 값="+map.firstKey()); // 최소 key 값 반환
//		System.out.println("최대 key 값="+map.lastKey()); // 최대 key 값 반환
//		for (String key : map.keySet()) { // 키 값들에 대한 오름차순 순회
//			System.out.println(key+"=>"+map.get(key));
//		}
//	}
//}
//
//public class Test {
//	public static void main (String[] args) {
//		
//	}
//}
//

//public class Test {
//	public static void main(String[] args) {
//		SimpleLinearProbingHashTable ht = new SimpleLinearProbingHashTable(1000);
//		System.out.println(ht.add("Korea"));
//		System.out.println(ht.add("Korea"));
//		System.out.println(ht.add("Japan"));
//		System.out.println(ht.contains("Korea"));
//		System.out.println(ht.contains("Japan"));
//		System.out.println(ht.contains("China"));
//	}
//}
//
////Reference: http://opendatastructures.org/versions/edition-0.1e/ods-java/5_2_LinearHashTable_Linear_.html, CC-BY-2.5-CA
////Reference: https://algs4.cs.princeton.edu/code/edu/princeton/cs/algs4/LinearProbingHashST.java.html, GPLv3
//public class SimpleLinearProbingHashTable {
//	private int HashTableSize;	
//	Object hashTable[];
//
//	public SimpleLinearProbingHashTable(int size) {
//		HashTableSize = size;
//		hashTable = new Object[HashTableSize];
//	}
//
//	public boolean add(Object key) {
//		int index = hash(key); // 삽입할 key 값을 해쉬테이블 인덱스로 변환
//		while (hashTable[index] != null) { // 현재 버켓이 사용 중이라면
//			if (hashTable[index].equals(key))
//				return false; // 삽입할 key 값 이미 존재
//			index = (index + 1) % HashTableSize; // 다음 버켓 인덱스 계산
//		}
//		hashTable[index] = key; // 빈 버켓에 key 값 삽입
//		return true; // 삽입 성공
//	}
//
//	private int hash(Object key) {
//		return (key.hashCode() & 0x7FFFFFFF) % HashTableSize;
//	}
//
//	public boolean contains(Object key) {
//		int index = hash(key); // 탐색 key 값을 해쉬테이블 인덱스로 변환
//		while (hashTable[index] != null) { // 현재 버켓이 사용 중이라면
//			if (hashTable[index].equals(key))
//				return true; // 탐색 key 값 발견
//			index = (index + 1) % HashTableSize; // 다음 버켓 인덱스 계산
//		}
//		return false; // 탐색 key 값이 존재하지 않음
//	}	
//}

//public class Test {
//	public static void main(String[] args) {
//		int n[] = { 50, 20, 70, 10, 30, 5, 15, 25, 60, 90, 62, 65, 64, 35 };
//		HashSet<Integer> set = new HashSet<>();
//		for (int i = 0; i < n.length; i++)
//			set.add(n[i]); // 해시테이블에 자료 삽입
//		System.out.println(set);
//		System.out.println(set.size()); // 해시테이블 내 총 자료 개수 반환
//		set.remove(20); // key 값 20 삭제
//		System.out.println(set);
//		System.out.println(set.contains(30)); // key 값 30이 존재하는 경우 true 반환
//		System.out.println(set.contains(33)); // key 값 33이 존재하지 않는 경우 false 반환
//		for (Integer key : set) {
//			System.out.print(key + " ");
//		}
//	}
//}


//public class Test {
//	public static void main(String[] args) {
//		HashMap<String, Integer> map = new HashMap<>();
//		map.put("Korea", 32); // <key, value>가 <"Korea", 32>인 자료 삽입
//		map.put("Japan", 50);
//		map.put("France", 10);
//		map.put("Mexico", 30);
//		map.put("China", 16);
//		System.out.println(map);
//		map.put("Japan", 70); // key 값 "Japan"의 value를 70으로 변경
//		System.out.println(map);
//		map.remove("Japan"); // key 값 "Japan"에 해당하는 자료 삭제
//		System.out.println(map);
//		System.out.println(map.size()); // 해시테이블 내 총 자료 개수 반환
//		System.out.println(map.containsKey("Korea")); // key "Korea" 존재 시 true 반환
//		System.out.println(map.containsKey("Germany")); // key "Germany" 부재 시 false 반환
//		System.out.println(map.get("Korea")); // key 값 "Korea"에 대응되는 value 반환
//		System.out.println(map.get("Germany")); // key 값 부재 시 null 반환
//		for (String key : map.keySet()) {
//			System.out.println(key + "=>" + map.get(key));
//		}
//	}
//}

public class Test {
	public static void main(String[] args) {
		SimpleLinearProbingHashTable ht = new SimpleLinearProbingHashTable(1000);
		System.out.println(ht.add("Korea"));
		System.out.println(ht.add("Korea"));
		System.out.println(ht.add("Japan"));
		System.out.println(ht.contains("Korea"));
		System.out.println(ht.contains("Japan"));
		System.out.println(ht.contains("China"));
	}
}

//Reference: http://opendatastructures.org/versions/edition-0.1e/ods-java/5_2_LinearHashTable_Linear_.html, CC-BY-2.5-CA
//Reference: https://algs4.cs.princeton.edu/code/edu/princeton/cs/algs4/LinearProbingHashST.java.html, GPLv3
public class SimpleLinearProbingHashTable {
	private int HashTableSize;
	Object hashTable[];

	public SimpleLinearProbingHashTable(int size) {
		HashTableSize = size;
		hashTable = new Object[HashTableSize];
	}

	public boolean add(Object key) {
		int index = hash(key); // 삽입할 key 값을 해쉬테이블 인덱스로 변환
		while (hashTable[index] != null) { // 현재 버켓이 사용 중이라면
			if (hashTable[index].equals(key))
				return false; // 삽입할 key 값 이미 존재
			index = (index + 1) % HashTableSize; // 다음 버켓 인덱스 계산
		}
		hashTable[index] = key; // 빈 버켓에 key 값 삽입
		return true; // 삽입 성공
	}

	private int hash(Object key) {
		return (key.hashCode() & 0x7FFFFFFF) % HashTableSize;
	}

	public boolean contains(Object key) {
		int index = hash(key); // 탐색 key 값을 해쉬테이블 인덱스로 변환
		while (hashTable[index] != null) { // 현재 버켓이 사용 중이라면
			if (hashTable[index].equals(key))
				return true; // 탐색 key 값 발견
			index = (index + 1) % HashTableSize; // 다음 버켓 인덱스 계산
		}
		return false; // 탐색 key 값이 존재하지 않음
	}
}
