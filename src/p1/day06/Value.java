package p1.day06;

public class Value {

	int x = 10;
	public void test(int a){
		a = a/2 ;
		System.out.println("a = " + a) ;
	}
	public void test2(Value val){
	//	val.x = 20;
	//	System.out.println("val.x = " + val.x);//20
		val = null;
	}
	
	public static void main(String[] args) {
		Value val = new Value();
		int x = 10;
		val.test(x); // 传递的其实不是x, 而是x的值，也就是10
		System.out.println("x = " + x);
		Value va = new Value();
		val.test2(va);
		System.out.println("va.x = " + va.x);//	20
		
	}

}
