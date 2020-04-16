package p1.day08.model;

public abstract class Account {//账户类

	private double money = 1000;//账户余额

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	
	public abstract double getLi();//不同的账户 利息的计算方法不同， 所以 抽象
	
}
