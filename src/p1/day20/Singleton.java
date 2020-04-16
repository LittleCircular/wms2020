package p1.day20;

/**
 * 
 * @Title: Singleton.java
 * @Package p1.day20
 * @Description: 单例模式
 * @author yuan zhigang  Email:3155799044@qq.com
 * @date 2019年12月23日 下午2:57:05
 * @version 1.0
 *
 */
public class Singleton {
//饿汉式
	/**
	 * 私有化构造器
	 */
	private Singleton(){
		
	}
	
	/**
	 * 在当前类中调用构造方法实例化对象
	 */
	private static Singleton manager = new Singleton();
	
	/**
	 * 在当前类中创建方法，返回当前类的实例
	 * @return manager
	 */
	public static Singleton getInstance(){
		return manager;
	}
/*完整懒汉式
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
