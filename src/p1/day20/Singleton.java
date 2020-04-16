package p1.day20;

/**
 * 
 * @Title: Singleton.java
 * @Package p1.day20
 * @Description: ����ģʽ
 * @author yuan zhigang  Email:3155799044@qq.com
 * @date 2019��12��23�� ����2:57:05
 * @version 1.0
 *
 */
public class Singleton {
//����ʽ
	/**
	 * ˽�л�������
	 */
	private Singleton(){
		
	}
	
	/**
	 * �ڵ�ǰ���е��ù��췽��ʵ��������
	 */
	private static Singleton manager = new Singleton();
	
	/**
	 * �ڵ�ǰ���д������������ص�ǰ���ʵ��
	 * @return manager
	 */
	public static Singleton getInstance(){
		return manager;
	}
/*��������ʽ
	private Singleton(){
		
	}
	
	private static Singleton manager;
	
	public static Singleton getInstance(){
		if(manager == null){
			synchronized (Singleton.class){
				if(manager == null){
					manager = new Singleton();
				}
			}
		}
		return manager;
	}	
*/
}
