package p1.day21.entity;

public class Student {

	private String name = "zhangsan";
	private int age = 18;
	
	public Student() {
		super();
	}
	public Student(String name, int age) {
		super();
		this.setName(name);
		this.setAge(age);
	}
	
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
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}
