package p1.day11;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("zhangfei");
		list.add("lvbu");
//		list.add(30);//��ŵĲ���int,����Integer,�Զ�װ��
		list.add("guanyu");
		list.remove(1);
		for (int i = 0; i < list.size(); i++) {
//			Object obj = list.get(i);
			String obj = list.get(i);//�����Ժ���Ҫ��ǿת��������Ч��
			System.out.println(obj);
		}
	}

}
