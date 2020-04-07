package map;

import java.util.HashMap;

public class HashMapDemo2 {

	public static void main(String[] args) {
		
		HashMap<String, Double> pointDepositeRate = new HashMap<String, Double>();
		pointDepositeRate.put("bronze", 0.01);
		pointDepositeRate.put("silver", 0.03);
		pointDepositeRate.put("gold", 0.05);
		
		String grade = "gold";
		int orderPrice = 34000;
		double depositeRate = pointDepositeRate.get(grade);
		int point = (int) (orderPrice * depositeRate);
		
		System.out.println("등급 : " + grade );
		System.out.println("주문금액 : " + orderPrice);
		System.out.println("적립포인트 : " + point);
		
	}
}
