package p1.day22.lambda;
public class LambdaImplDemo{
    
	public static void main(String[] args) {
		
		/**
		 * ԭ��
		 */
//		MyInterfaceI myinter = new MyInterfaceI(){
//			@Override
//			public void method(String username) {
//				System.out.println(username);
//			}
//		};
		/**
		 * Lambda���ʽ
		 */
//		MyInterfaceI myinter = name -> System.out.println(name);
		/**
		 * ��������
		 */
		MyInterfaceI myinter = System.out :: println;
		myinter.method("a leng");
		
		/**
		 * Lambda���ʽ���ʣ�����һ��static����������һ��ʵ����
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