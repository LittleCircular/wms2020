package p1.day14.employee;

import java.util.Date;

public class Emp { //��š���������ְʱ�䡢���ʡ��绰
	private String id;
	private String name;
	private Date joinDate;
	private double sal;
	private String mobile;
	
	public Emp() { //������ͨ��������Խ��г�ʼ��
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
			System.out.println("нˮ��������͹��ʱ�׼");
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
