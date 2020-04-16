package p1.day13;

public class TestRuntimeException {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		if(b != 0) System.out.println(a/b);
		String s1 = null;
		if (s1 != null) System.out.println(s1.equals(""));
		int[] arr = new int[5];
		int index = 5 ;
		if(index >= 0 && index < arr.length) arr[index] = 10;
		Object obj = new Object();
		if(obj instanceof String) {
			String s2 = (String)obj;
		}
		String s3 = "abc";
		if (s3.matches("\\d{1,}")) {
			int x = Integer.parseInt(s3);
		}
		System.out.println();
	}

}
