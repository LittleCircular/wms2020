package p1.day08.model;

public abstract class Account {//�˻���

	private double money = 1000;//�˻����

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	
	public abstract double getLi();//��ͬ���˻� ��Ϣ�ļ��㷽����ͬ�� ���� ����
	
}
