package p1.day10;

public class TestPool {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		String s4 = new String("abc");
		System.out.println(s1 == s2);     //t
		System.out.println(s1.equals(s2));//t
		System.out.println(s3 == s4);     //f
		System.out.println(s3.equals(s4));//t
		String s5 = "abcd";
		String s6 = "abc" + "d"; //�������������㣬���������������
		String s7 = s1 + "d";    //s1�����ã����ǳ�����������������
		System.out.println(s5 == s6);//t
		System.out.println(s5 == s7);//f
		System.out.println(s7 == s6);//f
	}

}
