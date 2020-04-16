package p1.day23.steam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.addAll(Arrays.asList("����","���","�Ͼ�","����","����","�վ�"));
		/**
		 * �������ݾۺϡ�������
		 * 
		 * ���̸���
		 */
		for (String name : list) {
			if(name.contains("��")){
				System.out.println("for:" + name);
			}
		}
		/**
		 * ������ʵ��
		 * 
		 * ���̸���
		 */
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String name = it.next();
			if(name.contains("��")){
				System.out.println("Iterator:" + name);
			}
		}
		/**
		 * Stream������
		 */
//		List<String> list2 = list.stream().filter(name -> name.contains("��")).collect(Collectors.toList());
		System.out.println(list.stream().filter(name -> name.contains("��")).collect(Collectors.toList()));
	}
	
}
