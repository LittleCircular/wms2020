package p1.day08.classroom;

/**
 * 
 * @Title: Person.java
 * @Package p1.day08.classroom
 * @Description: Student��Teacher�ĸ��࣬��ʼ����ʦ��ѧ�����е�����
 * @author yuan zhigang  Email:3155799044@qq.com
 * @date 2019��12��4�� ����8:38:05
 * @version
 *
 */

public class Person {

	private String name;//����
	private String subject;//ѧ��
	private String phone;//�ֻ���
	
	
	
	public Person() {
		super();
	}
	public Person(String name, String subject, String phone) {
		super();
		this.setName(name);
		this.setSubject(subject);
		this.setPhone(phone);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name != null) {
			this.name = name;
		}else{
			System.out.println("������������");
		}
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		if (subject != null) {
			this.subject = subject;
		}else{
			System.out.println("������ѧ�ƣ�");
		}
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
			this.phone = phone;
	}
	
	/**
	 * ������Ϣ
	 * @return
	 */
	public String getMessage(){
		return "������" + name + "ѧ�ƣ�" + "�绰��" + phone;
	}
	
}
