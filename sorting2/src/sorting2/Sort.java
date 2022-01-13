package sorting2;

public class Sort {
	
	public void sort(int[] S, int n) {
		for (int i = 0; i < n; i++) {
			int min = 99;
			int index = 0; 
			for (int j = i; j < n; j++) {
				if (min > S[j]) {
					index = j;
					min = S[j];
				}
			}
			int temp = S[index];
			S[index] = S[i];
			S[i] = temp;
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(S[i]);
		}
	}

}
