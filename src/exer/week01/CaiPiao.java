package exer.week01;

import java.util.Random;

public class CaiPiao {

	public static void main(String[] args) {
		Random ran = new Random();
		int[] arr = new int[7];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(8) + 1;
			for (int j = 0; j < i; j++) {
				if(arr[i] == arr[j]){
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

}
