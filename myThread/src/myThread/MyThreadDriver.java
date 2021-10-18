package myThread;

public class MyThreadDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Thread thread = new Thread(new MyThread(0));
		thread.start();
		
		thread = new Thread(new MyThread(1));
		thread.start();
		
		thread = new Thread(new MyThread(2));
		thread.start();
		
		thread = new Thread(new MyThread(3));
		thread.start();
	}

}
