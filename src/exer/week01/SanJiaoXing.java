package exer.week01;

public class SanJiaoXing {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) { //m * i + n m��ÿ��ѭ��������������ǵݼ�ȡ������n�ǵ�һ��ѭ���Ĵ�����
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
//				System.out.print((char)(65 + i));
			}
			System.out.println();
		}
	}
}