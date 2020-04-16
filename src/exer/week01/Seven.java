package exer.week01;

import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		for(;;) {
			System.out.print("«Î ‰»Î1-20£∫");
			x = sc.nextInt();
			if(x <=0 || x >20) {
				System.out.print(" ‰»Î¥ÌŒÛ£°");
			}else {
				break;
			}
		}
		for (int i = x; i < 100; i++) {
			if( i % 7 != 0 && i % 10 != 7 && i / 10 != 7) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}

}
