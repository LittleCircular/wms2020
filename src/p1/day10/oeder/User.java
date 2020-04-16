package p1.day10.oeder;

public class User {
	
	private static User[] user = new User[20];
	private static int num = 0;//当前用户的数量
	private String name;//用户名
	private String password;//密码
	private String mobile;//手机号
	private String address;//收货地址
	
	public User() {
		super();
	}
	public User(String name, String mobile, String address,String password) {
		super();
		this.setName(name);
		this.setMobile(mobile);
		this.setAddress(address);
		this.setPassword(password);
	}
	
	public String getPassword() {
		return password;
	}
	
	/**
	 * 设置密码
	 * @param password
	 */
	public void setPassword(String password) {
		if(password != null){
			this.password = password;
		}else {
			System.out.println("密码输入错误");
		}
	}
	/**
	 * 修改密码
	 * @param password
	 */
	public static void modifyPassword(int index) {
		if(user[index].password != null){
			user[index].password = "12";
		}else {
			System.out.println("密码输入错误");
		}
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
	
	/**
	 * 设置收货地址
	 * @param address
	 */
	public void setAddress(String address) {
		if(name != null){
			this.address = address;
		}else {
			System.out.println("地址输入错误");
		}
	}
	
	/**
	 * 设置用户
	 * @param u
	 */
	public static void setUser(User u){
		for (int i = 0; i < user.length; i++) {
			if (u.equals(user[i])) {
				System.out.println("用户名以被使用，添加失败！");
				return;
			}
		}
		if (num < 20) {
			for (int i = 0; i < user.length; i++) {
				if (user[i] == null) {
					user[i] = u;
					num++;
					break;
				}
			}
		}else{
			System.out.println("用户已满！添加失败");
		}
	}
	
	/**
	 * 显示用户
	 */
	public static void getUser() {
		for (int i = 0; i < user.length; i++) {
			System.out.println(user[i]);
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
		return "User [name=" + name + ", password=" + password + ", mobile="
				+ mobile + ", address=" + address + "]";
	}
	
}
