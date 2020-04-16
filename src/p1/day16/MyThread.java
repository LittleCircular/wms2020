package p1.day16;

public class MyThread extends Thread{
	
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(this.getName() + ":" + i);
		}
	}
	
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();//通知JVM启动一个新线程
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}//
	}
}
