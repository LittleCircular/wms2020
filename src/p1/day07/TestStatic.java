package p1.day07;

public class TestStatic {
	static{//�������ִ��һ��
		System.out.println("static����");
	}
	{//ÿ����һ�����󶼻�ִ��һ�� �Ǿ�̬����
		System.out.println("��static����");
	}
	public static void main(String[] args) {
		System.out.println("1");
		TestStatic ts;
		System.out.println("2");
		ts = new TestStatic();
		System.out.println("3");
		TestStatic ts2 = new TestStatic();
	}
}
