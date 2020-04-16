package p1.day14;

import java.io.File;

public class DiFind {

	public static void getAll(File file){
		File[] files = file.listFiles();
		for (File ff : files) {
			if (ff.isDirectory()) {//如果ff是个目录
				System.out.println("["+ff.getName()+"]");
			getAll(ff);//子目录递归操作
			}else{//ff是个文件
				System.out.println(ff.getName());
			}
		}
	}
	
	public static void main(String[] args) {
		File file = new File("e:/BJ_BaiLiBan/JavaSE/TeacherCodes");
		if (file.isDirectory()) {
			getAll(file);
		}else{
			System.out.println("不是目录");
		}
	}

}
