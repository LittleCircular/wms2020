package p1.day12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("lvbu");
		set.add("guanyu");
		set.add("zhangfei");
		set.add("liubei");
		set.add("zhangfei");
		set.add(new String("zhangfei"));
		System.out.println(set);
//		Iterator<String> it = set.iterator();
//		while (it.hasNext()) {
//			String st = it.next();
//			System.out.println(st);
//		}
		for (String st : set) { //for each Ñ­»·
			System.out.println(st);
		}
	}

}
