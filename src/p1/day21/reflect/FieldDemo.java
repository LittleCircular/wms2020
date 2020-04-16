package p1.day21.reflect;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;

public class FieldDemo {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("e:/path.txt")));
		String path = br.readLine();
		Class<?> cls = Class.forName(path);
		String field = br.readLine();
		System.out.println(field);
		/*Field fie = cls.getField(field);//��ȡ���������Զ��󣬼̳е�Ҳ����
		//��������ǰClass��ʾ�����ʵ��
		//�˷����൱��cls.newInstance().name���ԣ��������ֵ
		//��Ϊname��˽�еģ������ò���
		String name = (String)fie.get(cls.newInstance());
		System.out.println(name);*/
		Field fie = cls.getDeclaredField(field);//��ȡ���������������Զ���
		//��������ǰClass��ʾ�����ʵ��
		//�˷����൱��cls.newInstance().name���ԣ��������ֵ
		//��Ϊname��˽�еģ���Ҫȡ��java�����Լ�����
		fie.setAccessible(true);
		Object obj = cls.newInstance();
		fie.set(obj, "����");
		Object name = fie.get(obj);
		System.out.println(name);
		br.close();
	}
	
}
