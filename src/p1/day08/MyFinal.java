package p1.day08;

public class MyFinal {

	final int x = 1; //直接赋值
	final int y;     //在所有的构造方法中赋值
	private final int z;
	static final int K = 1;//static final 修饰的才是常量，只能在声明的同时赋值(static语句块)
	
	{
		z = 10;//在语句块中赋值
	}
	
	public MyFinal(){
		y = 1;
	}
	public MyFinal(int y){
		this.y = y;
	}
	
	public int getZ(){
		return z;
	}
//	public void setZ(){//final的属性如果封装，只有get方法，没有set方法
//		this.z = z;
//	}
	public final void test(){
		System.out.println("test");
	}
	
	
	
	public static void main(String[] args) {
		MyFinal mf1 = new MyFinal(2);
		MyFinal mf2 = new MyFinal(5);
		System.out.println(mf1.y);//final修饰的属性不是常量
		System.out.println(mf2.y);
//		MyFinal.K = 10;
	}

}
