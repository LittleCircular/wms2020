package p1.day04.task;
 
/**
 * 
 * @Title: Task2.java
 * @Package p1.day04.task
 * @Description: ��ӡ2-200���ڵ����е�����(����) 2 3 5 7 11 13 17 
 *               ֻ�ܱ�1������������������
 * @author yuan zhigang  Email:3155799044@qq.com
 * @date 2019��11��28�� ����11:49:07
 * @version
 *
 */

public class Task2 {

	public static void main(String[] args) {
		for (int i = 2; i < 201; i++) {
			if (i % 2 != 0) {
				if (i % 3 != 0) {
					if (i % 5 != 0) {
						System.out.println(i);
					}
				}
			}
		}
	}

}
