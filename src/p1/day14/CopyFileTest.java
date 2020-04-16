package p1.day14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileTest {
	
	public void copyFile(String file,String newfile){
		File file1 = new File(file);
		if(!file1.exists()){
			System.out.println("源文件不存在，无法完成拷贝");
			return;
		}
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(file1);
			fos = new FileOutputStream(newfile);
			byte[] data = new byte[1024];
			while(true){
				int res = fis.read(data);
				if(res == -1) break;
				fos.write(data,0,res);
			}
			fis.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("复制完成");
	}
	
	public static void main(String[] args) {
		CopyFileTest cf = new CopyFileTest();
		cf.copyFile("E:/BJ_BaiLiBan/JavaSE/TeacherCodes/day12/迭代器.png" , "E:/BJ_BaiLiBan/JavaSE/TeacherCodes/day12/迭代器2.png");
	}
}
