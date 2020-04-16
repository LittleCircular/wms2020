package p1.day10;

public class TestInteger {

	public static void main(String[] args) {
		Integer in1 = 1000;// -128 127 之间去池中拿，不在这个范围的new
		Integer in2 = 1000;
		Integer in3 = new Integer(1000);
		Integer in4 = new Integer(1000);
		int x = 1000;
		System.out.println(in1 == in2);       //t f
		System.out.println(in1.equals(in2));  //t
		System.out.println(in3 == in4);       //f
		System.out.println(in3.equals(in4));  //t
		System.out.println(in1 == x);         //t 自动拆箱
		System.out.println(in3 == x);         //t
		System.out.println(x == in3);         //t
		int y = Integer.parseInt("123");      //Integer最常用的方法
		System.out.println(y);
	}

}
