package p1.day08;

public class Student extends Person{

	private int id = 1;
	
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	
	public void test(){
		System.out.println("Student test");
	}
	public static void test2(){
		System.out.println("Student test2");
	}
	
	public static void main(String[] args) {
//		Person per = new Person();//不是多态，就是普通的创建对象
		Person per = new Student();//内存中有属性：name/age/id 方法：3对get/set
		per.setName("zhangfei");//父类的方法，只要访问权限ok，全部可以使用
		per.setAge(25);
//		per.setId(5);//子类中定义的方法,不能使用
		per.test();//重写方法 可以调用 ，但运行时按子类运行
		per.test2();//Person.test2() //多态时如果遇到static方法，没有多态效果
		Person p = new Person();
		if (p instanceof Student) {
			Student st1 = (Student)p;//没有id的person不可能转成Student
			st1.setId(7);
			System.out.println("st1:" + st1.getId());
		}
		if (per instanceof Student) {
			Student st2 = (Student)per;//有id的person不可能转成Student
			st2.setId(7);
			System.out.println("st2:" + st2.getId());
		}
		System.out.println(per instanceof Person);
		System.out.println(per instanceof Object);
//		System.out.println(per instanceof String);//没有继承 直接报错
		Object obj = new Student();
		if (obj instanceof Person) {//虽然 instanceof Person ，但不是Person类型
			Person pp = (Person)obj;//但可以转成 Person
			System.out.println("1");
		}
	}

}
