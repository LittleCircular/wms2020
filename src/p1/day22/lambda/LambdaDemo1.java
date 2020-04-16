package p1.day22.lambda;

import java.util.Date;

public class LambdaDemo1 {

	public static void main(String[] args) {
		
		new Thread(new Runnable(){
			@Override
			public void run() {
				System.out.println("time1:" + new Date());
			}
		}).start();
		
		new Thread(()->{System.out.println("time2:" + new Date());}).start();
		
	}
	
}
