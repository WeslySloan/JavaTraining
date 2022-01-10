package mergeSort;

public class MergeSort {
	private int[] numbers = null;
	private int[] temp = null;
	private int n = 0;
	
	public MergeSort(int n) {
		this.n = n;
		numbers = new int[n];
		temp = new int[n];
		
		for (int i = 0; i < n; i++) {
			numbers[i] = (int) (Math.random() * 100);
		}
		
		for (int i = 0; i < n; i++) {
			System.out.print(numbers[i] + ", ");
		}		
	}
	
	public void mergeSort(int start, int end) {
		if (start < end) {
			int mid = (int) ((start + end) / 2);
			
			mergeSort(start, mid);
			mergeSort(mid + 1, end);
			
			int left = start;
			int right = mid + 1;
			int tempIndex = start;
			
			while ((left <= mid) && (right <= end)) {
				if (numbers[left] < numbers[right]) {
					temp[tempIndex++] = numbers[left++];
				} else {
					temp[tempIndex++] = numbers[right++];
				}
			}
			
			if (left > mid) {
				while (right <= end) {
					temp[tempIndex++] = numbers[right++];					
				}	
			} else if (right > end) {
				while (left <= mid) {
					temp[tempIndex++] = numbers[left++];					
				}				
			}
			
			for (int i = start; i <= end; i++) {
				numbers[i] = temp[i];
			}
		}
	}
	
	public void sort() {
		mergeSort(0, n - 1);
		
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print(numbers[i] + ", ");
		}
	}
}












