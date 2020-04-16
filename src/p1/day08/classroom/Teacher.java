package p1.day08.classroom;

/**
 * 
 * @Title: Teacher.java
 * @Package p1.day08.classroom
 * @Description: ��ʦ�࣬��ʼ����ʦ����
 * @author yuan zhigang  Email:3155799044@qq.com
 * @date 2019��12��4�� ����9:06:33
 * @version
 *
 */

public class Teacher extends Person{

	private int salary;//�¹���

	public Teacher() {
		super();
	}
	public Teacher(String name, String subject, String phone, int salary) {
		super(name, subject, phone);
		this.setSalary(salary);
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		if (salary > 5000 && salary < 20000) {
			this.salary = salary;
		}
	}
	
	@Override
	public String getMessage() {
		return super.getMessage() + "���ʣ�" + salary;
	}
	
}
