package p1.day14;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		try {
			File file = new File("e:/abc.txt");
			if(!file.exists()){
				System.out.println("文件不存在");
				return;
			}
			FileInputStream fis = new FileInputStream(file);
			byte[] data = new byte[15];
			String str = "";
			while(true){
				int res = fis.read(data);
				if(res == -1) break;
				str = str + new String(data);
			}
			System.out.println(str);
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}