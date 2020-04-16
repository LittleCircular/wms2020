package p1.day23.steam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDemo3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.addAll(Arrays.asList("����","���","�Ͼ�","����","����","�վ�"));
		
		//1.��ȡStream
//		Stream stream = list.stream();
//		stream = stream.map(li -> "didi:" + li);
//		List<String> result = (List<String>) stream.collect(Collectors.toList());
		//��
		List<String> result = (List<String>) list.stream().map(li -> "didi:" + li).collect(Collectors.toList());
		System.out.println(result);
		/**
		 * filter������Predicate
		 */
		
//		List<String> result2 = list.stream().map(li -> "�У�" + li).filter(li -> li.contains("��")).collect(Collectors.toList());
//		System.out.println(result2);
		//��
		System.out.println(list.stream().map(li -> "�У�" + li).filter(li -> li.contains("��")).collect(Collectors.toList()));
		/**
		 * forEach����ǿѭ��
		 */
		list.forEach(li -> System.out.println("forEach:"+list));
		list.forEach(System.out :: println);
		
		/**
		 * ��ε�������
		 * peek()
		 */
		list.stream()
		.peek(li -> System.out.println("����1��" + li))
		.peek(li -> System.out.println("����2��" + li))
		.forEach(System.out :: println);
		
		/**
		 * ��״̬���м����
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
