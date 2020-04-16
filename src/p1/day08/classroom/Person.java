package p1.day08.classroom;

/**
 * 
 * @Title: Person.java
 * @Package p1.day08.classroom
 * @Description: Student和Teacher的父类，初始化老师和学生都有的属性
 * @author yuan zhigang  Email:3155799044@qq.com
 * @date 2019年12月4日 下午8:38:05
 * @version
 *
 */

public class Person {

	private String name;//姓名
	private String subject;//学科
	private String phone;//手机号
	
	
	
	public Person() {
		super();
	}
	public Person(String name, String subject, String phone) {
		super();
		this.setName(name);
		this.setSubject(subject);
		this.setPhone(phone);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name != null) {
			this.name = name;
		}else{
			System.out.println("请输入姓名！");
		}
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		if (subject != null) {
			this.subject = subject;
		}else{
			System.out.println("请输入学科！");
		}
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
			this.phone = phone;
	}
	
	/**
	 * 返回信息
	 * @return
	 */
	public String getMessage(){
		return "姓名：" + name + "学科：" + "电话：" + phone;
	}
	
}
