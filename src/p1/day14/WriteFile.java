package p1.day14;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		try {
			//���췽������� �ļ�
			FileOutputStream fos = new FileOutputStream("e:/abc.txt",true);
			String str = "I";
			fos.write(str.getBytes());
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
