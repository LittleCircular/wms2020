package p1.day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("one",1);
		map.put("two",2);
		map.put("three",3);
		map.put("four",4);
		System.out.println(map);
		map.remove(new String("two"));
		Set<String> keys = map.keySet();//���ذ�������key��Set
//		Set<Map.Entry<String,Integer>> ss =map.entrySet();//���ذ������м�ֵ�Ե�Set//Map.Entry<String,Integer>��һ����ֵ��
//		Iterator<Map.Entry<String,Integer>> it = ss.iterator();//����һ��ss�ĵ�����//it��ÿ��Ԫ����һ����ֵ��
//		while(it.hasNext()){
//			Map.Entry<String, Integer> ms =it.next();
//			System.out.println(ms.getKey()+" : "+ms.getValue());
//		}
//		for (Map.Entry<String,Integer> ms : ss) {
//			System.out.println(ms.getKey()+" : "+ms.getValue());
//		}
		for (String key : keys) {
			Integer value = map.get(key);
			System.out.println(key + "=" + value);
		}
	}

}
