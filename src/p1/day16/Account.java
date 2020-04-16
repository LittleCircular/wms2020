package p1.day16;

public class Account implements Runnable{

	private int money = 2000;
	
	@Override
	public void run() {
		synchronized (this) {
			int localMoney = money;
			localMoney = localMoney - 800;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			money = localMoney;
		}
	}
	
	public static void main(String[] args) {
		Account acc = new Account();
		Thread th1 = new Thread(acc);
		Thread th2 = new Thread(acc);
		th1.start(); th2.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(acc.money);
	}

}
