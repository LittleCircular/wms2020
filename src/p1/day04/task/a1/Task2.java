package p1.day04.task.a1;

public class Task2 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,3,4,5,6,7,8};
		for (int i = 3; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
//		arr[arr.length - 1] = arr[arr.length - 2];
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

}
