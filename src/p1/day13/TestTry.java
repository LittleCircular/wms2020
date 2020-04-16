package p1.day13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestTry {

	public static void test(){
		FileInputStream fis;
		try{
			System.out.println("0000");
			fis = new FileInputStream("e:\\abc.txt");
//			Integer.parseInt("aaa");
			System.out.println("1111");
			fis.close();
		}catch (FileNotFoundException e){
			System.out.println("2222");
			e.printStackTrace();
		}catch (IOException e){
			System.out.println("3333");
			e.printStackTrace();
		}finally{
			System.out.println("4444");
			System.out.println("必须执行的代码");
		}
	}
	
	public static void main(String[] args) {
		test();
		System.out.println("main over");
	}

}
