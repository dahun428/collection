package map;

import java.util.HashMap;

public class HashMapDemo1 {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("dahun428", "정다훈");
		map.put("dahun427", "다훈");
		map.put("dahun425", "훈");
		map.put("dahun424", "정다훈");
		
		String a = map.get("dahun428");
		System.out.println(a);

		boolean exist = map.containsKey("dahun424");
		System.out.println(exist);
		
		int size = map.size();
		System.out.println(size);
		
		map.remove("dahun424");
		int size1 = map.size();
		System.out.println(size1);
		System.out.println(map);
		

		
		
		
	}
}
