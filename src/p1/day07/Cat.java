package p1.day07;

public class Cat extends Animal{

	@Override//确保下一个方法是 重写的方法
	public Number shout(){//方法重写
		System.out.println("miao...");
		return 1;
	}
	
	public void  test(){//新方法，因为 private 方法无法继承，不存在重写
		System.out.println("public test Cat");
	}
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.shout();
		cat.test();
	}

}
