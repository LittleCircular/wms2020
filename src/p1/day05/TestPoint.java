package p1.day05;

/**
 * 
 * @Title: TestPoint.java
 * @Package p1.day05
 * @Description: ����Point
 * @author yuan zhigang  Email:3155799044@qq.com
 * @date 2019��11��29�� ����2:57:56
 * @version
 *
 */

public class TestPoint {

	public static void main(String[] args) {
		Point point = new Point();
		point.x = 10;
		point.y = 20;
		System.out.println(point.x);
		System.out.println(point.y);
		
		point.set(100,100);
		point.print();
	}

}
