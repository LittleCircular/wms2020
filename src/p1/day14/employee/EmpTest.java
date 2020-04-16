package p1.day14.employee;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class EmpTest {

	public static String file = "e:/employee.txt";
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static BufferedReader bd ;
	public static PrintStream br1;
	public static Scanner sc = new Scanner(System.in);
	public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	public static List<Emp> list ;

	public EmpTest(){
		list = new ArrayList<>();
		updateList();
	}
	
	public static void main(String[] args) throws NumberFormatException, ParseException {
		EmpTest e1 = new EmpTest();
		for (;;) {
			System.out.println("\t欢迎来到员工管理系统！\n\t请输入您的操作：\n" + "\t1 新增员工\n\t2 删除员工\n\t3 修改员工信息\n\t4 查询员工信息\n\t0 退出");
			int cmd = sc.nextInt();
			if (cmd == 0) {
				System.out.println("再见！");
				break;
			} else if (cmd == 1) {
				add();
			} else if (cmd == 2) {
				System.out.println("请输入要删除的员工ID");
				String id = sc.next().trim().toLowerCase();
				del(id);
			} else if (cmd == 3) {
				System.out.println("请输入要修改员工的id：");
				String nid = sc.next();
				System.out.println("请输入员工的新名字：");
				String nname = sc.next();
				System.out.println("请输入员工的新入职时间：");
				Date ndate = sdf.parse(sc.next());
				System.out.println("请输入员工的新工资：");
				double nsalary = Double.parseDouble(sc.next());
				System.out.println("请输入员工的新电话：");
				String nmobile = sc.next();
				modify(nid,nname,ndate,nsalary,nmobile);
			} else if (cmd == 4) {
				getEmployee();
//				System.out.println("请输入查询条件：0 代表全部查询 1 代表按ID查询");
//				int in = sc.nextInt();
//				if (in == 0) {
//					for (Emp emp : list)
//						System.out.println(emp);
//				} else if (in == 1) {
//					System.out.println("请输入要删除的员工ID");
//					String id = sc.next().trim().toLowerCase();
//					boolean flag = false;
//					for (Emp emp : list) {
//						if (emp.getId().toLowerCase().equals(id)) {
//							System.out.println(emp);
//							flag = true;
//							break;
//						}
//					}
//					if (!flag)
//						System.out.println("没有找到");
//				}
			} else {
				System.out.println("别逗，输入错误！");
			}
		}
		sc.close();

	}

	/**
	 * 增加员工
	 */
	public static void add(){
		try {
			br1 = new PrintStream(new FileOutputStream(file,true));
			System.out.println("请按照 编号,姓名,入职时间(yyyy-mm-dd),工资,电话 格式输入");
			String mess = sc.next();
//			if(mess.matches("\\w{6},\\w{6,12},\\d{4}-\\d{2}-\\d{2},[0-9.]{4,},1\\d{10}")) {
				String[] str = mess.split(",");
				Emp emp = new Emp(str[0],str[1],sdf.parse(str[2]),Double.parseDouble(str[3]),str[4]);
				list.add(emp);
				System.out.println("增员成功");
				br1.println(mess);
//			}else {
//				System.out.println("输入错误，请重新输入");
//			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 删除员工
	 */
	public static void del(String id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId().equals(id)) {
				list.remove(i);
				System.out.println("删除成功！");
			}else{
				System.out.println("删除失败！");
			}
		}
	}

	/**
	 * 修改员工
	 */
	public static void modify(String id, String name, Date joinDate, double sal, String mobile) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId().equals(id)) list.remove(i);
		}
		Emp emp = new Emp(id,name,joinDate,sal,mobile);
		list.add(emp);
	}

	/**
	 * 查询员工
	 */
	public static void getEmployee() {
		for (Emp emp : list) System.out.println(emp);
	}
	
	/**
	 * 初始化list
	 */
	public static void updateList(){
		try {
			bd = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			for (; ; ) {
				String line = bd.readLine();
				if (line == null) {
					break;
				}else{
					String[] str = line.split(",");
					Emp emp = new Emp(str[0],str[1],sdf.parse(str[2]),Double.parseDouble(str[3]),str[4]);
					list.add(emp);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}catch (NumberFormatException e) {
			e.printStackTrace();
		} 
		catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
