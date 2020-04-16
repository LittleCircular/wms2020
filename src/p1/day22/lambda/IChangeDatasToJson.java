package p1.day22.lambda;

/**
 * 
 * @Title: IChangeDatasToJson.java
 * @Package p1.day22.lambda
 * @Description: 将数据格式转换成json格式
 * @author yuan_zhigang  Email:3155799044@qq.com
 * @date 2019年12月25日 下午2:16:29
 * @version
 *
 */
@FunctionalInterface
public interface IChangeDatasToJson {

	/**
	 * @Title: formatDatas
	 * @Description: 将数据格式转换成json格式
	 * @param @param datas
	 * @param @return 参数
	 * @return String 返回类型
	 * @throws
	 */
	String formatDatas(String datas);
	
	/**
	 * 
	 * @Title: cheakNull
	 * @Description: 静态接口方法:验证数据的非空
	 * @param @param datas
	 * @param @return 参数
	 * @return boolean 返回类型
	 * @throws
	 */
	static boolean cheakNull(String datas){
		if(datas == null){
			return false;
		}
		return true;
	}
}
