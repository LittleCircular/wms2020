package exer.week01;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������һ����������");
		int x = sc.nextInt();
		int num = 0;
		for(;;) {
			int a = x % 10; // ȡ���һλ(��λ)
			num += a; // (num = num + a)�����һλ�ӵ�num���
			x /= 10 ; // (x = x / 10)����������һλ
			if(x == 0) break;
			num *= 10 ;// (num = num * 10)��num���油һ��0(��num��һλ);
		}
		System.out.println(num);
		sc.close();
	}

}
