package p1.day06;

public class N {

	public long get(long n){ //��ȡn�Ľ׳�
		if(n <= 0) return -1L;
		if(n == 1) return  1L;//�˳�������
		return n * get(n-1);//����  n * n - 1 �Ľ׳�
	}
	public static void main(String[] args) {
		N n = new N();
		//long res = n.get(10);
		System.out.println(n.get(10));
	}

}
