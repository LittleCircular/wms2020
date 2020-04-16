package p1.day22.lambda;

/**
 * 
 * @Title: IChangeDatasToJson.java
 * @Package p1.day22.lambda
 * @Description: �����ݸ�ʽת����json��ʽ
 * @author yuan_zhigang  Email:3155799044@qq.com
 * @date 2019��12��25�� ����2:16:29
 * @version
 *
 */
@FunctionalInterface
public interface IChangeDatasToJson {

	/**
	 * @Title: formatDatas
	 * @Description: �����ݸ�ʽת����json��ʽ
	 * @param @param datas
	 * @param @return ����
	 * @return String ��������
	 * @throws
	 */
	String formatDatas(String datas);
	
	/**
	 * 
	 * @Title: cheakNull
	 * @Description: ��̬�ӿڷ���:��֤���ݵķǿ�
	 * @param @param datas
	 * @param @return ����
	 * @return boolean ��������
	 * @throws
	 */
	static boolean cheakNull(String datas){
		if(datas == null){
			return false;
		}
		return true;
	}
}
