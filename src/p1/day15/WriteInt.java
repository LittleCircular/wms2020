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
			dos.close();//ʹ�ð�װ��ʱ��ֻ�ر������İ�װ������
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
