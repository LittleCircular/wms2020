package p1.day06;

public class Add {

	public int add(int a, int b){//��������
		return a + b ;
	}
	public double add(double x, double y){//��������
		return x + y ;
	}
	public static void main(String[] args) {
		Add ad = new Add();
		System.out.println(ad.add(3,2));
		System.out.println(ad.add(3.0, 2.0));
	}

}
