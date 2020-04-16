package p1.day10;

import java.util.Scanner;

public class TestStudent {

	 Student[] stu;
	
	public void fun(){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学生人数！");
		int x = sc.nextInt();
		stu = new Student[x];
		for(int i = 0; i < stu.length; i++) {
			System.out.println("请输入学生信息(学号,姓名,年龄)：");
			String s = sc.next();
			stu[i] = new Student();
			String[] s1 = s.split(",");
//			stu[i].setId(s1[0]);
			stu[i].setName(s1[1]);
//			stu[i].setAge(s1[2]);
		}
		for (int i = 0; i < stu.length; i++) {
			System.out.println(stu[i]);
		}
		int num = 0;
		for (int j = 0; j < stu.length; j++) {
//			num += Integer.parseInt(stu[j].getAge());
		}
		System.out.println("平均年龄：" + (1.0 * num/x));
		sc.close();
	}
	
	public static void main(String[] args) {
		TestStudent t = new TestStudent();
		t.fun();
	}

}
