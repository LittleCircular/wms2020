package p1.day06;

public class Fee {

	public long f(int n){
		if(n == 1 || n == 2) return 1L;
		return f(n-1) + f(n-2);
	}
	
	public long f2(int n){
		long x = 1;
		long y = 1;
		for(int i = 0;i < n - 2;i++){
			y = y + x;
			x = y - x;
		}
		return y;
	}
	
	public static void main(String[] args) {
		Fee fee = new Fee();
		long start = System.currentTimeMillis();
		System.out.println(fee.f(50));
		
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

}
