package p1.day11.employee;

import java.util.Scanner;

public class TestView {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int s ;
//		for (;;) {
//			s = sc.nextInt();
//			if(s == 2) break;
//		}
		Employee e = new Employee("s1", "zhansan", 7000.0, "2019-11-9", "13912345678");
		Employee.list.add(e);
		View v = new View();
		v.menu();
		sc.close();
	}

}
