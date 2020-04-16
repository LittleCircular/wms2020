package p1.day08;

public abstract class AbstractCla {

	int x = 10;
	
	public AbstractCla(){
		System.out.println("抽");
	}
	
	public void test(){
		System.out.println("a test");
	}
	public abstract void abstractTest();//抽象方法
	
	public static void main(String[] args) {
//		AbstractCla ac = new AbstractCla();  //抽象类 不能 new 实例化
		AbstractCla ac = new Cla();//抽象类 一定指向非抽象的子类(多态)
		ac.test();
		ac.abstractTest();
	}

}
