package p1.day12;

import java.util.ArrayList;
import java.util.List;

public class TestListRemove {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("zhangfei");
		list.add("zhangliao");
		list.add("liubei");
		list.add("zhouyu");
		list.add("liuzhang");
//		for (int i = list.size() - 1; i >= 0; i--) {
//			String name = list.get(i);
//			if (name.startsWith("zhang")) {
//				list.remove(i);//ɾ��Ԫ��ʱ���±���иı䣬�����Ԫ���±���1
//			}
//		}
		for (int i = 0; i < list.size(); i++) {
			String name = list.get(i);
			if (name.startsWith("zhang")) {
				list.remove(i);//ɾ��Ԫ��ʱ���±���иı䣬�����Ԫ���±���1
				i--;
			}
		}
		System.out.println(list);//�鿴�������ֱ�Ӵ�ӡ����
	}

}
