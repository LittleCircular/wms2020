package p1.day22.lambda;

/**
 * 
 * @Title: CheckUserInfoImpl.java
 * @Package p1.day22.lambda
 * @Description: 返回用户身份
 * @author yuan zhigang  Email:3155799044@qq.com
 * @date 2019年12月25日 下午10:03:29
 * @version
 *
 */
public class CheckUserInfoImpl implements ICheckUserInfo {

	@Override
	public String checkUserResult(String username) {
		if("root".equalsIgnoreCase(username)){
			return "超级管理员";
		}else if ("admin".equalsIgnoreCase(username)) {
			return "管理员";
		}else{
			return "普通会员";
		}
	}

}
