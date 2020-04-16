package p1.day09.oeder;

public class Oeder {
	
	private String id;//订单编号
	private static final int MAX_NUM = 20;//最大商品数量
	private int num = 0;//当前商品数量
	public Commodity[] commodity = new Commodity[MAX_NUM];//商品
	public double money = 0.0;//总金额
	private User user;//用户
	private String date;//下单时间
	
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
	 * 得到商品信息
	 */
	public void getCommodity() {
		for (int i = 0; i < num; i++) {
			System.out.println(commodity[i]);
		}
	}
	/**
	 * 得到总金额
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
	 * 添加商品
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
			System.out.println("商品满了！");
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
		return "订单：订单编号=" + id + ",商品数量=" + num + ",总金额=" + getMoney() + "\n" + user.toString() + ",下单时间=" + date;
	}
	/**
	 * 展示订单信息
	 */
	public void showMessage() {
		System.out.println(this);
		getCommodity();
	}
}
