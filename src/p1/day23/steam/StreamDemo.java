package p1.day23.steam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.addAll(Arrays.asList("北京","天津","南京","东京","西京","普京"));
		/**
		 * 集合数据聚合、批处理
		 * 
		 * 流程复杂
		 */
		for (String name : list) {
			if(name.contains("京")){
				System.out.println("for:" + name);
			}
		}
		/**
		 * 迭代器实现
		 * 
		 * 流程复杂
		 */
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String name = it.next();
			if(name.contains("津")){
				System.out.println("Iterator:" + name);
			}
		}
		/**
		 * Stream流处理
		 */
//		List<String> list2 = list.stream().filter(name -> name.contains("京")).collect(Collectors.toList());
		System.out.println(list.stream().filter(name -> name.contains("京")).collect(Collectors.toList()));
	}
	
}
