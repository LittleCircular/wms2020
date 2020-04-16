package p1.day23.steam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo2 {

	public static void main(String[] args) {
		//一、从数据源获取Stream
		//数组获取Stream
		String[] arrays = new String[]{"大乔","小乔","二乔"};
		Stream<String> streamArray = Arrays.stream(arrays);
		
		List<String> list = new ArrayList<>();
		list.addAll(Arrays.asList("北京","天津","南京","东京","西京","普京"));
		//列表获取Stream
		Stream<String> streamList = list.stream();
		
		//set集合获取Stream和list一致
		
		//map获取Stream
		Map<String,String> map = new HashMap<>();
		map.put("亮", "诸葛");
		map.put("青", "诸葛");
		
		Stream<?> streamMap = map.entrySet().stream();
		
		//二、调用Stream的各种API实现数据的批量操作
		
		//三、返回处理结果
		//从Stream转换集合数据
		Object[] objArray = streamArray.toArray();
		List<String> listResult = streamList.collect(Collectors.toList());
		Set<String> setResult = (Set<String>) streamList.collect(Collectors.toSet());
		Map collect = (Map<String, String>) streamMap.collect(Collectors.toMap(k -> k, v -> v));
	}
	
}
