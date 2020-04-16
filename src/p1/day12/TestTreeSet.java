package p1.day12;

import java.util.Comparator;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		//模块1，按id排序
//		TreeSet<Student> ts = new TreeSet<>();
//		ts.add(new Student(1,"zhangfei"));
//		ts.add(new Student(2,"guanyu"));
//		ts.add(new Student(3,"liubei"));
//		ts.add(new Student(4,"machao"));
//		ts.add(new Student(5,"weiyan"));
//		ts.add(new Student(6,"zhaoyun"));
//		ts.add(new Student(1,"lvbu"));
//		System.out.println(ts);
		//模块2，按name排序
		TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		ts.add(new Student(1,"zhangfei"));
		ts.add(new Student(2,"guanyu"));
		ts.add(new Student(3,"liubei"));
		ts.add(new Student(4,"machao"));
		ts.add(new Student(5,"weiyan"));
		ts.add(new Student(6,"zhaoyun"));
		ts.add(new Student(1,"lvbu"));
		System.out.println(ts);
	}

}
