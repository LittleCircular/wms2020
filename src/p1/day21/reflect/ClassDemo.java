package p1.day21.reflect;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ClassDemo {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("e:/path.txt")));
			String path = br.readLine();
			Class<?> strCls = Class.forName(path);
			System.out.println("strCls:" + strCls);
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
