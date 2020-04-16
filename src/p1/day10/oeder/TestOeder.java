package p1.day10.oeder;

public class TestOeder {

	public static void main(String[] args) {
		User u = new User("张飞逛淘宝", "123" ,"1392345678", "三国刘备军营");
		Commodity c1 = new Commodity("10001", "牛肉", 200.0, "曹操家");
		Commodity c2 = new Commodity("10002", "牛肉", 200.0, "曹操家");
		Oeder o = new Oeder("1001", u, "2019.10.13-16:26:38");
		o.addCommodity(c1);
		o.addCommodity(c2);
		o.showMessage();
	}

}
