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
//		Person per = new Person();//���Ƕ�̬��������ͨ�Ĵ�������
		Person per = new Student();//�ڴ��������ԣ�name/age/id ������3��get/set
		per.setName("zhangfei");//����ķ�����ֻҪ����Ȩ��ok��ȫ������ʹ��
		per.setAge(25);
//		per.setId(5);//�����ж���ķ���,����ʹ��
		per.test();//��д���� ���Ե��� ��������ʱ����������
		per.test2();//Person.test2() //��̬ʱ�������static������û�ж�̬Ч��
		Person p = new Person();
		if (p instanceof Student) {
			Student st1 = (Student)p;//û��id��person������ת��Student
			st1.setId(7);
			System.out.println("st1:" + st1.getId());
		}
		if (per instanceof Student) {
			Student st2 = (Student)per;//��id��person������ת��Student
			st2.setId(7);
			System.out.println("st2:" + st2.getId());
		}
		System.out.println(per instanceof Person);
		System.out.println(per instanceof Object);
//		System.out.println(per instanceof String);//û�м̳� ֱ�ӱ���
		Object obj = new Student();
		if (obj instanceof Person) {//��Ȼ instanceof Person ��������Person����
			Person pp = (Person)obj;//������ת�� Person
			System.out.println("1");
		}
	}

}
