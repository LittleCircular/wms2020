package p1.day08;

public class Person {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age > 0 && age < 120) {
			this.age = age;
		}else {
			System.out.println("ÊäÈë´íÎó");
		}
	}
	
	public void test(){
		System.out.println("Person test");
	}
	public static void test2(){
		System.out.println("Person test2");
	}
}
