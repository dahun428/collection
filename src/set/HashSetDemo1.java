package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {
		
		HashSet<String> names = new HashSet<String>();
		names.add("김부장");
		names.add("정차장");
		names.add("권박사");
		names.add("권박사");
			names.add("권박사");
		names.add("한대리");
		names.add("이과장");
		names.add("서사원");
		
//		System.out.println(names);
//		for(String name : names) {
//			System.out.println(name);
//		}
//		
		Iterator<String> iter = names.iterator();
		while(iter.hasNext()) {
			String x = iter.next();
			System.out.println(x);
		}
		
		
		
	}
}
