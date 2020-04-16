package p1.day22.lambda;

/**
 * @Title: ICheckUserInfo.java
 * @Package p1.day22.lambda
 * @Description: ��֤�û���Ϣ
 * @author yuan_zhigang  Email:3155799044@qq.com 
 * @date 2019��12��25�� ����2:13:52
 * @version
 *
 */
@FunctionalInterface
public interface ICheckUserInfo {

	/**
	 * @Title: checkUserResult
	 * @Description: ��֤�û���Ϣ�������û����
	 * @param @param username
	 * @param @return ����
	 * @return String ��������
	 */
	String checkUserResult(String username);
	
	/**
	 * 
	 * @Title: grtUserAllInfo
	 * @Description: ��ȡ�û�����ϸ��Ϣ
	 * @param @param username
	 * @param @return ����
	 * @return String ��������
	 * @throws
	 */
	default String getUserAllInfo(String username){
		if("root".equalsIgnoreCase(username)){
			return "��������Ա����ϸ��Ϣ...";
		}else if ("admin".equalsIgnoreCase(username)) {
			return "����Ա����ϸ��Ϣ...";
		}else{
			return "�ǹ���Ա����ϸ��Ϣ...";
		}
	}
	
}
