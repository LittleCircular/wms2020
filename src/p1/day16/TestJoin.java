package p1.day16;

public class TestJoin {

	public static void main(String[] args) {
		MyThread mt1 = new MyThread();
		MyThread mt2 = new MyThread();
		MyThread mt3 = new MyThread();
		mt1.start(); mt2.start(); mt3.start();
		try {
			mt1.join();
			mt2.join();
			mt3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Over");//���Ҫ�������߳̽������صĽ������xx.join()����xx�������õ��������ִ��
	}

}
