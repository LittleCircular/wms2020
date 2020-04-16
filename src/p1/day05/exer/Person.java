package p1.day05.exer;

public class Person {

	String name;//姓名
	int age;//年龄
	
	public Person(){
//		name = "chushizhi";
//		age = 0;
		//调用有参构造
//		System.out.println("这行不行");
		this("chushihua",0);//this(参数)，可以调用本类的构造方法，但只能出现在第一行
		System.out.println("下面随便写");
	}
	
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public void eat(String st){
		System.out.println("吃了" + st);
	}
	public void print(){
		System.out.println("姓名：" + name + "，年龄：" + age);
	}
	
}
