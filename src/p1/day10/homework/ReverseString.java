package p1.day10.homework;

import java.util.Scanner;

public class ReverseString {

	public void reverseString(){
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入要翻转的字符串：");
		String value = sc.next();
		char[] newValue = value.toCharArray();
		String n = "" ;
		for (int i = newValue.length - 1; i >= 0 ; i--) {
			n = n + newValue[i];
		}
		System.out.println(n);
		sc.close();
	}
	
	public static void main(String[] args) {
		ReverseString r = new ReverseString();
		r.reverseString();
	}

}
