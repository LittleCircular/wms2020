package p1.day10.oeder;

public class TestOeder {

	public static void main(String[] args) {
		User u = new User("�ŷɹ��Ա�", "123" ,"1392345678", "����������Ӫ");
		Commodity c1 = new Commodity("10001", "ţ��", 200.0, "�ܲټ�");
		Commodity c2 = new Commodity("10002", "ţ��", 200.0, "�ܲټ�");
		Oeder o = new Oeder("1001", u, "2019.10.13-16:26:38");
		o.addCommodity(c1);
		o.addCommodity(c2);
		o.showMessage();
	}

}
