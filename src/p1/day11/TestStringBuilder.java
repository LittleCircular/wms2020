package p1.day11;

public class TestStringBuilder {

	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("abc");
		StringBuilder s2 = new StringBuilder("abc");
		System.out.println(s1 == s2);//f
		System.out.println(s1.equals(s2));//f 没有重写equals()
		System.out.println(s1.capacity());//16 + 3
		System.out.println(s1.length());//3
		s1.append("d");//可变字符串，调用方法时会修改自己
		s1.append("e");
		s1.append("f");
		System.out.println(s1); //abcdef
		System.out.println(s1.capacity());//19
		System.out.println(s1.length());//6
	}

}
