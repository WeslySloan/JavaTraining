import java.util.Arrays;
import java.util.Random;


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

public class Test {
	public static void main(String[] args) {
		Node head=null;
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		head=n1;
		n1.next=n2;
		n2.next=n3;
		for (Node p=head; p != null; p=p.next) System.out.print(p.data+"->");
	}
}


