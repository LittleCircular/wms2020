package p1.day07;

public class StaticField {
	
	int x = 1 ;//��static�����ԣ�ÿ���������Լ���һ��
	static int y = 1;//static�����ԣ����ж��� ���� һ��(ֻ��һ��)
	
	public StaticField(){
		x++;
		y++;
	}
	
	public static void test(){
//		System.out.println(x);//��̬�������ܵ��� �Ǿ�̬��Ա
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		StaticField sf1 = new StaticField();
		StaticField sf2 = new StaticField();
		System.out.println("sf1.x = " + sf1.x + ",sf1.y = " + sf1.y);//2 3
		System.out.println("sf2.x = " + sf2.x + ",sf2.y = " + sf2.y);//2 3
		System.out.println("sf2.x = " + sf2.x + ",sf2.y = " + StaticField.y);//2 3
		
		StaticField.test();
	}

}
