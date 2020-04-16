package p1.day08.classroom;

public class TestClass {

	public static void main(String[] args) {
		Class1 class1 = new Class1();
		class1.setCid(01);
		Teacher teacher = new Teacher("X老师", "javaEE", "13912345678", 8000);
		Class1.setTeacher(teacher);
//		class1.addStudent();
		
		class1.getMessage();
		Class1 class2 = new Class1();
		class2.setCid(02);
		Teacher teacher1 = new Teacher("Y老师", "javaSE", "13922345678", 7000);
		Class1.setTeacher(teacher1);
		Student student = new Student("Z学生", "javaEE", "13922245678", 001);
		class1.addStudent(student);
		
		class2.getMessage();
	}

}
