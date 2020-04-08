package sort;

import java.util.ArrayList;
import java.util.Collections;

public class SortDemo3 {
	public static void main(String[] args) {
		ArrayList<String> set = new ArrayList<String>();
		set.add("류관순");
		set.add("이순신");
		set.add("안중근");
		set.add("강감찬");
		set.add("김유신");
		set.add("김구");
		set.add("윤봉길");

		Collections.sort(set);
		for (String value : set) {
			System.out.print(value +" ");
		}
	/*
	 * 배열, 콜렉션 값 정렬하기
	 * 배열
	 * 		Arrays.sort(배열);
	 * Set
	 * 		TreeSet에 값을 저장하면 자동으로 정렬되어서 저장된다.
	 * List
	 * 		Collections.sort(리스트);
	 * 
	 * * 배열 , TreeSet , List에 저장되는 객체가 정렬되기 위해서는
	 * 	Comparable<E> 인터페이스를 구현해야한다.
	 * * Comparable<E> 인터페이스를 구현한 주요 클래스
	 * 		1. 모든 Wrapper Class ( Integer , Double, Long , Short , Byte , Float , Boolean, Character)
	 * 		2. String, Date , File
	 * 
	 * 정렬이 가능한 객체로 만들기
	 * 	Comparable<T> 인터페이스를 구현해야한다.
	 * 			-> int compareTo(T t);
	 * 	*T는 비교대상이 되는 클래스를 적는다. 비교대상을 항상 
	 * 	이 객체와 똑같은 다른 객체를 비교하는 것이기 때문에 comparable를 구현하는 클래스의 이름을 적으면된다.
	 * 	CompareTo() 메소드는 현재 객체와 다른 객체를 비교해서
	 *  	현재 객체의 값이 다른 객체의 값보다 크면 0보다 큰 정수
	 *  	현재 객체의 값과 다른 객체의 값이 같으면 0
	 *   	현재 객체의 값이 다른 객체의 값보다 작으면 0보다 작은 정수를 반환해야한다.
	 *   * 배열, List<E>, TreeSet<E> 에 저장된 객체를 정렬할 수 있다.
	 * 
	 * 작성 예)
	 * public class Score implements comparable<Score>{
	 * 
	 * compareTo(T t) 재정의하기
	 * 	public int compareTo(Score other){
	 * 
	 * 		return this.totalScore - other.totalScore;
	 * 
	 * 	}
	 * }

	 * 
	 * 	객체를 비교할 수 있는 비교기를 만들어서 객체를 정렬하기
	 * 		Compare<T> 인터페이스를 구현한 비교기를 사용해서 객체들을 정렬한다.
	 * 		int compare(T o1, T o2)
	 * 		*T는 비교대상이 되는 클래스를 적는다.
	 * 		 비교기는 비교대상이 되는 객체 2개를 전달 받아서 비교한다.
	 * 		*Arrays.sort(배열, 비교기), Coollections.sort(리스트, 비교기)
	 * 		*TreeSet<E> set = new TreeSet<E>(비교기)
	 * 
	 * 
	 * 
	 * 작성 예)
	 * 		Compare<T>
	 * 	//		Collections.sort(scores, (o1, o2)-> Integer.compare(o1.getNo(), o2.getNo()));
		//		Collections.sort(scores, (o1, o2)-> o1.getName().compareTo(o2.getName())*-1);
		//		Collections.sort(scores, (o1, o2)-> Integer.compare(o1.getTotal(), o2.getTotal())*-1);
		//		Collections.sort(scores, new Comparator<Score>() {
		//			@Override
		//			public int compare(Score o1, Score o2) {
		//				return Integer.compare(o1.getNo(), o2.getNo());
		//			}
		//		});	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
		
		
		
	}
}
