package p1.day15;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadInt {

	public static void main(String[] args) {
		try {
			FileInputStream fos = new FileInputStream("e:/int.txt");
			DataInputStream dos = new DataInputStream(fos);
			int x = dos.readInt();
			dos.close();//使用包装流时，只关闭最外层的包装流即可
			System.out.println(x);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
