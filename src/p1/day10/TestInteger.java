package p1.day10;

public class TestInteger {

	public static void main(String[] args) {
		Integer in1 = 1000;// -128 127 ֮��ȥ�����ã����������Χ��new
		Integer in2 = 1000;
		Integer in3 = new Integer(1000);
		Integer in4 = new Integer(1000);
		int x = 1000;
		System.out.println(in1 == in2);       //t f
		System.out.println(in1.equals(in2));  //t
		System.out.println(in3 == in4);       //f
		System.out.println(in3.equals(in4));  //t
		System.out.println(in1 == x);         //t �Զ�����
		System.out.println(in3 == x);         //t
		System.out.println(x == in3);         //t
		int y = Integer.parseInt("123");      //Integer��õķ���
		System.out.println(y);
	}

}
