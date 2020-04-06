package list;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		
		/*
		 * ArrayList 특정
		 * 	1. 타입파라미터<E>는 특정타입만 저장하는 콜렉션을 생성한다.(타입 안전성)
		 * 	2. 저장소의 크기를 별도로 지정할 필요가 없다.
		 *  3. 더이상 저장할 공간이 없으면, 공간의 크기를 자동으로 조절한다.
		 *  4. 저장할 때 인덱스를 별도로 지정할 필요가 없다. (자동으로 맨 끝에 저장 된다.)
		 *	5. Enhanced-for 문을 사용해서 저장된 모든 객체를 쉽게 꺼낼 수 있다.
		 *	6. 특정 위치의 객체를 삭제하면 자동으로 그 다음에 위치하고 있는 객체들이 앞으로 이동해서 빈곳을 채운다.
		 *
		 */
		
		//ArrayList 생성하기 <-- String 객체를 담는 ArrayList 객체 생성
		ArrayList<String> list = new ArrayList<String>();
		
		//ArrayList 저장소에 String 객체 담기
		
		list.add("김차장");
		list.add("이대리");
		list.add("곽부장");
		list.add("정사원");
		list.add("유이사");
		list.add("서팀장");
		list.add("이사원");
		list.add("박사무장");
		
		//1.Enhanced - for 문 사용
		//	*조회만 가능
		//	*삭제 불가능
//		for(String name : list) {
//			System.out.println(name);
//		}
		//2.Iterator 사용
		//	* 조회, 삭제 가능
		//	* Iterator에서 삭제하면 Arraylist에서도 삭제됨.
//		Iterator<String> iter = list.iterator();
//		while(iter.hasNext()) {
//			String a = iter.next();
//			if(a.equals("박사무장")) {
//				iter.remove();
//			}
//			System.out.println(a);
//		}
//		System.out.println(list);
		//3. 일반 for문 사용(List의 자손들만 가능)
//		int length= list.size();
//		for(int i = 0 ; i < length; i++) {
//			System.out.println(list.get(i));
//		}
		
		boolean empty = list.isEmpty();
		System.out.println("isEmpty : "+empty);
		
		list.clear();
		System.out.println("clear");
		
		int size = list.size();
		System.out.println("size : " + size);
		
		boolean empty1 = list.isEmpty();
		System.out.println("isEmpty : " + empty1);
		
		
	}
}
