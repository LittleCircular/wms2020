package p1.day10.oeder;

public class User {
	
	private static User[] user = new User[20];
	private static int num = 0;//��ǰ�û�������
	private String name;//�û���
	private String password;//����
	private String mobile;//�ֻ���
	private String address;//�ջ���ַ
	
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
	 * ��������
	 * @param password
	 */
	public void setPassword(String password) {
		if(password != null){
			this.password = password;
		}else {
			System.out.println("�����������");
		}
	}
	/**
	 * �޸�����
	 * @param password
	 */
	public static void modifyPassword(int index) {
		if(user[index].password != null){
			user[index].password = "12";
		}else {
			System.out.println("�����������");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name != null){
			this.name = name;
		}else {
			System.out.println("�����������");
		}
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		if(name != null){
			this.mobile = mobile;
		}else {
			System.out.println("�����������");
		}
	}
	public String getAddress() {
		return address;
	}
	
	/**
	 * �����ջ���ַ
	 * @param address
	 */
	public void setAddress(String address) {
		if(name != null){
			this.address = address;
		}else {
			System.out.println("��ַ�������");
		}
	}
	
	/**
	 * �����û�
	 * @param u
	 */
	public static void setUser(User u){
		for (int i = 0; i < user.length; i++) {
			if (u.equals(user[i])) {
				System.out.println("�û����Ա�ʹ�ã����ʧ�ܣ�");
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
			System.out.println("�û����������ʧ��");
		}
	}
	
	/**
	 * ��ʾ�û�
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
