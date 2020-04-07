package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo4 {

	public static void main(String[] args) {
		ArrayList<String> addresses = new ArrayList<String>();
		addresses.add("서울 1");
		addresses.add("서울 2");
		addresses.add("인천 2");
		addresses.add("인천 1");
		addresses.add("전라도 1");
		addresses.add("경상도 2");
		addresses.add("경상도 1");
		addresses.add("충청도 3");
		addresses.add("강원도 4");
		addresses.add("강원도 1");

		HashMap<String, Integer> result = new HashMap<String, Integer>();
		for (String addr : addresses) {
			int endPoint = addr.indexOf(" ");
			String sido = addr.substring(0, endPoint);
//			System.out.println(sido);
			if(result.containsKey(sido)) {
				int count = result.get(sido);
				result.put(sido, count+1);
			} else {
				result.put(sido, 1);
			}
//			System.out.println(result);
		}
		
		Set<Entry<String, Integer>> sets = result.entrySet();
		for (Entry<String, Integer> set : sets) {
			String key = set.getKey();
			int value = set.getValue();
			System.out.println(key +": " + value);
		}
	}
}
