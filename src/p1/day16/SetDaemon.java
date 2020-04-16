package p1.day16;

public class SetDaemon extends Thread{
	
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.println(this.getName() + ":" + i);
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		SetDaemon sd = new SetDaemon();
		sd.setDaemon(true);//设置为守护线程
		sd.start();
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
