package p1.day07;

public class TestStatic {
	static{//类加载是执行一次
		System.out.println("static语句块");
	}
	{//每创建一个对象都会执行一次 非静态语句块
		System.out.println("非static语句块");
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
