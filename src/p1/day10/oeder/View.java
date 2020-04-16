package p1.day10.oeder;

import java.util.Scanner;

public class View {

	public void menu(){
		boolean isFlag = true;
		Scanner sc = new Scanner(System.in);
		while (isFlag) {
			System.out.println("\n-----------电商------------");
			System.out.println("         1 管 理 员");
			System.out.println("         2 普 通 用 户");
			System.out.println("         3 新 建 用 户");
			System.out.println("         4 退          出");
			System.out.print("         请选择(1~4)：");
			int c;
	        for (; ; ) {
	        	c = sc.nextInt();
	            if (c != 1 && c != 2 && 
	                c != 3 && c != 4) {
	                System.out.print("选择错误，请重新输入：");
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
	
	public void Admin(){
		Scanner sc = new Scanner(System.in);
		System.out.println("\n用户名：");
		String u = sc.next();
		System.out.println("密码：");
		String p = sc.next();
		comAdminMenu();
		sc.close();
	}
	public void comAdminMenu() {
		Scanner sc = new Scanner(System.in);
		boolean isFlag = true;
		while (isFlag) {
			System.out.println("\n-----------商品列表------------\n");
			Commodity.getCommodity();
			System.out.println("            1 添 加 商 品");
			System.out.println("            2 修 改 商 品");
			System.out.println("            3 删 除 商 品");
			System.out.println("            4 退          出");
			System.out.print("            请选择(1~4)：");

			int c;
	        for (; ; ) {
	        	c = sc.nextInt();
	            if (c != 1 && c != 2 && 
	                c != 3 && c != 4) {
	                System.out.print("选择错误，请重新输入：");
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
	public void addCom(){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入商品编号：");
		String i = sc.next();
		System.out.println("请输入商品名称：");
		String n = sc.next();
		System.out.println("请输入商品价格：");
		double p = sc.nextDouble();
		System.out.println("请输入商品产地：");
		String a = sc.next();
		Commodity com = new Commodity(i,n,p,a);
		
		System.out.println("商品添加成功！");
		sc.close();
	}
	public void modifyCom(){
		
	}
	public void delCom(){
		
	}
	public void User(){
		Scanner sc = new Scanner(System.in);
		System.out.println("\n用户名：");
		String u = sc.next();
		System.out.println("密码：");
		String p = sc.next();
		System.out.println("登入成功！祝您购物愉快！");
		comUserMenu();
		sc.close();
	}
	public void comUserMenu() {
		Scanner sc = new Scanner(System.in);
		boolean isFlag = true;
		while (isFlag) {
			System.out.println("            1 设          置");
			System.out.println("            2 购          物");
			System.out.println("            3 退          出");
			int c;
	        for (; ; ) {
	        	c = sc.nextInt();
	            if (c != 1 && c != 2 && 
	                c != 3) {
	                System.out.print("选择错误，请重新输入：");
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
			System.out.println("\n-----------商品列表------------\n");
			Commodity.getCommodity();
			System.out.println("请输入要买的商品的编号：");
			System.out.println("请输入数量：");
		}
		sc.close();
	}
	public void addUser(){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String u = sc.next();
		System.out.println("请输入密码：");
		String p = sc.next();
		System.out.println("请输入手机号：");
		String ph = sc.next();
		System.out.println("请输入收货地址：");
		String a = sc.next();
		User user = new User(u,ph,a,p);
		User.setUser(user);
		System.out.println("新建用户成功！请登入");
		User();
		sc.close();
	}
	public void userSet(){
		Scanner sc = new Scanner(System.in);
		boolean isFlag = true;
		while (isFlag) {
			System.out.println("1.修改密码");
			System.out.println("2.修改收货地址");
			System.out.println("3.退出");
			int c;
	        for (; ; ) {
	        	c = sc.nextInt();
	            if (c != 1 && c != 2 && 
	                c != 3) {
	                System.out.print("选择错误，请重新输入：");
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
