package p1.myschool.dao.factory;

import java.util.ResourceBundle;

import p1.myschool.dao.StudentDao;
import p1.myschool.dao.impl.StudentDaoOracleImpl;

/**
 * @Title: StudentDaoOracleFactory.java
 * @Package p1.myschool.dao.factory
 * @Description: StudentDaoOracle�Ĺ�������ȡһ�������dao��ʵ����
 * @author yuan zhigang  Email:3155799044@qq.com
 * @date 2020��1��6�� ����3:18:49
 * @version 1.0
 */
public class StudentDaoOracleFactory {

	/**
	 * @Title: getInstens
	 * @Description: ��ȡһ�������dao��ʵ����
	 * @param @return ����
	 * @return StudentDao ��������
	 */
	public static StudentDao getInstance(){
		//����+�����ļ�
		try {
			//��ȡ��Դ�������
			ResourceBundle rb = ResourceBundle.getBundle("p1.myschool.utils.dao");
			//��ȡ�����ļ������õ���·����Ϣ
			String studentDaoPath = rb.getString("studentdaoImpl");
			//ͨ������ķ�ʽ��̬���������daoʵ����
			return (StudentDao)Class.forName(studentDaoPath).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
