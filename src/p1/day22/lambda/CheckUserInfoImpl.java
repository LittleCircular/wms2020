package p1.day22.lambda;

/**
 * 
 * @Title: CheckUserInfoImpl.java
 * @Package p1.day22.lambda
 * @Description: �����û����
 * @author yuan zhigang  Email:3155799044@qq.com
 * @date 2019��12��25�� ����10:03:29
 * @version
 *
 */
public class CheckUserInfoImpl implements ICheckUserInfo {

	@Override
	public String checkUserResult(String username) {
		if("root".equalsIgnoreCase(username)){
			return "��������Ա";
		}else if ("admin".equalsIgnoreCase(username)) {
			return "����Ա";
		}else{
			return "��ͨ��Ա";
		}
	}

}
