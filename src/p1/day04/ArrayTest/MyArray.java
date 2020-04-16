package p1.day04.ArrayTest;

public class MyArray {

	public static void main(String[] args) {
		int[] arr = new int[5];
		System.out.println(arr[0]);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		String[] names = {"zhangsan","lisi","wagnwu","zhaoyun","mm"};
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
