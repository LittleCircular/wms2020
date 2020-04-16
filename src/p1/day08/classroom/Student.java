package p1.day08.classroom;

/**
 * 
 * @Title: Student.java
 * @Package p1.day08.classroom
 * @Description: ѧ���࣬��ʼ��ѧ������
 * @author yuan zhigang  Email:3155799044@qq.com
 * @date 2019��12��4�� ����9:06:13
 * @version
 *
 */

public class Student extends Person{

	private int id;//ѧ��
	
	public Student() {
		super();
	}
	public Student(String name, String subject, String phone, int id) {
		super(name, subject, phone);
		this.setId(id);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if (id > 0 && id < 999) {
			this.id = id;
		}else{
			System.out.println("ѧ���������");
		}
	}
	
	@Override
	public String getMessage() {
		return "ѧ�ţ�" + id + super.getMessage();
	}
	
}
