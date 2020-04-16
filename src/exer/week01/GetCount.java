package exer.week01;

import java.util.Scanner;

public class GetCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个正整数：");
		int x = sc.nextInt();
		int[] arr = new int[10];
		for (;;) {
			int a = x % 10;//取出最后一位;
			arr[a]++;
			x = x / 10; // 把整个数降一位;
			if( x == 0) break;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				System.out.println("数字" + i + "出现了" + arr[i] + "次" );
			}
		}
		sc.close();
	}

}
