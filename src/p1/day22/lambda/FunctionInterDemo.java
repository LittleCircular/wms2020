package p1.day22.lambda;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class FunctionInterDemo {

	public static void main(String[] args) {
		/**
		 * 断言原型
		 */
		Predicate<Student> pre1 = new Predicate<Student>(){
			@Override
			public boolean test(Student stu) {
				return stu.getAge()>=18?true:false;
			}
		};
		System.out.println(pre1.test(new Student("11",19)));
		System.out.println("断言型原型   V/S 断言型lambda表达式");
		//断言型：给一个东西返回boolean
		/**
		 * 断言型lambda表达式
		 */
		Predicate<Student> pre = stu -> stu.getAge()>=18?true:false;
		System.out.println(pre.test(new Student("1",18)));
		System.out.println("==================================================");
		/**
		 * 消费原型
		 */
		Consumer<Student> cons1 = new Consumer<Student>(){
			public void accept(Student stu) {
				String str = "info";
				System.out.println(str+"-->"+stu);
			};
		};
		cons1.accept(new Student("21",29));
		System.out.println("消费型原型   V/S 消费型lambda表达式");
		//消费型：给参数，无返回
		/**
		 * 消费型lambda表达式
		 */
		Consumer<Student> cons = stu -> System.out.println(stu);
		cons.accept(new Student("2",28));
		System.out.println("消费型lambda表达式  V/S 消费型方法引用");
		/**
		 * 消费型方法引用
		 */
		Consumer<Student> cons2 = System.out :: println;
		cons2.accept(new Student("22",228));
		System.out.println("==================================================");
		/**
		 * 函数原型
		 */
		Function<Student,String> fun1 = new Function<Student,String>(){
			public String apply(Student stu) {
				return "name:"+stu.getName()+",age:"+stu.getAge();
			};
		};
		System.out.println(fun1.apply(new Student("31",30)));
		System.out.println("函数型原型   V/S 函数型lambda表达式");
		//函数型：给参数，返回
		/**
		 * 函数型lambda表达式
		 */
		Function<Student,String> fun = stu -> "name:"+stu.getName()+",age:"+stu.getAge();
		System.out.println(fun.apply(new Student("3",20)));
		System.out.println("==================================================");
		/**
		 * 供给原型
		 */
		Supplier<Integer> sup1 = new Supplier<Integer>(){
			public Integer get() {
				return new Random().nextInt(100) + 1;
			};
		};
		System.out.println(sup1.get());
		System.out.println("供给型原型   V/S 供给型lambda表达式");
		//返回随机数
		//供给型：不给参数，有返回值
		/**
		 * 供给型lambda表达式
		 */
		Supplier<Integer> sup = () -> new Random().nextInt(100) + 1;
		System.out.println(sup.get());
	}

}
