package p1.day04.task;

/**
 * 
 * @Title: Task1.java
 * @Package p1.day04.task
 * @Description: 打印乘法表
 * @author yuan zhigang  Email:3155799044@qq.com
 * @date 2019年11月28日 上午11:48:27
 * @version
 *
 */

public class Task1 {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print(i*j + " ");
			}
			System.out.println();
		}
	}

}
