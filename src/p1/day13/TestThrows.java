package p1.day13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestThrows {

	public static void test() throws FileNotFoundException,IOException{
		FileInputStream fis = new FileInputStream("e:\\abc.txt");
		fis.close();
		throw new IOException("123");
	}
	
	public static void main(String[] args) {
		try{
			test();
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}
		System.out.println("main over");
	}

}
