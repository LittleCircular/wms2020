package p1.day22.lambda;
public class LambdaImplDemo{
    
	public static void main(String[] args) {
		
		/**
		 * 原型
		 */
//		MyInterfaceI myinter = new MyInterfaceI(){
//			@Override
//			public void method(String username) {
//				System.out.println(username);
//			}
//		};
		/**
		 * Lambda表达式
		 */
//		MyInterfaceI myinter = name -> System.out.println(name);
		/**
		 * 方法引用
		 */
		MyInterfaceI myinter = System.out :: println;
		myinter.method("a leng");
		
		/**
		 * Lambda表达式本质，生成一个static方法，加了一个实现类
		 */
//		private static void lambda$0(java.lang.String);
//		final class LambdaImplDemo$$Lambda$1 implements MyInterfaceI{
//			private LambdaImplDemo$$Lambda$1();
//			public void method(java.lang.String);
//		}
		
	}
	
}
interface MyInterfaceI{
	void method(String username);
}