package p1.day05;

/** 
 * 
 * @Title: Point.java
 * @Package p1.day05
 * @Description: ����ϵ
 * @author yuan zhigang  Email:3155799044@qq.com
 * @date 2019��11��29�� ����2:54:03
 * @version 1.0
 *
 */

public class Point {

	int x;//������x
	int y;//������y
	
	public Point(){
		
	}
	public Point(int a,int b){
		x = a;
		y = b;
	}
	
	//�������趨������x��������y��ֵ
	public void set(int a,int b){
		x = a;
		y = b;
	}
	public void print(){
		System.out.println("(" + x + "," + y + ")");
	}
}
