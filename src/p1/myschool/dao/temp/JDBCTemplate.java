package p1.myschool.dao.temp;

import java.sql.Connection;
import java.sql.PreparedStatement;

import p1.myschool.utils.JDBC_Utils;

/**
 * @Title: JDBCTemplate.java
 * @Package p1.myschool.dao
 * @Description: �ṩDAOImpl�з����Ĺ�������
 * @author yuan zhigang  Email:3155799044@qq.com
 * @date 2020��1��6�� ����4:08:37
 * @version
 */
public class JDBCTemplate {

	/**
	 * @Title: update
	 * @Description: ��ȡ���²����Ĺ�������
	 * @param @param updateSQL
	 * @param @param args
	 * @param @return ����
	 * @return int ��������
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
