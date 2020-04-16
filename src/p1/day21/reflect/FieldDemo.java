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
		/*Field fie = cls.getField(field);//获取公共的属性对象，继承的也可以
		//参数：当前Class表示的类的实例
		//此方法相当于cls.newInstance().name属性，获得属性值
		//因为name是私有的，所以拿不到
		String name = (String)fie.get(cls.newInstance());
		System.out.println(name);*/
		Field fie = cls.getDeclaredField(field);//获取本类中声明的属性对象
		//参数：当前Class表示的类的实例
		//此方法相当于cls.newInstance().name属性，获得属性值
		//因为name是私有的，需要取消java的语言检测机制
		fie.setAccessible(true);
		Object obj = cls.newInstance();
		fie.set(obj, "李四");
		Object name = fie.get(obj);
		System.out.println(name);
		br.close();
	}
	
}
