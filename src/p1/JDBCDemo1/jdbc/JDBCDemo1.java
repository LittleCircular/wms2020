package p1.JDBCDemo1.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;
import p1.JDBCDemo1.entity.Teachers;
import p1.JDBCDemo1.utils.JDBC_Utils;



/**
 * 	
	DriverManager类：驱动管理类，用于注册和管理驱动
	Connection 接口：数据库连接接口
	Statement接口：操作数据库数据接口（发送SQL语句给数据软件）
	PreparedStatement接口：操作数据库数据接口（发送SQL语句给数据软件），是Statement的子类
	ResultSet接口：封装了查询结果数据的接口（封装游标的操作）
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
//		1. 加载数据库驱动
		/**
		 * 将oracle的驱动对象，添加到DriverManager中的集合中
		 */
		DriverManager.registerDriver(new OracleDriver());
//		2. 获取数据库连接对象  ， 协议+ip地址+端口+资源
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:orcl","yuanzhigang","123456");
//		3. 编写SQL语句
		String insertSQL = "insert into teacher values(1,'lilei')";
//		4. 执行SQL语句（发送SQL语句）
		Statement stat = conn.createStatement();
		int insertResult = stat.executeUpdate(insertSQL);
//		5. 处理SQL语句的执行结果（查询操作处理结果集数据）
		if(insertResult>0){
			System.out.println("insert suceess!");
		}else{
			System.out.println("insert failed!");
		}
//		6. 释放资源	
		stat.close();
		conn.close();
	}
	public static void insert2(Teachers t) throws Exception{
		t.setId(2);
		t.setName("张三");
		Connection conn = JDBC_Utils.getConnection();
//		3. 编写SQL语句
		String insertSQL = "insert into teacher values(" + t.getId()
			+ ",'" + t.getName() + "')";
//		4. 执行SQL语句（发送SQL语句）
		Statement stat = conn.createStatement();
		int insertResult = stat.executeUpdate(insertSQL);
//		5. 处理SQL语句的执行结果（查询操作处理结果集数据）
		if(insertResult>0){
			System.out.println("insert suceess!");
		}else{
			System.out.println("insert failed!");
		}
		JDBC_Utils.closeRes(conn, stat, null);
	}
}
