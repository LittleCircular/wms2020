package p1.day04.task;

import java.util.Scanner;

/**
 * 
 * 
 * @Title: Task4.java
 * @Package p1.day04.task
 * @Description: 
 * @author yuan zhigang  Email:3155799044@qq.com
 * @date 2019年11月28日 下午2:34:36
 * @version
 *
 */

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		for (; ; ) {
			System.out.print("请输入成绩:");
			a = sc.nextInt();
			if (a < 0 || a > 100) {
				System.out.print("输入错误!");
			}else {
				break;
			}
		}
//		int A = 0;
//		if (a >= 90) {
//			A = 1;
//		}else if(a >= 80){
//			A = 2;
//		}else if(a >= 70){
//			A = 3;
//		}else {
//			A = 4;
//		}
		switch ((a/10)) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("D");
			break;
		}
		sc.close();
	}

}
