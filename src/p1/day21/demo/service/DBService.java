package p1.day21.demo.service;

import java.lang.reflect.Method;

import p1.day21.demo.dao.base.IJDBC;
import p1.day21.demo.factory.JDBCFactory;

/**
 * 
 * @Title: DBService.java
 * @Package p1.day21.demo.service
 * @Description: ʵ�־���ҵ��
 * @author yuan_zhigang  Email:3155799044@qq.com
 * @date 2019��12��24�� ����8:41:41
 * @version
 *
 */
public class DBService {
	
	IJDBC jIjdbc;
	
	public DBService() throws Exception{
		jIjdbc = JDBCFactory.getInstance();
		jIjdbc.getConnection();
	}
//	
//	public void service(Object request, Object response, String type) throws Exception, Exception{
//		Class cls = this.getClass();
//		Method m = cls.getMethod(type, Object.class,Object.class);
//		m.invoke(request,response);
//	}
//	
//	/**
//	 * ����
//	 */
//	public void login(Object obj1,Object obj2){
//		//1.��ȡ���ݿ����Ӷ���
//		jIjdbc.getConnection();
//		System.out.println("����ɹ�");
//	}
//	
//	/**
//	 * ע��
//	 */
//	public void register(Object obj1,Object obj2){
//		//1.��ȡ���ݿ����Ӷ���
//		jIjdbc.getConnection();
//	}
}
