package p1.day07;

public class Student extends Person{

	public Student(){
		//super();//定位父类的无参构造
		super("liubei",40);
		System.out.println("Student()......");
	}
	
	public static void main(String[] args) {
		Student st = new Student(); //系统默认提供无参构造
		st.setName("帅哥");
		st.setAge(25);
		System.out.println(st.getName());//属性被继承了
		System.out.println(st.getAge()); //方法被继承了
		//st.test(); //私有方法 继承不过来
		//Student st2 = new Student("美女",25);//构造方法 不能被继承
	}

}
