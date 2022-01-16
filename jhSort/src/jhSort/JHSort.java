package jhSort;

public class JHSort {
	
	public void sort(int[] S) {
		int n = S.length;
		int min = 99;
		int index = 0;
		
		for (int i = 0; i < n; i++) {
			min = 99;
			for (int j = i; j < n; j++) {
				if (S[j] < min) {
					min = S[j];
					index = j;
				}
			}
			
			// S[i]와 S[index]를 교환
			int temp = S[i];
			S[i] = S[index];
			S[index] = temp;
		}
		
		// S[]를 출력
		for (int i = 0; i < n; i++) {
			System.out.println(S[i]);
		}
	}

}
