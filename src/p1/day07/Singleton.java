package p1.day07;

public class Singleton {
//ÀÁººÊ½
	private static Singleton sin;

	private Singleton(){
	
	}
	public static Singleton getInstance(){
		if(sin != null){
			return sin = new Singleton();
		}else{
			return sin;
		}
	}
//¶öººÊ½
	/*
	private static Singleton sin = new Singleton();

	private Singleton(){
	
	}

	public static Singleton getInstance(){
			return sin;
	}*/
}


