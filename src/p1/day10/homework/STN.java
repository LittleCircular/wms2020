package p1.day10.homework;

import java.util.Scanner;

public class STN {
	
	public void tNum(){
		Scanner sc = new Scanner(System.in);
		System.out.print("ÇëÊäÈë×Ö·û´®£º");
		String value = sc.next();
		char[] newValue = value.toCharArray();
		int n = 0 ;
		for (int i = 0; i < newValue.length; i++) {
			if (newValue[i] >= '0' && newValue[i] <= '9') {
				int n1 = newValue[i] - '0';
				n = n1 + n * 10;
			}
		}
		System.out.println(n);
		sc.close();
	}
	
	public static void main(String[] args) {
		STN s = new STN();
		s.tNum();
	}
}
