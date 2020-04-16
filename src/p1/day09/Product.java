package p1.day09;

public class Product {

	private String code;
	private String name;
	private double price;
	private String place;
	
	public Product() {

	}
	public Product(String code, String name, double price, String place) {
		this.setCode(code);
		this.setName(name);
		this.setPrice(price);
		this.setLocal(place);
	}

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPlace() {
		return place;
	}
	public void setLocal(String place) {
		this.place = place;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == this) return true;
		if(obj == null) return false;
		if (obj.getClass() == this.getClass()) {
			Product p = (Product)obj;
			return p.code == this.code;//��ѧ���ж��Ƿ���ͬһ��ѧ��
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return getClass().hashCode() + code.hashCode();
	}
	
	@Override
	public String toString() {
		return "��Ʒ���룺" + code + "\t��Ʒ���ƣ�" + name + "\t��Ʒ�۸�" 
	            + price + "\t���أ�" + place;
	}
	
	public static void main(String[] args) {
		Product p = new Product("01", "didi", 200.0, "xianyan");
		System.out.println(p);
		
	}

}
