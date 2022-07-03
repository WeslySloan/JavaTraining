package binarySearch;

public class BinarySearch {
	int[] S;
	int n;
	int x;
	
	public BinarySearch(int[] S, int n, int x) {
		this.S = S;
		this.n = n;
		this.x = x;
	}
	
	public int search(int start, int end) {
		if (start > end) {
			return -1;
		} else {
			int mid = (int) ((start + end)/2);
			
			if (x == S[mid]) {
				return mid;
			} else if (x < S[mid]) {
				return search(start, mid - 1);
			} else if (x > S[mid]) {
				return search(mid + 1, end);
			}
		}
		return 99;
	}
}
