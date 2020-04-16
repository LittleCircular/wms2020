package p1.day17;

import java.util.concurrent.Callable;

public class MyCallable<V> implements Callable<V> {

	private V v;
	
	public MyCallable(V v) {
		this.v = v;
	}
	
	public V call() throws Exception{
		for (int i = 0; i < 300; i++) {
			System.out.println("call:" + i);
			Thread.sleep(1);
		}
		return v;
	}
	
}
