package p1.myschool.dao.factory;

import java.util.ResourceBundle;

import p1.myschool.dao.StudentDao;
import p1.myschool.dao.impl.StudentDaoOracleImpl;

/**
 * @Title: StudentDaoOracleFactory.java
 * @Package p1.myschool.dao.factory
 * @Description: StudentDaoOracle的工厂，获取一个具体的dao的实现类
 * @author yuan zhigang  Email:3155799044@qq.com
 * @date 2020年1月6日 下午3:18:49
 * @version 1.0
 */
public class StudentDaoOracleFactory {

	/**
	 * @Title: getInstens
	 * @Description: 获取一个具体的dao的实现类
	 * @param @return 参数
	 * @return StudentDao 返回类型
	 */
	public static StudentDao getInstance(){
		//反射+配置文件
		try {
			//获取资源句柄对象
			ResourceBundle rb = ResourceBundle.getBundle("p1.myschool.utils.dao");
			//获取配置文件中配置的类路径信息
			String studentDaoPath = rb.getString("studentdaoImpl");
			//通过反射的方式动态创建具体的dao实现类
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
