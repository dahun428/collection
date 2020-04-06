package list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		//오류 : 타입파라미터<E>에는 클래스 명이 정의되어야 한다.
		//		int -> Integer , long -> Long, double -> Double 
		//		(기본자료형에 대응되는 Wrapper 클래스를 타입파라미터로 지정)
		
		ArrayList<Integer> numbersInteger = new ArrayList<Integer>();
		ArrayList<Long> currenciesLong = new ArrayList<Long>();
		ArrayList<Double> scores = new ArrayList<Double>();
		
		numbersInteger.add(10);//실제 실행되는 코드 number.add(new Integer(10));
		currenciesLong.add(10000000L);//currenciesLong.add(new Long(100000000L));
		scores.add(1.3);//scores.add(new Double(1.3));
		
		for(int num : numbersInteger) {
			System.out.println("numbersInteger : "+num);
		}
		Iterator<Long> iter = currenciesLong.iterator();
		while(iter.hasNext()) {
			long iterlong = iter.next();
			System.out.println("currenciesLong : "+iterlong);
		}
		Iterator<Double> iter2 = scores.iterator();
		while(iter2.hasNext()) {
			double iterdouble = iter2.next();
			System.out.println("scores : "+iterdouble);
			
		}

	}
}
