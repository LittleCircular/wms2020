package p1.day11;

import java.util.Scanner;

public class TestMatches {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���������ݣ�");
		String str = sc.next();
		String reg1 = "^\\w{8,12}$";//8��12λ�û���
		String reg2 = "\\d{6}";//���п�����
		String reg3 = "1\\d{10}";//�绰����
		String reg4 = "\\w+@\\w+\\.(com|cn|net)";//email
		
		if (str.matches(reg4)) {
			System.out.println("������ȷ��");
		}else {
			System.out.println("�������");
		}
		sc.close();
	}

}
