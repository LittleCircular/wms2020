package p1.day16;

public class Test {
	
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		Thread th1 = new Thread(a);
		Thread th2 = new Thread(b);
		th1.start();th2.start();
		
	}

}
class A extends Thread{
	public void run() {
		synchronized (A.class) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("AµÈBËø");
			synchronized (B.class) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("A");
			}
		}
	}
}
class B extends Thread{
	public void run() {
		synchronized (B.class) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("BµÈAËø");
			synchronized (A.class) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("B");
			}
		}
	}
}