package p1.day07;

public class Cat extends Animal{

	@Override//ȷ����һ�������� ��д�ķ���
	public Number shout(){//������д
		System.out.println("miao...");
		return 1;
	}
	
	public void  test(){//�·�������Ϊ private �����޷��̳У���������д
		System.out.println("public test Cat");
	}
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.shout();
		cat.test();
	}

}
