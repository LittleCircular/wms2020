package exer.week01;

import java.util.Random;
import java.util.Scanner;

public class Ten {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int x = 0;
		for(;;) {
			System.out.print("请输入强化成功率：");
			x = sc.nextInt();
			if(0 <= x || x <= 100) {
				break;
			}else {
				System.out.print("输入错误！");
			}
		}
		for(int i = 0 ; i < 10 ; i++) {
			int nextInt = ran.nextInt(101);
//			System.out.println(nextInt);
			if( nextInt <= x) {
				System.out.println("第" + (i + 1) + "次强化成功！");
			}else {
				System.out.println("第" + (i + 1) + "次强化失败！");
			}
		}
		sc.close();
	}

}
