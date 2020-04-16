package p1.day16;

public class MyRunnable implements Runnable{
	
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		Thread t = new Thread(mr);
		t.start();
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}
