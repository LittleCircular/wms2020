package p1.day10;

public class Student {

	private int id;
	private String name;
	private int age;
	
	public Student() {
		super();
	}
	public Student(int id, String name,int age) {
		super();
		this.setId(id);
		this.setName(name);
		this.setAge(age);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if (id > 0) {
			this.id = id;
		}else {
			System.out.println("学号输入错误！");
		}
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
	public boolean equals(Object obj) {
		if(obj == this) return true;
		if(obj == null) return false;
		if (obj.getClass() == this.getClass()) {
			Student st = (Student)obj;
			return st.id == this.id;//用学号判断是否是同一个学生
		}
		return false;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}
