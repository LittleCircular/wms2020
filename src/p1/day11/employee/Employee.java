package p1.day11.employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Employee {
	public static List<Employee> list = new ArrayList<Employee>();//Ա������
	private String id;//Ա�����
	private String name;//Ա������
	private double salary;//Ա������
	private Date date;//��ְʱ��
	private String mobile;//�绰
	SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
	
	public Employee() {
		super();
	}
	public Employee(String id, String name, double salary, String date, String mobile) {
		super();
		this.setId(id);
		this.setName(name);
		this.setSalary(salary);
		this.setDate(date);
		this.setMobile(mobile);
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		if (id != null) {
			this.id = id;
		}else{
			System.out.println("id�������");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name != null) {
			this.name = name;
		}else{
			System.out.println("�����������");
		}
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if (salary > 0.0) {
			this.salary = salary;
		}else{
			System.out.println("�����������");
		}
	}
	public Date getDate() {
		return date;
	}
	public void setDate(String date) {
		Date date1;
		try {
			date1 = sd.parse(date);
			this.date = date1;
		} catch (ParseException e) {
			System.out.println("���ڸ�ʽ����(yyyy-MM-dd)");
		}
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		String s = "^1\\d{10}$";
		if (mobile.matches(s)) {
			this.mobile = mobile;
		}else{
			System.out.println("�绰�������");
		}
	}
	
	/**
	 * ����Ա��
	 */
	public static void addEmployee(){
		Scanner sc = new Scanner(System.in);
		System.out.print("������Ա����ţ�");
		String id =  sc.next();
		System.out.print("������Ա��������");
		String name = sc.next();
		System.out.print("������Ա�����ʣ�");
		double salary = sc.nextDouble();
		System.out.print("��������ְ���ڣ�");
		String date = sc.next();
		System.out.print("������Ա���绰��");
		String mobile = sc.next();
		Employee e = new Employee(id, name, salary, date, mobile);
		list.add(e);
		System.out.println("����Ա���ɹ���");
		sc.close();
	}
	
	/**
	 * ɾ��Ա��
	 */
	public static void delEmployee(){
		Scanner sc = new Scanner(System.in);
		getEmployee();
		System.out.println("������Ҫɾ����Ա���ı��:");
		int index = sc.nextInt();
		list.remove(index);
		sc.close();
	}
	
	/**
	 * �޸�Ա��
	 */
	public static void modifyEmployee(){
		
	}
	
	/**
	 * ��ѯԱ��
	 */
	public static void getEmployee(){
		System.out.println("Ա�����\tԱ������\tԱ������\t��ְʱ��\t\tԱ���绰");
		for (int i = 0; i < list.size(); i++) {
			Employee e = list.get(i);
			System.out.println(e);
		}
	}
	
	@Override
	public int hashCode() {
		return this.getClass().hashCode() + this.id.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return id + "\t" + name + "\t" + salary + "\t" + sd.format(date) + "\t" + mobile;
	}
	
	
}
