package p1.day11;

import java.util.Scanner;

public class TestMatches {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数据：");
		String str = sc.next();
		String reg1 = "^\\w{8,12}$";//8到12位用户名
		String reg2 = "\\d{6}";//银行卡密码
		String reg3 = "1\\d{10}";//电话号码
		String reg4 = "\\w+@\\w+\\.(com|cn|net)";//email
		
		if (str.matches(reg4)) {
			System.out.println("输入正确！");
		}else {
			System.out.println("输入错误！");
		}
		sc.close();
	}

}
