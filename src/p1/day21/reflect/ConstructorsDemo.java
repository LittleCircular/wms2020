package p1.day21.reflect;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;

import p1.day21.entity.Student;

public class ConstructorsDemo {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("e:/path.txt")));
		String path = br.readLine();
		Class<?> cls = Class.forName(path);
		//Class 具有的方法
		Student student = (Student)cls.newInstance();//调用无参构造 new Student()
		System.out.println(student);
		
		//构造方法，具有此方法
		Constructor<?> constructor = cls.getConstructor();
		Student student2 = (Student) constructor.newInstance();//调用无参构造
		System.out.println(student2);
		
		Constructor<?> constructor2 = cls.getConstructor(String.class,int.class);
		Student student3 = (Student) constructor2.newInstance("李四",19);//调用有参构造
		System.out.println(student3);
		br.close();
	}

}
