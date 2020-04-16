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
				System.out.print("请输入1-100的数字:");
				y = sc.nextInt();
				if(y <= 0 || y >100){
					System.out.print("输入错误！");
				}else{
					break;
				}
			}
			if(y > x){
				System.out.println("猜大了！");
			}else if (y < x) {
				System.out.println("猜小了！");
			}else if (y == x) {
				System.out.println("猜对了！");
				break;
			}
		}
		sc.close();
	}

}
