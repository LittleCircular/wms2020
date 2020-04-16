package p1.day05.exer;

public class Circle {

	int x = 0 ;
	int y = 0 ;
	int ban;
	
	public Circle(){
		
	}
	public Circle(int x,int y,int ban){
		
	}
	
	public void print(){
		System.out.println("圆心：(" + x + "," + y + ")，半径：" + ban);
	}
	//判断点对于圆的位置
	public void fun(int[] dian){
		//x
		int x1 = 0 ;
		if (dian[0] >= x) {
			x1 = dian[0] - x;
		}else if (dian[0] < x) {
			x1 = x - dian[0];
		}
		//y
		int y1 = 0;
		if (dian[1] >= y) {
			y1 = dian[1] - y;
		}else if (dian[1] < y) {
			y1 = y - dian[1];
		}
		//z
		int z = 0;
		int zz = x1*x1+y1*y1;
		for (; ;z++) {
			if(z*z == zz) break;
		}
		
		if (z < ban) {
			System.out.println("(" + dian[0] + "," + dian[1] + ")" + "点在圆内");
		}else if (z == ban) {
			System.out.println("(" + dian[0] + "," + dian[1] + ")" + "点在圆上");
		}else if (z > ban) {
			System.out.println("(" + dian[0] + "," + dian[1] + ")" + "点在圆外");
		}
	}
}
