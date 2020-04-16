package p1.day04.ArrayTest;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] brr = new int[10];
		for (int i = 0; i < 3; i++) {
			brr[i + 6] = arr[i + 1];
		}
		for (int i = 0; i < brr.length; i++) {
			System.err.print(brr[i] + " ");
		}
	}

}
