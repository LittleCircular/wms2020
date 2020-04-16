package p1.day07;

public class StaticField {
	
	int x = 1 ;//非static的属性，每个对象都有自己的一个
	static int y = 1;//static的属性，所有对象 共享 一个(只有一个)
	
	public StaticField(){
		x++;
		y++;
	}
	
	public static void test(){
//		System.out.println(x);//静态方法不能调用 非静态成员
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
