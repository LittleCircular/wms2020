package p1.day09.oeder;

public class Commodity {
	
	private String id;//��Ʒ���
	private String name;//��Ʒ����
	private double price;//��Ʒ�۸�
	private String address;//��Ʒ����
		
	public Commodity(String id, String name, double price, String address) {
		super();
		this.setId(id);
		this.setName(name);
		this.setPrice(price);
		this.setAddress(address);
	}
	public Commodity() {
		super();
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
	/**
	 * �õ���Ʒ�۸�
	 * @return
	 */
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		}else {
			System.out.println("�۸��������");
		}
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public int hashCode() {
		return this.getClass().hashCode() + id.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == this) return true;
		if (obj == null) return false;
		if (obj.getClass() == this.getClass()){
			Commodity c = (Commodity)obj;
			return c.id.equals(this.id);
		}
		return false;
	}
	@Override
	public String toString() {
		return "��Ʒ��ţ�" + id + ",��Ʒ���ƣ�" + name + ",��Ʒ�۸�" + price + ",��Ʒ���أ�" + address ;
	}
}
