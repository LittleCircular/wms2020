package p1.day05;

public class TwoArray {

	public static void main(String[] args) {
		int[][] arr = new int[9][];
		for (int i = 1; i < arr.length + 1; i++) {
			arr[i - 1] = new int[i];
			for (int j = 1; j < arr[i - 1].length + 1; j++) {
				arr[i - 1][j - 1] = i*j;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print( (j+1) + "*" + (i+1) + "=" + arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
