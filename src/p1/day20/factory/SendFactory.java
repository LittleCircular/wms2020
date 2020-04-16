package p1.day20.factory;

/**
 * 
 * @Title: SendFactory.java
 * @Package p1.day20.factory
 * @Description: 静态工厂方法模式
 * @author yuan zhigang  Email:3155799044@qq.com
 * @date 2019年12月23日 下午8:08:19
 * @version 1.0
 *
 */
public class SendFactory {
	
	public static Sender produceMail(){
			return new MailSender();
	}
	
	public static Sender produceSms(){
		return new MailSender();
	}
}
