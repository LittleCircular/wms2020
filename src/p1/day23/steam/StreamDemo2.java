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
		//һ��������Դ��ȡStream
		//�����ȡStream
		String[] arrays = new String[]{"����","С��","����"};
		Stream<String> streamArray = Arrays.stream(arrays);
		
		List<String> list = new ArrayList<>();
		list.addAll(Arrays.asList("����","���","�Ͼ�","����","����","�վ�"));
		//�б��ȡStream
		Stream<String> streamList = list.stream();
		
		//set���ϻ�ȡStream��listһ��
		
		//map��ȡStream
		Map<String,String> map = new HashMap<>();
		map.put("��", "���");
		map.put("��", "���");
		
		Stream<?> streamMap = map.entrySet().stream();
		
		//��������Stream�ĸ���APIʵ�����ݵ���������
		
		//�������ش�����
		//��Streamת����������
		Object[] objArray = streamArray.toArray();
		List<String> listResult = streamList.collect(Collectors.toList());
		Set<String> setResult = (Set<String>) streamList.collect(Collectors.toSet());
		Map collect = (Map<String, String>) streamMap.collect(Collectors.toMap(k -> k, v -> v));
	}
	
}
