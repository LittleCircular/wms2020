package p1.day04.task.a1;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ѧ��������:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		String[] srr = new String[n];
		int a = 0;
		for (; n > 0; n--) {
			System.out.println("������ѧ���������Ϳ��Գɼ�:");
			String next = sc.next();
			int nextInt = sc.nextInt();

			arr[a] = nextInt;
			srr[a] = next;
			a++;

		}
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			num = arr[i] + num;
		}
		double ave = num / arr.length;
		a = 0;
		int max = arr[0];
		for (int j = 0; j < arr.length; j++) {
			if(max <= arr[a]) max = arr[a];
			a++;
		}
		a = 0;
		int min = arr[0];
		for (int j = 0; j < arr.length; j++) {
			if(min >= arr[a]) min = arr[a];
			a++;
		}
		System.out.println("�ܷ�:" + num);
		System.out.println("ƽ����:" + ave);
		System.out.println(srr[1] + "��߷�:" + max);	
		System.out.println(srr[1] + "��ͷ�:" + min);	
		sc.close();
	}

}
