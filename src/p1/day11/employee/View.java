package p1.day11.employee;

import java.util.Scanner;

public class View {
	public void menu(){
		boolean isFlag = true;
		Scanner sc = new Scanner(System.in);
		while (isFlag) {
			System.out.println("\n-------员工管理系统--------");
			System.out.println("        1 新 增 员 工");
			System.out.println("        2 删 除 员 工");
			System.out.println("        3 修 改 员 工 信 息");
			System.out.println("        4 查 询 员 工");
			System.out.println("        5 退          出");
			System.out.print("         请选择(1~5)：");
			int c ;
	        for (; ; ) {
	        	c = sc.nextInt();
	            if (c != 1 && c != 2 && 
	                c != 3 && c != 4 && c != 5) {
	                System.out.print("选择错误，请重新输入：");
	            } else break;
	        }
			switch (c) {
			case 1:
				Employee.addEmployee();
				break;
			case 2:
				Employee.delEmployee();
				break;
			case 3:
				Employee.modifyEmployee();
				break;
			case 4:
				Employee.getEmployee();
				break;
			case 5:
				System.out.print("确认是否退出(Y/N)：");
				String y;
		        for (; ; ) {
		        	y = sc.next();
		            if ("Y".equals(y) || "N".equals(y) || "y".equals(y) || "n".equals(y) ) {
		                break;
		            } else {
		                System.out.print("选择错误，请重新输入：");
		            }
		        }
				if("Y".equals(y) || "y".equals(y)){
				isFlag = false;
				}
				break;
			}
		}
		sc.close();
	}
}
