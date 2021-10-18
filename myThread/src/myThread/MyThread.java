package myThread;

public class MyThread implements Runnable {
	private int id = 0;
	
	public MyThread(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println(id + " : " + i);
		}
	}
}
