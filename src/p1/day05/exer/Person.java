package p1.day05.exer;

public class Person {

	String name;//����
	int age;//����
	
	public Person(){
//		name = "chushizhi";
//		age = 0;
		//�����вι���
//		System.out.println("���в���");
		this("chushihua",0);//this(����)�����Ե��ñ���Ĺ��췽������ֻ�ܳ����ڵ�һ��
		System.out.println("�������д");
	}
	
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public void eat(String st){
		System.out.println("����" + st);
	}
	public void print(){
		System.out.println("������" + name + "�����䣺" + age);
	}
	
}
