package p1.myschool.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

/**
 * @Title: JDBC_Utils.java
 * @Package p1.JDBCDemo1.utils
 * @Description: 数据库工具类
 * @author yuan zhigang  Email:3155799044@qq.com
 * @date 2020年1月3日 下午4:17:44
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
	 * @Description: 获取数据库连接对象
	 * @param @return
	 * @param @throws Exception 参数
	 * @return Connection 返回类型
	 * @throws
	 */
	public static Connection getConnection() throws Exception{
		return DriverManager.getConnection(URL,USER,PASSWORD);
	}
	
	/**
	 * @Title: closeRes
	 * @Description: 释放资源
	 * @param @param conn
	 * @param @param stat
	 * @param @param rs
	 * @param @throws Exception 参数
	 * @return void 返回类型
	 * @throws
	 */
	public static void  closeRes(Connection conn,Statement stat,ResultSet rs) throws Exception{
		if(rs!=null)rs.close();
		if(stat!=null)stat.close();
		if(conn!=null)conn.close();
	}
}
