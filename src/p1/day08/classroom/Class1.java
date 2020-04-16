package p1.day08.classroom;

/**
 * 
 * @Title: Class1.java
 * @Package p1.day08.classroom
 * @Description: 教室类，初始化教室属性
 * @author yuan zhigang  Email:3155799044@qq.com
 * @date 2019年12月4日 下午9:14:22
 * @version
 *
 */

public class Class1 {

	private int Cid;//教室编号
	private static Teacher teacher;//老师
	private int studentNum = 0;//学生人数
	private Student student;
	private Student[] students = new Student[studentNum];//学生
	
	public Class1() {
		super();
	}
	public Class1(int cid) {
		super();
		this.setCid(cid);
	}
	/**
	 * 得到教室编号
	 * @return
	 */
	public int getCid() {
		return Cid;
	}
	/**
	 * 设置教室编号
	 * @param cid
	 */
	public void setCid(int cid) {
		if (cid > 0 && cid < 99) {
			Cid = cid;
		}else{
			System.out.println("教室id输入错误！");
		}
	}
	/**
	 * 得到老师对象
	 * @return
	 */
	public static Teacher getTeacher() {
		return teacher;
	}
	/**
	 * 设置老师
	 * @param teacher
	 */
	public static void setTeacher(Teacher teacher) {
		Class1.teacher = teacher;
	}
	/**
	 * 得到学生人数
	 * @return
	 */
	public int getStudentNum() {
		return studentNum;
	}
	/**
	 * 添加学生
	 * @param student
	 */
	public void addStudent(Student student) {
		for (int i = 0; i < students.length; i++) {
			students[i] = student;
		}
	}
	/**
	 * 删除学生
	 * @param student
	 */
	public void delStudent(int studentNum) {
		
	}
	
	/**
	 * 打印学生信息
	 * @return
	 */
	public void getStudensMessage(){
		for (int i = 0; i < students.length; i++) {
			students[i].getMessage();
		}
	}
	
	/**
	 * 返回班级信息
	 * @return
	 */
	public void getMessage(){
		System.out.println("教室编号：" + Cid + "\t老师名字：" + teacher.getName() 
	       + "\t老师学科：" + teacher.getSubject()
	       + "\t老师电话：" + teacher.getPhone()
	       + "\t老师工资：" + teacher.getSalary()
	       + "\t学生人数：" + studentNum); 
		getStudensMessage();
	}
}
