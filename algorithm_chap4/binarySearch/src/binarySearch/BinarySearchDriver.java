package binarySearch;

public class BinarySearchDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] S = {2, 4, 5, 6, 7, 8, 9, 10};
		int n = 8;
		int x = 4;
		
		BinarySearch binarySearch = new BinarySearch(S, n, x);
		int index = binarySearch.search(0, n-1);
		System.out.println(index);
	}

}
