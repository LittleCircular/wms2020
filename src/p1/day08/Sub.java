package p1.day08;

public class Sub extends Super {
    int c = 100;
    {
    	System.out.println("{Sub}:a="+a+",b="+b+",c="+c);// 3  30  100
    	b = 40;
    	a = 4;
    	c = 200;
    }
    public Sub() {
    	System.out.println("Sub() :a="+a+",b="+b); // 4 40 200
    	a = 5;
    	b = 50;
    	c = 300;
    }
}
