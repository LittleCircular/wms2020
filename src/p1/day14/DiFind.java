package p1.day14;

import java.io.File;

public class DiFind {

	public static void getAll(File file){
		File[] files = file.listFiles();
		for (File ff : files) {
			if (ff.isDirectory()) {//���ff�Ǹ�Ŀ¼
				System.out.println("["+ff.getName()+"]");
			getAll(ff);//��Ŀ¼�ݹ����
			}else{//ff�Ǹ��ļ�
				System.out.println(ff.getName());
			}
		}
	}
	
	public static void main(String[] args) {
		File file = new File("e:/BJ_BaiLiBan/JavaSE/TeacherCodes");
		if (file.isDirectory()) {
			getAll(file);
		}else{
			System.out.println("����Ŀ¼");
		}
	}

}
