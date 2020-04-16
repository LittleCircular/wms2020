package p1.day09;

public class Gold implements Jin,Money{

	@Override
	public void buy() {//接口中的方法 默认都是 public abstract的
		System.out.println("买");
	}
	
	@Override
	public void shine() {
		System.out.println("光");
	}
	
	
	public static void main(String[] args) {
		System.out.println(Jin.X);
		Jin jin = new Gold();//把黄金当成金属在使用
		jin.shine();
		Money money = new Gold();//当货币使用
		money.buy();
	}

}
