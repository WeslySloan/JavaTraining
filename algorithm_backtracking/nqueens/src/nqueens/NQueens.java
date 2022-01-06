package nqueens;

public class NQueens {
	int n;
	int col[];
	
	public NQueens(int n) {
		this.n = n;
		col = new int[n + 1];
	}
	
	public boolean promissing(int i) {
		for (int k = 1; k < i; k++) {
			if ((col[i] == col[k]) || Math.abs(i - k) == Math.abs(col[i] - col[k])) {
				return false;
			}
		}
		return true;
	}
	
	public void nqueens(int i) {
		if (promissing(i)) {
			if (i == n) {
				for (int c = 1; c < n+1; c++) {
					for (int x = 1; x < n+1; x++) {
						if (col[c] == x) {
							System.out.print(" Q |");
						} else {
							System.out.print("   |");
						}
					}
					System.out.println();
				}
//				System.exit(-1);
				System.out.println("======================");
				
			} else {
				for (int j = 1; j < n+1; j++) {
					col[i+1] = j;
					nqueens(i + 1);
				}
			}
		}
	}
	
	public void go() {
		nqueens(0);
	}
}
