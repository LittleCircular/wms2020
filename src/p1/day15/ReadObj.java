package p1.day15;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObj {

	public static void main(String[] args) {
		ObjectInputStream ois = null;
		try {
			FileInputStream fis = new FileInputStream("e:/obj.imp");
			ois = new ObjectInputStream(fis);
			Object per = ois.readObject();
			System.out.println(per);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			if(ois != null)
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
	}

}
