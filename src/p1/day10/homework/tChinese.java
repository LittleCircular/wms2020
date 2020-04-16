package p1.day10.homework;

import java.util.Scanner;

public class tChinese {
	
	public void tc(){
		Scanner sc = new Scanner(System.in);
		System.out.print("ÇëÊäÈë×Ö·û´®£º");
		String value = sc.next();
		char[] newValue = value.toCharArray();
		String n = "" ;
		for (int i = 0; i < newValue.length; i++) {
			if (newValue[i] >= 0 && newValue[i] <= 127) {
				n = n + newValue[i];
			}
		}
		System.out.println(n);
		sc.close();
	}
	
	public static void main(String[] args) {
		tChinese t = new tChinese();
		t.tc();
	}
}
