import java.util.Arrays;
import java.util.Random;


// 5.6��
//public class Test {
//	public static void main(String[] args) {
//		int v[]=new int[100000000]; // n=1��
//		Random random=new Random();
//		for (int i = 0; i < v.length; i++) v[i]=random.nextInt(Integer.MAX_VALUE);
//		long start=System.currentTimeMillis();
//		Arrays.sort(v);
//		System.out.println(v[v.length-1]);
//		System.out.println((System.currentTimeMillis()-start)+" �и���"); 
//	}
//}


//0.026��
//public class Test {
//	public static void main(String[] args) {
//		int v[]=new int[100000000]; // n=1��
//		Random random=new Random();
//		for (int i = 0; i < v.length; i++) v[i]=random.nextInt(Integer.MAX_VALUE);
//		long start=System.currentTimeMillis();
//		int max=v[0];
//		for (int i = 0; i < v.length; i++) if(v[i]>max) max=v[i];
//		System.out.println(max);
//		System.out.println((System.currentTimeMillis()-start)+" �и���");
//	}
//}

public class Test {
	public static void main(String[] args) {
		System.out.println( 7 / 2 ); // �̰Ÿ� 3 �Ʒ� ������ ���� 3.5��
		System.out.println( 7.0 / 2.0 ); 
		System.out.println( 7.0 / 2 );
		System.out.println( 7 / 2.0 ); // �̷��� �ϳ��� 0.�������� ǥ��Ǹ� 3.5�ε�
		System.out.println( (double)7 / (double)2 );
		System.out.println( (double)7 / 2 );
		System.out.println( 7 / (double)2 );
	}
}