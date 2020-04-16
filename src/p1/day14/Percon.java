package p1.day14;

public class Percon {

	private String name;
	private int age;
	
	public Percon() throws AgeException{
		this("zhansan" , 78);
	}
	public Percon(String name, int age) throws AgeException{
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
	public void setAge(int age) throws AgeException{
		if (age > 0 && age < 120) {
			this.age = age;
		}else{
			throw new AgeException("ÄêÁäÊäÈë´íÎó");
		}
	}

	public static void main(String[] args) {
		try {
			Percon p = new Percon();
			p.setAge(-4);
		} catch (AgeException e) {
			e.printStackTrace();
		}
	}

}
