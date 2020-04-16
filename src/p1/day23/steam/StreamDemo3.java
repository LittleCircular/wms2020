package p1.day23.steam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDemo3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.addAll(Arrays.asList("北京","天津","南京","东京","西京","普京"));
		
		//1.获取Stream
//		Stream stream = list.stream();
//		stream = stream.map(li -> "didi:" + li);
//		List<String> result = (List<String>) stream.collect(Collectors.toList());
		//串
		List<String> result = (List<String>) list.stream().map(li -> "didi:" + li).collect(Collectors.toList());
		System.out.println(result);
		/**
		 * filter方法：Predicate
		 */
		
//		List<String> result2 = list.stream().map(li -> "中：" + li).filter(li -> li.contains("京")).collect(Collectors.toList());
//		System.out.println(result2);
		//串
		System.out.println(list.stream().map(li -> "中：" + li).filter(li -> li.contains("京")).collect(Collectors.toList()));
		/**
		 * forEach的增强循环
		 */
		list.forEach(li -> System.out.println("forEach:"+list));
		list.forEach(System.out :: println);
		
		/**
		 * 多次迭代处理
		 * peek()
		 */
		list.stream()
		.peek(li -> System.out.println("处理1：" + li))
		.peek(li -> System.out.println("处理2：" + li))
		.forEach(System.out :: println);
		
		/**
		 * 有状态的中间操作
		 */
		System.out.println("--------------------------");
		System.out.println(list);
		list.stream().skip(3).forEach(System.out::println);
		
		System.out.println("--------------------------");
		list.stream().skip(3).limit(2).distinct().forEach(System.out::println);
		
		/**
		 * max/min
		 * 
		 */
		Optional optional = list.stream().max((x,y)->y.compareTo(x));
		System.out.println("max:"+optional.get());
		
	}

}
