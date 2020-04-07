package map;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class HashMapDemo3 {

	
	public static void main(String[] args) {
		
		
		//MAP에서  V에 해당하는 타입을 OBject로 지정하는 경우
		//여러 종류의 값을 저장하는 용도
		HashMap<String, Object> data = new HashMap<String, Object>();
		data.put("no", 100);
		data.put("title", "자바의정석");
		data.put("writer", "남궁성");
		data.put("publisher", "도우출판사");
		data.put("price", 25000);
		data.put("discountRate", 0.05);
		data.put("incomeDate", new Date());
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
		DecimalFormat decimalform = new DecimalFormat("##");
		
		int no = (int) data.get("no");
		String title = (String) data.get("title");
		String writer = (String) data.get("writer");
		String publisher = (String) data.get("publisher");
		int price = (int) data.get("price");
		double discountRate = (double) data.get("discountRate") * 100;
		Date incomeDate = (Date) data.get("incomeDate");
		
		
		System.out.println("상품번호 : " + no);
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + writer);
		
		System.out.println("출판사 : " + publisher);
		System.out.println("가격 : " + price);
		System.out.println("할인율 : " + decimalform.format(discountRate) + " %");
		System.out.println("임고일 : " + df.format(incomeDate));
		
	}
	
}
