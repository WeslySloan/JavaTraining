package quickSort;

public class QuickSort {
	private int[] numbers = null;
	private int n = 0;
	
	public QuickSort(int n) {
		this.n = n;
		numbers = new int[n];
		
		for (int i = 0; i < n; i++) {
			numbers[i] = (int) (Math.random() * 100);
		}
		
		for (int i = 0; i < n; i++) {
			System.out.print(numbers[i] + ", ");
		}		
	}
	
	
	public int partition(int start, int end) {
		int pivot = numbers[start];
		int j = start;
		
		for (int i = start + 1; i <= end; i++) {
			if (numbers[i] < pivot) {
				j += 1;
				int temp = numbers[i];
				numbers[i] = numbers[j];
				numbers[j] = temp;
			}
		}
		
		int temp = numbers[start];
		numbers[start] = numbers[j];
		numbers[j] = temp;
		
		return j;
	}
	
	public void quickSort(int start, int end) {
		if (start < end) {
			int pivotIndex = 0;
			
			pivotIndex = partition(start, end);
			
			quickSort(start, pivotIndex - 1);
			quickSort(pivotIndex + 1, end);			
		}
	}
	
	public void sort() {
		quickSort(0, n - 1);
		
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print(numbers[i] + ", ");
		}	
	}
}
