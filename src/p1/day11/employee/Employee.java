package p1.day11.employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Employee {
	public static List<Employee> list = new ArrayList<Employee>();//员工集合
	private String id;//员工编号
	private String name;//员工姓名
	private double salary;//员工工资
	private Date date;//入职时间
	private String mobile;//电话
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
			System.out.println("id输入错误");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name != null) {
			this.name = name;
		}else{
			System.out.println("姓名输入错误");
		}
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if (salary > 0.0) {
			this.salary = salary;
		}else{
			System.out.println("工资输入错误");
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
			System.out.println("日期格式错误(yyyy-MM-dd)");
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
			System.out.println("电话输入错误");
		}
	}
	
	/**
	 * 新增员工
	 */
	public static void addEmployee(){
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入员工编号：");
		String id =  sc.next();
		System.out.print("请输入员工姓名：");
		String name = sc.next();
		System.out.print("请输入员工工资：");
		double salary = sc.nextDouble();
		System.out.print("请输入入职日期：");
		String date = sc.next();
		System.out.print("请输入员工电话：");
		String mobile = sc.next();
		Employee e = new Employee(id, name, salary, date, mobile);
		list.add(e);
		System.out.println("新增员工成功！");
		sc.close();
	}
	
	/**
	 * 删除员工
	 */
	public static void delEmployee(){
		Scanner sc = new Scanner(System.in);
		getEmployee();
		System.out.println("请输入要删除的员工的编号:");
		int index = sc.nextInt();
		list.remove(index);
		sc.close();
	}
	
	/**
	 * 修改员工
	 */
	public static void modifyEmployee(){
		
	}
	
	/**
	 * 查询员工
	 */
	public static void getEmployee(){
		System.out.println("员工编号\t员工姓名\t员工工资\t入职时间\t\t员工电话");
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
