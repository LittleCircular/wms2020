package p1.day22.lambda;

public class FunctionInterDemo2 {

	public static void main(String[] args) {
		String datas = "����";
		if(IChangeDatasToJson.cheakNull(datas)){
			IChangeDatasToJson json = new ChangeDatasToJsonImpl();
			System.out.println(json.formatDatas("���"));
		}
		
		ICheckUserInfo info = new CheckUserInfoImpl();
		System.out.println(info.checkUserResult("admin"));
		System.out.println(info.getUserAllInfo("admin"));
	}

}
