package p1.day21.reflect;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MethodDemo {

	public static void main(String[] args) throws Exception {
		//1.获取对象
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("e:/path.txt")));
		String path = br.readLine();
		Class<?> cls = Class.forName(path);
		
		//2.获取构造器对象
		Constructor<?> ct = cls.getConstructor(String.class,int.class);
		
		//3.实例化对象
		Object obj = ct.newInstance("wangwu",20);
		
		/**
		 * 获取方法对象
		 * 参数一：方法名称
		 * 参数二：参数列表的Class对象，可变参数
		 */
		Method getNameMethod = cls.getMethod("getName");
		
		//调用方法，执行方法
		Object name = getNameMethod.invoke(obj);
		System.out.println(name);
	}
	
}
