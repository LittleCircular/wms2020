package p1.day08;

public abstract class AbstractCla {

	int x = 10;
	
	public AbstractCla(){
		System.out.println("��");
	}
	
	public void test(){
		System.out.println("a test");
	}
	public abstract void abstractTest();//���󷽷�
	
	public static void main(String[] args) {
//		AbstractCla ac = new AbstractCla();  //������ ���� new ʵ����
		AbstractCla ac = new Cla();//������ һ��ָ��ǳ��������(��̬)
		ac.test();
		ac.abstractTest();
	}

}
