package p1.day11.employee;

import java.util.Scanner;

public class View {
	public void menu(){
		boolean isFlag = true;
		Scanner sc = new Scanner(System.in);
		while (isFlag) {
			System.out.println("\n-------Ա������ϵͳ--------");
			System.out.println("        1 �� �� Ա ��");
			System.out.println("        2 ɾ �� Ա ��");
			System.out.println("        3 �� �� Ա �� �� Ϣ");
			System.out.println("        4 �� ѯ Ա ��");
			System.out.println("        5 ��          ��");
			System.out.print("         ��ѡ��(1~5)��");
			int c ;
	        for (; ; ) {
	        	c = sc.nextInt();
	            if (c != 1 && c != 2 && 
	                c != 3 && c != 4 && c != 5) {
	                System.out.print("ѡ��������������룺");
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
				System.out.print("ȷ���Ƿ��˳�(Y/N)��");
				String y;
		        for (; ; ) {
		        	y = sc.next();
		            if ("Y".equals(y) || "N".equals(y) || "y".equals(y) || "n".equals(y) ) {
		                break;
		            } else {
		                System.out.print("ѡ��������������룺");
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
