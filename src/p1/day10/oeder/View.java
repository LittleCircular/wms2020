package p1.day10.oeder;

import java.util.Scanner;

public class View {

	public void menu(){
		boolean isFlag = true;
		Scanner sc = new Scanner(System.in);
		while (isFlag) {
			System.out.println("\n-----------����------------");
			System.out.println("         1 �� �� Ա");
			System.out.println("         2 �� ͨ �� ��");
			System.out.println("         3 �� �� �� ��");
			System.out.println("         4 ��          ��");
			System.out.print("         ��ѡ��(1~4)��");
			int c;
	        for (; ; ) {
	        	c = sc.nextInt();
	            if (c != 1 && c != 2 && 
	                c != 3 && c != 4) {
	                System.out.print("ѡ��������������룺");
	            } else break;
	        }
			switch (c) {
			case 1:
				Admin();
				break;
			case 2:
				User();
				break;
			case 3:
				addUser();
				break;
			case 4:
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
	
	public void Admin(){
		Scanner sc = new Scanner(System.in);
		System.out.println("\n�û�����");
		String u = sc.next();
		System.out.println("���룺");
		String p = sc.next();
		comAdminMenu();
		sc.close();
	}
	public void comAdminMenu() {
		Scanner sc = new Scanner(System.in);
		boolean isFlag = true;
		while (isFlag) {
			System.out.println("\n-----------��Ʒ�б�------------\n");
			Commodity.getCommodity();
			System.out.println("            1 �� �� �� Ʒ");
			System.out.println("            2 �� �� �� Ʒ");
			System.out.println("            3 ɾ �� �� Ʒ");
			System.out.println("            4 ��          ��");
			System.out.print("            ��ѡ��(1~4)��");

			int c;
	        for (; ; ) {
	        	c = sc.nextInt();
	            if (c != 1 && c != 2 && 
	                c != 3 && c != 4) {
	                System.out.print("ѡ��������������룺");
	            } else break;
	        }
			switch (c) {
			case 1:
				addCom();
				break;
			case 2:
				modifyCom();
				break;
			case 3:
				delCom();
				break;
			case 4:
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
	public void addCom(){
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ʒ��ţ�");
		String i = sc.next();
		System.out.println("��������Ʒ���ƣ�");
		String n = sc.next();
		System.out.println("��������Ʒ�۸�");
		double p = sc.nextDouble();
		System.out.println("��������Ʒ���أ�");
		String a = sc.next();
		Commodity com = new Commodity(i,n,p,a);
		
		System.out.println("��Ʒ��ӳɹ���");
		sc.close();
	}
	public void modifyCom(){
		
	}
	public void delCom(){
		
	}
	public void User(){
		Scanner sc = new Scanner(System.in);
		System.out.println("\n�û�����");
		String u = sc.next();
		System.out.println("���룺");
		String p = sc.next();
		System.out.println("����ɹ���ף��������죡");
		comUserMenu();
		sc.close();
	}
	public void comUserMenu() {
		Scanner sc = new Scanner(System.in);
		boolean isFlag = true;
		while (isFlag) {
			System.out.println("            1 ��          ��");
			System.out.println("            2 ��          ��");
			System.out.println("            3 ��          ��");
			int c;
	        for (; ; ) {
	        	c = sc.nextInt();
	            if (c != 1 && c != 2 && 
	                c != 3) {
	                System.out.print("ѡ��������������룺");
	            } else break;
	        }
			switch (c) {
			case 1:
				userSet();
				break;
			case 2:
				modifyCom();
				break;
			case 3:
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
			System.out.println("\n-----------��Ʒ�б�------------\n");
			Commodity.getCommodity();
			System.out.println("������Ҫ�����Ʒ�ı�ţ�");
			System.out.println("������������");
		}
		sc.close();
	}
	public void addUser(){
		Scanner sc = new Scanner(System.in);
		System.out.println("�������û�����");
		String u = sc.next();
		System.out.println("���������룺");
		String p = sc.next();
		System.out.println("�������ֻ��ţ�");
		String ph = sc.next();
		System.out.println("�������ջ���ַ��");
		String a = sc.next();
		User user = new User(u,ph,a,p);
		User.setUser(user);
		System.out.println("�½��û��ɹ��������");
		User();
		sc.close();
	}
	public void userSet(){
		Scanner sc = new Scanner(System.in);
		boolean isFlag = true;
		while (isFlag) {
			System.out.println("1.�޸�����");
			System.out.println("2.�޸��ջ���ַ");
			System.out.println("3.�˳�");
			int c;
	        for (; ; ) {
	        	c = sc.nextInt();
	            if (c != 1 && c != 2 && 
	                c != 3) {
	                System.out.print("ѡ��������������룺");
	            } else break;
	        }
			switch (c) {
			case 1:
				User.modifyPassword(1);
				break;
			case 2:
				modifyCom();
				break;
			case 3:
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
