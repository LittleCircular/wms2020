package p1.day06;

import java.util.Scanner;

public class SToI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个数字：");
		String s = sc.next();
		char[] arr = s.toCharArray();
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			a = (arr[i] - '0') + a*10;
//			System.out.println(arr[i] - '0');
		}
		System.out.println(a);
		sc.close();
	}

}
