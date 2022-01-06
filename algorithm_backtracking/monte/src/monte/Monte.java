package monte;

public class Monte {
	
	public void go(int n) {
		double x = 0;
		double y = 0;
		int m = 0;
		
		for (int i = 0; i < n; i++) {
			x = Math.random();
			y = Math.random();
			
			if (Math.sqrt(x*x + y*y) < 1.0) {
				m++;
			}
		}
		
		System.out.print(4.0 * m / n);
	}
}
