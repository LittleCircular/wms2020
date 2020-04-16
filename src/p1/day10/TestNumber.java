package p1.day10;

import java.math.BigDecimal;

public class TestNumber {

	public static void main(String[] args) {
//		long x = 12222222222222222222222222L;
		BigDecimal bd1 = new BigDecimal("12222222222222222222222222");
		BigDecimal bd2 = new BigDecimal("12222222222222222222222222");
		BigDecimal bd3 = bd1.add(bd2);//超大数字的算术运算
		System.out.println(bd3);
		BigDecimal bd4 = new BigDecimal(0.1);//官方的代码有坑，用double做参数
		BigDecimal bd5 = new BigDecimal(0.2);
		BigDecimal bd6 = bd4.add(bd5);
		System.out.println(bd6.doubleValue());
		BigDecimal bd7 = new BigDecimal("0.1");//用String做参数 可以搞定
		BigDecimal bd8 = new BigDecimal("0.2");
		BigDecimal bd9 = bd7.add(bd8);
		System.out.println(bd9.doubleValue());
		BigDecimal bda = new BigDecimal(0.1);
		BigDecimal bdb = new BigDecimal(0.3);//保留小数点后十位，四舍五入
		BigDecimal bdc = bda.divide(bdb,10,BigDecimal.ROUND_HALF_UP);
		BigDecimal bdd = bda.multiply(bdb);
		BigDecimal bde = bd7.subtract(bd8);
		System.out.println(bdc.doubleValue());
		System.out.println(bdd.doubleValue());
		System.out.println(bde.doubleValue());
	}

}
