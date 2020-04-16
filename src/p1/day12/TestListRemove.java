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
//				list.remove(i);//删除元素时，下标会有改变，后面的元素下标会减1
//			}
//		}
		for (int i = 0; i < list.size(); i++) {
			String name = list.get(i);
			if (name.startsWith("zhang")) {
				list.remove(i);//删除元素时，下标会有改变，后面的元素下标会减1
				i--;
			}
		}
		System.out.println(list);//查看结果可以直接打印集合
	}

}
