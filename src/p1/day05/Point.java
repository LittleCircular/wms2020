package p1.day05;

/** 
 * 
 * @Title: Point.java
 * @Package p1.day05
 * @Description: 坐标系
 * @author yuan zhigang  Email:3155799044@qq.com
 * @date 2019年11月29日 下午2:54:03
 * @version 1.0
 *
 */

public class Point {

	int x;//横坐标x
	int y;//纵坐标y
	
	public Point(){
		
	}
	public Point(int a,int b){
		x = a;
		y = b;
	}
	
	//方法：设定横坐标x和纵坐标y的值
	public void set(int a,int b){
		x = a;
		y = b;
	}
	public void print(){
		System.out.println("(" + x + "," + y + ")");
	}
}
