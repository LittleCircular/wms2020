package p1.day22.lambda;

/**
 * @Title: ICheckUserInfo.java
 * @Package p1.day22.lambda
 * @Description: 验证用户信息
 * @author yuan_zhigang  Email:3155799044@qq.com 
 * @date 2019年12月25日 下午2:13:52
 * @version
 *
 */
@FunctionalInterface
public interface ICheckUserInfo {

	/**
	 * @Title: checkUserResult
	 * @Description: 验证用户信息，返回用户身份
	 * @param @param username
	 * @param @return 参数
	 * @return String 返回类型
	 */
	String checkUserResult(String username);
	
	/**
	 * 
	 * @Title: grtUserAllInfo
	 * @Description: 获取用户的详细信息
	 * @param @param username
	 * @param @return 参数
	 * @return String 返回类型
	 * @throws
	 */
	default String getUserAllInfo(String username){
		if("root".equalsIgnoreCase(username)){
			return "超级管理员的详细信息...";
		}else if ("admin".equalsIgnoreCase(username)) {
			return "管理员的详细信息...";
		}else{
			return "非管理员的详细信息...";
		}
	}
	
}
