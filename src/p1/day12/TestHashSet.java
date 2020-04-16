package p1.day12;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		set.add(new Student(1,"zhangfei"));
		System.out.println("-------------");
		set.add(new Student(2,"guanyu"));
		System.out.println("-------------");
		set.add(new Student(3,"lvbu"));
		System.out.println("-------------");
		set.add(new Student(4,"machao"));
		System.out.println("-------------");
		set.add(new Student(1,"liubei"));
		for (Student student : set) {
			System.out.println(student);
		}
	}

}
