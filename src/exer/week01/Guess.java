package exer.week01;

import java.util.Random;
import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int x = ran.nextInt(100) + 1;
//		System.out.println(x);
		for(;;){
			int y = 0;
			for(;;){
				System.out.print("������1-100������:");
				y = sc.nextInt();
				if(y <= 0 || y >100){
					System.out.print("�������");
				}else{
					break;
				}
			}
			if(y > x){
				System.out.println("�´��ˣ�");
			}else if (y < x) {
				System.out.println("��С�ˣ�");
			}else if (y == x) {
				System.out.println("�¶��ˣ�");
				break;
			}
		}
		sc.close();
	}

}
