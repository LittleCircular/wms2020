package p1.day10;

public class TestString {

	public static void main(String[] args) {
		String s1 = "zhangfei,25,man";
		String[] st = s1.split(",");
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]);
		}
		String s2 = "abcdefghijklmn";
		s2 = s2.substring(3,7);//����3��������7 [3,7)
		System.out.println(s2);
		String s3 = "aaasdsaaabdsaaadsi";
		int ind = s3.indexOf("aaa");//��ϰ����ӡ������aaa��λ��
		int a = s3.indexOf("aaa" , ind + 1);
		int b = s3.indexOf("aaa" , a + 1);
		System.out.println(ind);
		System.out.println(a);
		System.out.println(b);
	}

}
