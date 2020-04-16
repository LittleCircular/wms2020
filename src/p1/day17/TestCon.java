package p1.day17;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestCon {

	public static void main(String[] args) {
		MyCallable<String> mc = new MyCallable<String>("ok");//����һ��Callable����
		ExecutorService es = Executors.newFixedThreadPool(3);//����һ���̶������̵߳��̳߳�
		Future<String> f = es.submit(mc);//��Callable����Ž��̳߳أ�����һ��Future����
		for (int i = 0; i < 300; i++) {
			System.out.println("main:" + i);
		}
		try {
			Thread.sleep(1000);
			System.out.println(f.get());//Future����get()�õ��߳�ִ��(�߳�ִ�е���Callable)�Ľ��
		} catch (Exception e) {
			e.printStackTrace();
		}
		es.shutdown();
	}

}
