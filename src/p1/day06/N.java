package p1.day06;

public class N {

	public long get(long n){ //获取n的阶乘
		if(n <= 0) return -1L;
		if(n == 1) return  1L;//退出的条件
		return n * get(n-1);//返回  n * n - 1 的阶乘
	}
	public static void main(String[] args) {
		N n = new N();
		//long res = n.get(10);
		System.out.println(n.get(10));
	}

}
