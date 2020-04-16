package p1.day14;

import java.io.File;
import java.io.FilenameFilter;

public class TestFile {

	public static void main(String[] args) {
//		File file1 = new File("e:/BJ_BaiLiBan/JavaSE/TeacherCodes");
//		String[] list = file1.list();
//		for(String name : list) System.out.println(name);
		File file2 = new File("e:/BJ_BaiLiBan/JavaSE/TeacherCodes/day12");
		String[] list2 = file2.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".png") || name.endsWith(".jpg") || new File(dir,name).isDirectory();
			}
		});
		for(String name : list2) System.out.println(name);
	}

}
