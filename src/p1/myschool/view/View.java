package p1.myschool.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import p1.myschool.entity.Student;
import p1.myschool.utils.JDBC_Utils;

public class View {
	
	public void meun() throws Exception{
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("===============��ѡ�������================\n");
			System.out.println("1����ѯѧԱ����\n2�� �鿴ѧ������\n3�� ��ѧ�Ų�ѯѧ������\n"
					+ "4�� ��������ѯѧ����Ϣ\n5���޸�ѧ����������\n6��ɾ��ѧ����Ϣ"
					+ "\n7�������꼶��¼\n0���˳�");
			System.out.println("========================================");
			int cmd = sc.nextInt();
			if (cmd == 0) {
				System.out.println("�ټ���");
				break;
			} else if (cmd == 1) {
				List<Student> ts = countStudent();
				System.out.println(ts.size());
			} else if (cmd == 2) {
				List<Student> ts = countStudent();
				for (Student student : ts) {
					System.out.println(student);
				}
			} else if (cmd == 3) {
				
				int nid = sc.nextInt();
				String sname = getName(nid);
				System.out.println(sname);
			} else if (cmd == 4) {
				System.out.println("������Ҫ��ѯ��ѧ�������ؼ��֣�");
				String nn = sc.next();
				List<Student> ts = getMessage(nn);
				for (Student student : ts) {
					System.out.println(student);
				}
			}else if (cmd == 5) {
				System.out.println("������Ҫ�޸�ѧ����id��");
//				int nid = sc.nextInt();
				
			}else if (cmd == 6) {
				System.out.println("������Ҫɾ��ѧ����id��");
				int nid = sc.nextInt();
				delete(nid);
			}else if (cmd == 7) {
				System.out.println("�������������꼶���ƣ�");
				String nn = sc.next();
				List<Student> ts = getMessage(nn);
				for (Student student : ts) {
					System.out.println(student);
				}
			}
		}
		sc.close();
	}
	
	//1,2
	public List<Student> countStudent(){
		Connection conn = null;
		PreparedStatement pre = null;
		try {
			List<Student> students = new ArrayList<>();
			conn = JDBC_Utils.getConnection();
//		3. ��дSQL���
			String selectSQL = "select * from stu";
//		4. ִ��SQL��䣨����SQL��䣩
			pre = conn.prepareStatement(selectSQL);
			ResultSet rs = pre.executeQuery(selectSQL);
//		5. ����SQL����ִ�н������ѯ���������������ݣ�
			while(rs.next()){
				int id = rs.getInt("S_ID");
				String name = rs.getString("S_NAME");
				String gender = rs.getString("S_GENDER");
				String phone = rs.getString("S_PHONE");
				String address = rs.getString("S_ADDRESS");
				String borndate = rs.getString("S_BORNDATE");
				students.add(new Student(id, name, gender, phone, address, borndate));
			}
			return students;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				JDBC_Utils.closeRes(conn, pre, null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	//3
	public String getName(int sid){
		Connection conn = null;
		PreparedStatement pre = null;
		try {
			conn = JDBC_Utils.getConnection();
//		3. ��дSQL���
			String selectSQL = "select S_NAME from stu where S_ID = ?";
//		4. ִ��SQL��䣨����SQL��䣩
			pre = conn.prepareStatement(selectSQL);
			pre.setInt(1,sid);
			ResultSet rs = pre.executeQuery(selectSQL);
//		5. ����SQL����ִ�н������ѯ���������������ݣ�
			while(rs.next()){
				String sname = rs.getString("S_NAME");
				return sname;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				JDBC_Utils.closeRes(conn, pre, null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	//4
	public List<Student> getMessage(String s){
		Connection conn = null;
		PreparedStatement pre = null;
		try {
			List<Student> students = new ArrayList<>();
			conn = JDBC_Utils.getConnection();
//		3. ��дSQL���
			String selectSQL = "select * from stu where S_name like '%?%'";
//		4. ִ��SQL��䣨����SQL��䣩
			pre = conn.prepareStatement(selectSQL);
			pre.setString(1, s);
			ResultSet rs = pre.executeQuery(selectSQL);
//		5. ����SQL����ִ�н������ѯ���������������ݣ�
			while(rs.next()){
				int id = rs.getInt("S_ID");
				String name = rs.getString("S_NAME");
				String gender = rs.getString("S_GENDER");
				String phone = rs.getString("S_PHONE");
				String address = rs.getString("S_ADDRESS");
				String borndate = rs.getString("S_BORNDATE");
				students.add(new Student(id, name, gender, phone, address, borndate));
			}
			return students;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				JDBC_Utils.closeRes(conn, pre, null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	//5���޸�ѧ����������
	public List<Student> update(String s){
		Connection conn = null;
		PreparedStatement pre = null;
		try {
			List<Student> students = new ArrayList<>();
			conn = JDBC_Utils.getConnection();
//		3. ��дSQL���
			String selectSQL = "updata from stu where S_name like '%?%'";
//		4. ִ��SQL��䣨����SQL��䣩
			pre = conn.prepareStatement(selectSQL);
			ResultSet rs = pre.executeQuery(selectSQL);
//		5. ����SQL����ִ�н������ѯ���������������ݣ�
			while(rs.next()){
				int id = rs.getInt("S_ID");
				String name = rs.getString("S_NAME");
				String gender = rs.getString("S_GENDER");
				String phone = rs.getString("S_PHONE");
				String address = rs.getString("S_ADDRESS");
				String borndate = rs.getString("S_BORNDATE");
				students.add(new Student(id, name, gender, phone, address, borndate));
			}
			return students;
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				JDBC_Utils.closeRes(conn, pre, null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	//6
	private static void delete(int sid){
		Connection conn = null;
		PreparedStatement pre = null;
		try {
			conn = JDBC_Utils.getConnection();
//		3. ��дSQL���
			String deleteSQL = "delete * from stu where S_ID = ?";
//		4. ִ��SQL��䣨����SQL��䣩
			pre = conn.prepareStatement(deleteSQL);
			pre.setInt(1, sid);
			int insertResult = pre.executeUpdate(deleteSQL);//----���²���
	//		5. ����SQL����ִ�н������ѯ���������������ݣ�
			if(insertResult>0){
				System.out.println("delete suceess!");
			}else{
				System.out.println("delete failed!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				JDBC_Utils.closeRes(conn, pre, null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
