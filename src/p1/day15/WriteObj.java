package p1.day15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class WriteObj {

	public static void main(String[] args) {
		ObjectOutputStream oos = null;
		try {
			FileOutputStream fos = new FileOutputStream("e:/obj.imp");
			oos = new ObjectOutputStream(fos);
			Person per1 = new Person(25,"guanyu","nan");
			Person per2 = new Person(22,"guanyu","nan");
			ArrayList<Person> al = new ArrayList<>();
			al.add(per1);
			al.add(per2);
			oos.writeObject(al);
			System.out.println("–¥»Î≥…π¶");
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(oos != null)
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

}
