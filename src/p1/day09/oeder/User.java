package p1.day09.oeder;

public class User {
	
	private String name;//用户名
	private String mobile;//手机号
	private String address;//收货地址
	
	public User() {
		super();
	}
	public User(String name, String mobile, String address) {
		super();
		this.setName(name);
		this.setMobile(mobile);
		this.setAddress(address);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name != null){
			this.name = name;
		}else {
			System.out.println("姓名输入错误");
		}
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		if(name != null){
			this.mobile = mobile;
		}else {
			System.out.println("姓名输入错误");
		}
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		if(name != null){
			this.address = address;
		}else {
			System.out.println("姓名输入错误");
		}
	}
	@Override
	public int hashCode() {
		return this.getClass().hashCode() + name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == this) return true;
		if (obj == null) return false;
		if (obj.getClass() == this.getClass()){
			User u = (User)obj;
			return u.name.equals(this.name);
		}
		return false;
	}
	@Override
	public String toString() {
		return "用户：姓名=" + name + ",手机号=" + mobile + ",收货地址=" + address;
	}
}
