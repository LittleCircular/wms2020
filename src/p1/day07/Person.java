package p1.day07;

public class Person {

	private String name = " ";//练习：判断name非空，实现name的封装
	private int age = 0 ;
	
	public Person() {
		System.out.println("Person()..........");
	}
	public Person(String name , int age){
		System.out.println("Person(String,int)..........");
		this.setName(name);
		this.setAge(age);
	}
	
	private void test(){ }
	
	public void setName(String name){
		if(name == null){
			System.out.println("姓名输入错误");
		}else {
			this.name = name;
		}
	}
	
	public String getName(){
		return name;
	}
	
	public void setAge(int age){//提供写数据的方法
		if(age > 0 && age < 130){
			this.age = age;
		}else {
			System.out.println("年龄输入错误");
		}
	}
	
	public int getAge(){//提供读数据的方法
		return age;
	}
	
}
