package p1.day22.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LambdaDemo2 {

	public static void main(String[] args) {
		
		//1.使用匿名内部类
		ICheckUserInfo userinfo = new ICheckUserInfo() {
			
			@Override
			public String checkUserResult(String username) {
				if("root".equalsIgnoreCase(username)){
					return "超级管理员";
				}else if ("admin".equalsIgnoreCase(username)) {
					return "管理员";
				}else{
					return "普通会员";
				}
			}
		};
		System.out.println(userinfo.checkUserResult("root"));
		
		//2.lambda表达式实现
		ICheckUserInfo userinfo2 = username -> {
			if("root".equalsIgnoreCase(username)){
				return "超级管理员";
			}else if ("admin".equalsIgnoreCase(username)) {
				return "管理员";
			}else{
				return "普通会员";
			}
		};
		System.out.println(userinfo2.checkUserResult("123"));
		
		/**
		 * JDK中的函数式接口
		 * Runnable
		 * Comparable
		 * Comparator
		 * FileFilter
		 * ......
		 */
		/**
		 * 实现类
		 */
//		Set<Student> students = new TreeSet<>(new MyComparator());
//		students.addAll(Arrays.asList(
//				new Student("1",40),new Student("2",20),new Student("3",10),new Student("4",30)));
		/**
		 * 匿名内部类
		 */
//		Set<Student> students = new TreeSet<>(new Comparator<Student>(){
//			@Override
//			public int compare(Student o1, Student o2) {
//				return o1.getAge() - o2.getAge();
//			}
//		});
//		students.addAll(Arrays.asList(
//				new Student("1",40),new Student("2",20),new Student("3",10),new Student("4",30)));
		/**
		 * lambda表达式
		 */
		Set<Student> students = new TreeSet<>((a,b) -> a.getAge() - b.getAge());
		students.addAll(Arrays.asList(
				new Student("1",40),new Student("2",20),new Student("3",10),new Student("4",30)));
		/**
		 * forEach方法引用
		 */
		students.forEach(System.out :: println);
//		for (Student student : students) {
//			System.out.println(student);
//		}
	}
	
}

class MyComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getAge() - o2.getAge();
	}
	
}