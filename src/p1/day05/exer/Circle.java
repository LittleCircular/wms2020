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
		System.out.println("Բ�ģ�(" + x + "," + y + ")���뾶��" + ban);
	}
	//�жϵ����Բ��λ��
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
			System.out.println("(" + dian[0] + "," + dian[1] + ")" + "����Բ��");
		}else if (z == ban) {
			System.out.println("(" + dian[0] + "," + dian[1] + ")" + "����Բ��");
		}else if (z > ban) {
			System.out.println("(" + dian[0] + "," + dian[1] + ")" + "����Բ��");
		}
	}
}
