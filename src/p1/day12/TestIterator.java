package p1.day12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestIterator {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("lvbu");
		set.add("guanyu");
		set.add("zhangfei");
		set.add("liubei");
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String st = it.next();//只能next()一次，取一个元素
			if(st == null) break;
			System.out.println(st);
		}
		it = set.iterator();
		while (it.hasNext()) {
			String st = it.next();
			if(st.startsWith("zhang")) it.remove();
			
		}
	}
}
