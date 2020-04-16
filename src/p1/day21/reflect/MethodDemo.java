package p1.day21.reflect;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MethodDemo {

	public static void main(String[] args) throws Exception {
		//1.��ȡ����
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("e:/path.txt")));
		String path = br.readLine();
		Class<?> cls = Class.forName(path);
		
		//2.��ȡ����������
		Constructor<?> ct = cls.getConstructor(String.class,int.class);
		
		//3.ʵ��������
		Object obj = ct.newInstance("wangwu",20);
		
		/**
		 * ��ȡ��������
		 * ����һ����������
		 * �������������б��Class���󣬿ɱ����
		 */
		Method getNameMethod = cls.getMethod("getName");
		
		//���÷�����ִ�з���
		Object name = getNameMethod.invoke(obj);
		System.out.println(name);
	}
	
}
