package p1.myschool.entity;

public class Student {

	private int id ;
	private String name;
	private String gender;
	private String phone;
	private String address;
	private String borndate;
	
	public Student() {
		super();
	}
	public Student(int id, String name, String gender, String phone, String address, String borndate) {
		super();
		this.setId(id);
		this.setName(name);
		this.setGender(gender);
		this.setPhone(phone);
		this.setAddress(address);
		this.setBorndate(borndate);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBorndate() {
		return borndate;
	}
	public void setBorndate(String borndate) {
		this.borndate = borndate;
	}
	@Override
	public int hashCode() {
		return this.getClass().hashCode() + id;
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
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", phone=" + phone + ", address="
				+ address + ", borndate=" + borndate + "]";
	}
	
}
