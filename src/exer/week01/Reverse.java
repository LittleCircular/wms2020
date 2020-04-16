package exer.week01;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个正整数：");
		int x = sc.nextInt();
		int num = 0;
		for(;;) {
			int a = x % 10; // 取最后一位(个位)
			num += a; // (num = num + a)把最后一位接到num最后
			x /= 10 ; // (x = x / 10)把整个数将一位
			if(x == 0) break;
			num *= 10 ;// (num = num * 10)在num后面补一个0(把num升一位);
		}
		System.out.println(num);
		sc.close();
	}

}
