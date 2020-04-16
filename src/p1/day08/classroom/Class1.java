package p1.day08.classroom;

/**
 * 
 * @Title: Class1.java
 * @Package p1.day08.classroom
 * @Description: �����࣬��ʼ����������
 * @author yuan zhigang  Email:3155799044@qq.com
 * @date 2019��12��4�� ����9:14:22
 * @version
 *
 */

public class Class1 {

	private int Cid;//���ұ��
	private static Teacher teacher;//��ʦ
	private int studentNum = 0;//ѧ������
	private Student student;
	private Student[] students = new Student[studentNum];//ѧ��
	
	public Class1() {
		super();
	}
	public Class1(int cid) {
		super();
		this.setCid(cid);
	}
	/**
	 * �õ����ұ��
	 * @return
	 */
	public int getCid() {
		return Cid;
	}
	/**
	 * ���ý��ұ��
	 * @param cid
	 */
	public void setCid(int cid) {
		if (cid > 0 && cid < 99) {
			Cid = cid;
		}else{
			System.out.println("����id�������");
		}
	}
	/**
	 * �õ���ʦ����
	 * @return
	 */
	public static Teacher getTeacher() {
		return teacher;
	}
	/**
	 * ������ʦ
	 * @param teacher
	 */
	public static void setTeacher(Teacher teacher) {
		Class1.teacher = teacher;
	}
	/**
	 * �õ�ѧ������
	 * @return
	 */
	public int getStudentNum() {
		return studentNum;
	}
	/**
	 * ���ѧ��
	 * @param student
	 */
	public void addStudent(Student student) {
		for (int i = 0; i < students.length; i++) {
			students[i] = student;
		}
	}
	/**
	 * ɾ��ѧ��
	 * @param student
	 */
	public void delStudent(int studentNum) {
		
	}
	
	/**
	 * ��ӡѧ����Ϣ
	 * @return
	 */
	public void getStudensMessage(){
		for (int i = 0; i < students.length; i++) {
			students[i].getMessage();
		}
	}
	
	/**
	 * ���ذ༶��Ϣ
	 * @return
	 */
	public void getMessage(){
		System.out.println("���ұ�ţ�" + Cid + "\t��ʦ���֣�" + teacher.getName() 
	       + "\t��ʦѧ�ƣ�" + teacher.getSubject()
	       + "\t��ʦ�绰��" + teacher.getPhone()
	       + "\t��ʦ���ʣ�" + teacher.getSalary()
	       + "\tѧ��������" + studentNum); 
		getStudensMessage();
	}
}
