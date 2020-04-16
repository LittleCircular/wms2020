package p1.day09.oeder;

public class Oeder {
	
	private String id;//�������
	private static final int MAX_NUM = 20;//�����Ʒ����
	private int num = 0;//��ǰ��Ʒ����
	public Commodity[] commodity = new Commodity[MAX_NUM];//��Ʒ
	public double money = 0.0;//�ܽ��
	private User user;//�û�
	private String date;//�µ�ʱ��
	
	public Oeder() {
		super();
	}
	public Oeder(String id, User user, String date) {
		super();
		this.setId(id);
		this.setUser(user);
		this.setDate(date);
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * �õ���Ʒ��Ϣ
	 */
	public void getCommodity() {
		for (int i = 0; i < num; i++) {
			System.out.println(commodity[i]);
		}
	}
	/**
	 * �õ��ܽ��
	 * @return
	 */
	public double getMoney(){
		for (int i = 0; i < num; i++) {
			money += commodity[i].getPrice();
		}
		return money;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * �����Ʒ
	 * @param commodity
	 */
	public void addCommodity(Commodity commodity){
		if (num != MAX_NUM) {
			for (int i = 0; i < this.commodity.length; i++) {
				if (this.commodity[i] == null) {
					this.commodity[i] = commodity;
					num++;
					break;
				}
			}
		}else{
			System.out.println("��Ʒ���ˣ�");
		}
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
			Oeder o = (Oeder)obj;
			return o.id.equals(this.id);
		}
		return false;
	}
	@Override
	public String toString() {
		return "�������������=" + id + ",��Ʒ����=" + num + ",�ܽ��=" + getMoney() + "\n" + user.toString() + ",�µ�ʱ��=" + date;
	}
	/**
	 * չʾ������Ϣ
	 */
	public void showMessage() {
		System.out.println(this);
		getCommodity();
	}
}
