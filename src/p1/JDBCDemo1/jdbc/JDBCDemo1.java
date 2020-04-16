package p1.JDBCDemo1.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;
import p1.JDBCDemo1.entity.Teachers;
import p1.JDBCDemo1.utils.JDBC_Utils;



/**
 * 	
	DriverManager�ࣺ���������࣬����ע��͹�������
	Connection �ӿڣ����ݿ����ӽӿ�
	Statement�ӿڣ��������ݿ����ݽӿڣ�����SQL�������������
	PreparedStatement�ӿڣ��������ݿ����ݽӿڣ�����SQL�����������������Statement������
	ResultSet�ӿڣ���װ�˲�ѯ������ݵĽӿڣ���װ�α�Ĳ�����
 *
 */
public class JDBCDemo1 {
	
	public static void main(String[] args) throws Exception {
		Teachers t = new Teachers();
		//		registerManagerMethod1();
//		registerManagerMethod2();
		insert2(t);
//		delete("wangayi");
//		Teacher teacher = new Teacher();
//		teacher.setAge(58);
//		teacher.setId(2);
//		teacher.setName("liuayi");
//		update(teacher);
	}
	
	public static void insert() throws Exception{
//		1. �������ݿ�����
		/**
		 * ��oracle������������ӵ�DriverManager�еļ�����
		 */
		DriverManager.registerDriver(new OracleDriver());
//		2. ��ȡ���ݿ����Ӷ���  �� Э��+ip��ַ+�˿�+��Դ
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:orcl","yuanzhigang","123456");
//		3. ��дSQL���
		String insertSQL = "insert into teacher values(1,'lilei')";
//		4. ִ��SQL��䣨����SQL��䣩
		Statement stat = conn.createStatement();
		int insertResult = stat.executeUpdate(insertSQL);
//		5. ����SQL����ִ�н������ѯ���������������ݣ�
		if(insertResult>0){
			System.out.println("insert suceess!");
		}else{
			System.out.println("insert failed!");
		}
//		6. �ͷ���Դ	
		stat.close();
		conn.close();
	}
	public static void insert2(Teachers t) throws Exception{
		t.setId(2);
		t.setName("����");
		Connection conn = JDBC_Utils.getConnection();
//		3. ��дSQL���
		String insertSQL = "insert into teacher values(" + t.getId()
			+ ",'" + t.getName() + "')";
//		4. ִ��SQL��䣨����SQL��䣩
		Statement stat = conn.createStatement();
		int insertResult = stat.executeUpdate(insertSQL);
//		5. ����SQL����ִ�н������ѯ���������������ݣ�
		if(insertResult>0){
			System.out.println("insert suceess!");
		}else{
			System.out.println("insert failed!");
		}
		JDBC_Utils.closeRes(conn, stat, null);
	}
}
