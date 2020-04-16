package p1.day05.exer;

import java.util.Scanner;

public class WuZhiQi {
	String[][] qiPan = new String[8][8];
	public void qiPan(){
		for (int i = 0; i < qiPan.length; i++) {
			for (int j = 0; j < qiPan[i].length; j++) {
				qiPan[i][j] = " + ";
				System.out.print(qiPan[i][j]);
			}
			System.out.println();
		}
	}
	public void qiPanNew(){
		for (int i = 0; i < qiPan.length; i++) {
			for (int j = 0; j < qiPan[i].length; j++) {
				System.out.print(qiPan[i][j]);
			}
			System.out.println();
		}
	}
	
	public void xiaQi(){
		//WuZhiQi w = new WuZhiQi();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < qiPan.length; i++) {
			for (int j = 0; j < qiPan[i].length; j++) {
				qiPan[i][j] = " + ";
				System.out.print(qiPan[i][j]);
			}
			System.out.println();
		}
//		w.qiPan();
		int x1 = 0;
		int y1 = 0;
		System.out.println("白棋先下，请输入落子点()");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		qiPan[x1][y1] = " A " ;
		for (int i = 0; i < qiPan.length; i++) {
			for (int j = 0; j < qiPan[i].length; j++) {
				System.out.print(qiPan[i][j]);
			}
			System.out.println();
		}
		for(;;){
			System.out.println("黑棋下，请输入落子点()");
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			qiPan[x1][y1] = " B " ;
			for (int i = 0; i < qiPan.length; i++) {
				for (int j = 0; j < qiPan[i].length; j++) {
					System.out.print(qiPan[i][j]);
				}
				System.out.println();
			}
			System.out.println("白棋下，请输入落子点()");
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			qiPan[x1][y1] = " A " ;
			for (int i = 0; i < qiPan.length; i++) {
				for (int j = 0; j < qiPan[i].length; j++) {
					System.out.print(qiPan[i][j]);
				}
				System.out.println();
			}
			if(false) break;
		}
		
//		w.qiPanNew();
		sc.close();
	}
	
	public static void main(String[] args) {
		WuZhiQi w = new WuZhiQi();
		w.xiaQi();
		
	}
	

}
