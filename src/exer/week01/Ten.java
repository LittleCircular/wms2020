package exer.week01;

import java.util.Random;
import java.util.Scanner;

public class Ten {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int x = 0;
		for(;;) {
			System.out.print("������ǿ���ɹ��ʣ�");
			x = sc.nextInt();
			if(0 <= x || x <= 100) {
				break;
			}else {
				System.out.print("�������");
			}
		}
		for(int i = 0 ; i < 10 ; i++) {
			int nextInt = ran.nextInt(101);
//			System.out.println(nextInt);
			if( nextInt <= x) {
				System.out.println("��" + (i + 1) + "��ǿ���ɹ���");
			}else {
				System.out.println("��" + (i + 1) + "��ǿ��ʧ�ܣ�");
			}
		}
		sc.close();
	}

}
