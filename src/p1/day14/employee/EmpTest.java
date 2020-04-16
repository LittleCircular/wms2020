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
			System.out.println("\t��ӭ����Ա������ϵͳ��\n\t���������Ĳ�����\n" + "\t1 ����Ա��\n\t2 ɾ��Ա��\n\t3 �޸�Ա����Ϣ\n\t4 ��ѯԱ����Ϣ\n\t0 �˳�");
			int cmd = sc.nextInt();
			if (cmd == 0) {
				System.out.println("�ټ���");
				break;
			} else if (cmd == 1) {
				add();
			} else if (cmd == 2) {
				System.out.println("������Ҫɾ����Ա��ID");
				String id = sc.next().trim().toLowerCase();
				del(id);
			} else if (cmd == 3) {
				System.out.println("������Ҫ�޸�Ա����id��");
				String nid = sc.next();
				System.out.println("������Ա���������֣�");
				String nname = sc.next();
				System.out.println("������Ա��������ְʱ�䣺");
				Date ndate = sdf.parse(sc.next());
				System.out.println("������Ա�����¹��ʣ�");
				double nsalary = Double.parseDouble(sc.next());
				System.out.println("������Ա�����µ绰��");
				String nmobile = sc.next();
				modify(nid,nname,ndate,nsalary,nmobile);
			} else if (cmd == 4) {
				getEmployee();
//				System.out.println("�������ѯ������0 ����ȫ����ѯ 1 ����ID��ѯ");
//				int in = sc.nextInt();
//				if (in == 0) {
//					for (Emp emp : list)
//						System.out.println(emp);
//				} else if (in == 1) {
//					System.out.println("������Ҫɾ����Ա��ID");
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
//						System.out.println("û���ҵ�");
//				}
			} else {
				System.out.println("�𶺣��������");
			}
		}
		sc.close();

	}

	/**
	 * ����Ա��
	 */
	public static void add(){
		try {
			br1 = new PrintStream(new FileOutputStream(file,true));
			System.out.println("�밴�� ���,����,��ְʱ��(yyyy-mm-dd),����,�绰 ��ʽ����");
			String mess = sc.next();
//			if(mess.matches("\\w{6},\\w{6,12},\\d{4}-\\d{2}-\\d{2},[0-9.]{4,},1\\d{10}")) {
				String[] str = mess.split(",");
				Emp emp = new Emp(str[0],str[1],sdf.parse(str[2]),Double.parseDouble(str[3]),str[4]);
				list.add(emp);
				System.out.println("��Ա�ɹ�");
				br1.println(mess);
//			}else {
//				System.out.println("�����������������");
//			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	/**
	 * ɾ��Ա��
	 */
	public static void del(String id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId().equals(id)) {
				list.remove(i);
				System.out.println("ɾ���ɹ���");
			}else{
				System.out.println("ɾ��ʧ�ܣ�");
			}
		}
	}

	/**
	 * �޸�Ա��
	 */
	public static void modify(String id, String name, Date joinDate, double sal, String mobile) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId().equals(id)) list.remove(i);
		}
		Emp emp = new Emp(id,name,joinDate,sal,mobile);
		list.add(emp);
	}

	/**
	 * ��ѯԱ��
	 */
	public static void getEmployee() {
		for (Emp emp : list) System.out.println(emp);
	}
	
	/**
	 * ��ʼ��list
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
