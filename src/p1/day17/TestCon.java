package p1.day17;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestCon {

	public static void main(String[] args) {
		MyCallable<String> mc = new MyCallable<String>("ok");//创建一个Callable对象
		ExecutorService es = Executors.newFixedThreadPool(3);//创建一个固定三个线程的线程池
		Future<String> f = es.submit(mc);//把Callable对象放进线程池，返回一个Future对象
		for (int i = 0; i < 300; i++) {
			System.out.println("main:" + i);
		}
		try {
			Thread.sleep(1000);
			System.out.println(f.get());//Future对象get()得到线程执行(线程执行的是Callable)的结果
		} catch (Exception e) {
			e.printStackTrace();
		}
		es.shutdown();
	}

}
