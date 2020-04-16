package p1.myschool.dao.temp;

import java.sql.Connection;
import java.sql.PreparedStatement;

import p1.myschool.utils.JDBC_Utils;

/**
 * @Title: JDBCTemplate.java
 * @Package p1.myschool.dao
 * @Description: 提供DAOImpl中方法的公共代码
 * @author yuan zhigang  Email:3155799044@qq.com
 * @date 2020年1月6日 下午4:08:37
 * @version
 */
public class JDBCTemplate {

	/**
	 * @Title: update
	 * @Description: 提取更新操作的公共代码
	 * @param @param updateSQL
	 * @param @param args
	 * @param @return 参数
	 * @return int 返回类型
	 * @throws
	 */
	public int update(String updateSQL,Object... args){
		try {
			Connection conn = JDBC_Utils.getConnection();
			PreparedStatement pst = conn.prepareStatement(updateSQL);
			for (int i = 0; i < args.length; i++) {
				pst.setObject(i + 1, args[i]);
			}
			return pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
		
	}
	
}
