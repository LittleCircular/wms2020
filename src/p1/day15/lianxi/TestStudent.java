package p1.day15.lianxi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestStudent {
	
	private List<Student> list = new ArrayList<Student>();
	private File file = new File("e:/student.txt");
	private BufferedReader br;
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	public void menu(){
		br = new BufferedReader(new InputStreamReader(System.in));
		PrintStream ps = null;
		try {
			ps = new PrintStream(new FileOutputStream(file,true));
			for(;;){
				System.out.println("\t������ѧ����Ϣ��\n��ʽ��(ѧ��,����,�Ա�,�绰,��������(2000-01-01))");
				String line = br.readLine();
				if ("over".equalsIgnoreCase(line)) break;
				if(line.matches("\\w{2,},\\w{1,12},((man)|(woman)),1\\d{10},\\w{4}-\\d{2}-\\d{2}")) {
					String[] str = line.split(",");
					Student st = new Student(str[0],str[1],str[2],str[3],sdf.parse(str[4]));
					list.add(st);
				}else{
					System.out.println("�������");
				}
			}
			Collections.sort(list,new Comparator<Student>() {

				@Override
				public int compare(Student s1, Student s2) {
					return s1.getName().compareTo(s2.getName());
				}
				
			});
			ps.println(list);
		} catch (IOException e) {
			e.printStackTrace();
		}catch (ParseException e) {
			e.printStackTrace();
		}finally{
			try {
				if(br != null) br.close();
				if(ps != null) ps.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * ��ʼ��list
	 */
	public void updatalist(){
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			for (; ; ) {
				String line = br.readLine();
				if (line == null) {
					break;
				}else{
					String[] str = line.split(",");
					Student stu = new Student(str[0],str[1],str[2],str[3],sdf.parse(str[4]));
					list.add(stu);
				}
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ��name����List����ӡ
	 */
	public void getLists(){
		for (Student st : list) {
			System.out.println(st);
		}
	}
}
