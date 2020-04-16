package p1.day15.lianxi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student implements Comparable<Student>{
	
	private String id;//学号
	private String name;//姓名
	private String sex;//性别
	private String mobile;//电话
	private Date date;//出生日期
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	public Student() {
		this("01","zhangfei","man","13612345678",new Date());
	}
	public Student(String id, String name, String sex, String mobile, Date date) {
		super();
		this.setId(id);
		this.setName(name);
		this.setSex(sex);
		this.setMobile(mobile);
		this.setDate(date);
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		if (id.matches("\\w{1,4}")) {
			this.id = id;
		}else{
			System.out.println("id输入错误");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name.matches("\\w{1,8}")) {
			this.name = name;
		}else{
			System.out.println("name输入错误");
		}
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		if (sex.matches("(man)|(woman)")) {
			this.sex = sex;
		}else{
			System.out.println("性别输入错误");
		}
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		if (mobile.matches("1\\d{10}")) {
			this.mobile = mobile;
		}else{
			System.out.println("电话输入错误");
		}
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public int hashCode() {
		return this.getClass().hashCode() + id.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sex=" + sex + ", mobile=" + mobile + ", date=" + sdf.format(date) + "]";
	}
	@Override
	public int compareTo(Student o) {
		return this.id.compareTo(o.id);
	}
}
