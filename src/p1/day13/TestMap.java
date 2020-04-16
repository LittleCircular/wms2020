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
		Set<String> keys = map.keySet();//返回包括所有key的Set
//		Set<Map.Entry<String,Integer>> ss =map.entrySet();//返回包含所有键值对的Set//Map.Entry<String,Integer>是一个键值对
//		Iterator<Map.Entry<String,Integer>> it = ss.iterator();//返回一个ss的迭代器//it的每个元素是一个键值对
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
