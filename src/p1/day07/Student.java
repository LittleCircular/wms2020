package p1.day07;

public class Student extends Person{

	public Student(){
		//super();//��λ������޲ι���
		super("liubei",40);
		System.out.println("Student()......");
	}
	
	public static void main(String[] args) {
		Student st = new Student(); //ϵͳĬ���ṩ�޲ι���
		st.setName("˧��");
		st.setAge(25);
		System.out.println(st.getName());//���Ա��̳���
		System.out.println(st.getAge()); //�������̳���
		//st.test(); //˽�з��� �̳в�����
		//Student st2 = new Student("��Ů",25);//���췽�� ���ܱ��̳�
	}

}
