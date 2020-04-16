package p1.day22.lambda;

public class ChangeDatasToJsonImpl implements IChangeDatasToJson{

	@Override
	public String formatDatas(String datas) {
		System.out.println("数据格式转换中...");
		return "json:" + datas;
	}

}
