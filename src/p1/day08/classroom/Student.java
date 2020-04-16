package p1.day08.classroom;

/**
 * 
 * @Title: Student.java
 * @Package p1.day08.classroom
 * @Description: 学生类，初始化学生属性
 * @author yuan zhigang  Email:3155799044@qq.com
 * @date 2019年12月4日 下午9:06:13
 * @version
 *
 */

public class Student extends Person{

	private int id;//学号
	
	public Student() {
		super();
	}
	public Student(String name, String subject, String phone, int id) {
		super(name, subject, phone);
		this.setId(id);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if (id > 0 && id < 999) {
			this.id = id;
		}else{
			System.out.println("学号输入错误！");
		}
	}
	
	@Override
	public String getMessage() {
		return "学号：" + id + super.getMessage();
	}
	
}
