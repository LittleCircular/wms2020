package p1.day15;

import java.io.IOException;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class WriteInt {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("e:/int.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			int x = 97;
			dos.writeInt(x);
			fos.close();
			dos.close();//使用包装流时，只关闭最外层的包装流即可
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
