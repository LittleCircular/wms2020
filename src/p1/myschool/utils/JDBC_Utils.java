package p1.myschool.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

/**
 * @Title: JDBC_Utils.java
 * @Package p1.JDBCDemo1.utils
 * @Description: ���ݿ⹤����
 * @author yuan zhigang  Email:3155799044@qq.com
 * @date 2020��1��3�� ����4:17:44
 * @version
 *
 */
public class JDBC_Utils {
	
	private static final String URL;
	private static final String USER;
	private static final String PASSWORD;
	private static final String DRIVER;
	
	static{
		ResourceBundle rb = ResourceBundle.getBundle("p1.JDBCDemo1.utils.jdbc");
		URL = rb.getString("URL");
		USER = rb.getString("USER");
		PASSWORD = rb.getString("PASSWORD");
		DRIVER = rb.getString("DRIVER");
		
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @Title: getConnection
	 * @Description: ��ȡ���ݿ����Ӷ���
	 * @param @return
	 * @param @throws Exception ����
	 * @return Connection ��������
	 * @throws
	 */
	public static Connection getConnection() throws Exception{
		return DriverManager.getConnection(URL,USER,PASSWORD);
	}
	
	/**
	 * @Title: closeRes
	 * @Description: �ͷ���Դ
	 * @param @param conn
	 * @param @param stat
	 * @param @param rs
	 * @param @throws Exception ����
	 * @return void ��������
	 * @throws
	 */
	public static void  closeRes(Connection conn,Statement stat,ResultSet rs) throws Exception{
		if(rs!=null)rs.close();
		if(stat!=null)stat.close();
		if(conn!=null)conn.close();
	}
}
