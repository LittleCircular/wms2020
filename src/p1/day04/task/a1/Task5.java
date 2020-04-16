package p1.day04.task.a1;

import java.util.Random;

public class Task5 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] arr = new int[7];
		for (int i = 0; i < arr.length; i++) {
				arr[i] = (r.nextInt(7) + 1);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

}
