package p1.day22.lambda;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class FunctionInterDemo {

	public static void main(String[] args) {
		/**
		 * ����ԭ��
		 */
		Predicate<Student> pre1 = new Predicate<Student>(){
			@Override
			public boolean test(Student stu) {
				return stu.getAge()>=18?true:false;
			}
		};
		System.out.println(pre1.test(new Student("11",19)));
		System.out.println("������ԭ��   V/S ������lambda���ʽ");
		//�����ͣ���һ����������boolean
		/**
		 * ������lambda���ʽ
		 */
		Predicate<Student> pre = stu -> stu.getAge()>=18?true:false;
		System.out.println(pre.test(new Student("1",18)));
		System.out.println("==================================================");
		/**
		 * ����ԭ��
		 */
		Consumer<Student> cons1 = new Consumer<Student>(){
			public void accept(Student stu) {
				String str = "info";
				System.out.println(str+"-->"+stu);
			};
		};
		cons1.accept(new Student("21",29));
		System.out.println("������ԭ��   V/S ������lambda���ʽ");
		//�����ͣ����������޷���
		/**
		 * ������lambda���ʽ
		 */
		Consumer<Student> cons = stu -> System.out.println(stu);
		cons.accept(new Student("2",28));
		System.out.println("������lambda���ʽ  V/S �����ͷ�������");
		/**
		 * �����ͷ�������
		 */
		Consumer<Student> cons2 = System.out :: println;
		cons2.accept(new Student("22",228));
		System.out.println("==================================================");
		/**
		 * ����ԭ��
		 */
		Function<Student,String> fun1 = new Function<Student,String>(){
			public String apply(Student stu) {
				return "name:"+stu.getName()+",age:"+stu.getAge();
			};
		};
		System.out.println(fun1.apply(new Student("31",30)));
		System.out.println("������ԭ��   V/S ������lambda���ʽ");
		//�����ͣ�������������
		/**
		 * ������lambda���ʽ
		 */
		Function<Student,String> fun = stu -> "name:"+stu.getName()+",age:"+stu.getAge();
		System.out.println(fun.apply(new Student("3",20)));
		System.out.println("==================================================");
		/**
		 * ����ԭ��
		 */
		Supplier<Integer> sup1 = new Supplier<Integer>(){
			public Integer get() {
				return new Random().nextInt(100) + 1;
			};
		};
		System.out.println(sup1.get());
		System.out.println("������ԭ��   V/S ������lambda���ʽ");
		//���������
		//�����ͣ������������з���ֵ
		/**
		 * ������lambda���ʽ
		 */
		Supplier<Integer> sup = () -> new Random().nextInt(100) + 1;
		System.out.println(sup.get());
	}

}
