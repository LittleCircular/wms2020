package p1.day04.task.a1;

public class Task1 {
	public static void main(String[] args) {
		// 这是不那么密集的三角形
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6 - i - 1; j++) {
				System.out.print(" ");

			}
			for (int k = 0; k < i * 2 + 1; k++) {
				char W = (char)(65 + i);
				System.out.print(W);
			}
			System.out.println();
		}
	}
}
