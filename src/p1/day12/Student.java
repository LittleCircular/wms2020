package p1.day12;

public class Student implements Comparable<Student>{
	private int id;
	private String name;
	
	public Student() {
		super();
	}
	public Student(int id, String name) {
		super();
		this.setId(id);
		this.setName(name);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		System.out.println("hashCode()..." + id);
		return this.getClass().hashCode() + id;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		System.out.println(this.id + "equals()" + other.id);
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student o) {
		System.out.println(this.id + "compareTo" + o.id);
		return this.id - o.id;
//		return this.name.compareTo(s.name);
	}
	
}
