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
		//Class ���еķ���
		Student student = (Student)cls.newInstance();//�����޲ι��� new Student()
		System.out.println(student);
		
		//���췽�������д˷���
		Constructor<?> constructor = cls.getConstructor();
		Student student2 = (Student) constructor.newInstance();//�����޲ι���
		System.out.println(student2);
		
		Constructor<?> constructor2 = cls.getConstructor(String.class,int.class);
		Student student3 = (Student) constructor2.newInstance("����",19);//�����вι���
		System.out.println(student3);
		br.close();
	}

}
