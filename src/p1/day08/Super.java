package p1.day08;

public class Super {
	static int a = 1;
    int b = 10;
    {
    	System.out.println("{Super}:a="+a+",b="+b); //1  a=1 b=10
    	b = 20;
    	a = 2;
    }
    public Super() {
    	System.out.println("Super() :a="+a+",b="+b);// a=2 b=20
    	a = 3;
    	b = 30;
    }
    
}
