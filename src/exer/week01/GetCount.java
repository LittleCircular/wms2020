package exer.week01;

import java.util.Scanner;

public class GetCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������һ����������");
		int x = sc.nextInt();
		int[] arr = new int[10];
		for (;;) {
			int a = x % 10;//ȡ�����һλ;
			arr[a]++;
			x = x / 10; // ����������һλ;
			if( x == 0) break;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				System.out.println("����" + i + "������" + arr[i] + "��" );
			}
		}
		sc.close();
	}

}
