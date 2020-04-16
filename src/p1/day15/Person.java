package p1.day15;

public class Person implements java.io.Serializable{
	private static final long serialVersionUID = 3575096904871042350L;
	private int age;
	private String name;
	private String sex;
	
	public Person() {
		this(25,"zhangfei","nan");
	}
	public Person(int age, String name, String sex) {
		super();
		this.setAge(age);
		this.setName(name);
		this.setSex(sex);
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@Override
	public int hashCode() {
		return this.getClass().hashCode() + name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", sex=" + sex + "]";
	}
	
	
}
