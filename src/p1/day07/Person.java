package p1.day07;

public class Person {

	private String name = " ";//��ϰ���ж�name�ǿգ�ʵ��name�ķ�װ
	private int age = 0 ;
	
	public Person() {
		System.out.println("Person()..........");
	}
	public Person(String name , int age){
		System.out.println("Person(String,int)..........");
		this.setName(name);
		this.setAge(age);
	}
	
	private void test(){ }
	
	public void setName(String name){
		if(name == null){
			System.out.println("�����������");
		}else {
			this.name = name;
		}
	}
	
	public String getName(){
		return name;
	}
	
	public void setAge(int age){//�ṩд���ݵķ���
		if(age > 0 && age < 130){
			this.age = age;
		}else {
			System.out.println("�����������");
		}
	}
	
	public int getAge(){//�ṩ�����ݵķ���
		return age;
	}
	
}
