package p1.day07;

public class Singleton2 {
//ÀÁººÊ½
/*	private static Singleton2 sin;

	private Singleton2(){
	
	}
	public static Singleton2 getInstance(){
		if(sin != null){
			return sin = new Singleton2();
		}else{
			return sin;
		}
	}*/
//¶öººÊ½
	
	private static Singleton2 sin = new Singleton2();

	private Singleton2(){
	
	}

	public static Singleton2 getInstance(){
			return sin;
	}
}


