package p1.day07;

public class Singleton {
//����ʽ
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
//����ʽ
	/*
	private static Singleton sin = new Singleton();

	private Singleton(){
	
	}

	public static Singleton getInstance(){
			return sin;
	}*/
}


