package p1.day14.employee;

import java.util.Date;

public class Emp { //编号、姓名、入职时间、工资、电话
	private String id;
	private String name;
	private Date joinDate;
	private double sal;
	private String mobile;
	
	public Emp() { //构造中通常会对属性进行初始化
		this("007","bangde",new Date(),3000.0,"12345678901");
	}
	
	public Emp(String id, String name, Date joinDate, double sal, String mobile) {
		super();
		this.setId(id);
		this.setName(name);
		this.setJoinDate(joinDate);
		this.setSal(sal);
		this.setMobile(mobile);
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		if(sal>2000.0) {
		    this.sal = sal;
		}else {
			System.out.println("薪水不满足最低工资标准");
		}
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
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
		Emp other = (Emp) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", joinDate=" + joinDate + ", sal=" + sal + ", mobile=" + mobile
				+ "]";
	}
	
	

}
