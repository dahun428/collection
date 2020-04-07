package vo;

import java.util.ArrayList;
import java.util.Iterator;

import utils.CommonUtils;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		Product p1 = new Product(10000,"IPHONE XS", "Apple", 1570000);
		Product p2 = new Product(10001,"IPAD PRO", "Apple", 1200000);
		Product p3 = new Product(10002,"APPLE WATCH", "Apple", 600000);
		Product p4 = new Product(10003,"MACBOOK PRO 13", "Apple", 1700000);
		Product p5 = new Product(10004,"MACBOOK PRO 16", "Apple", 3600000);
		
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		
		
//		for(Product product : products) {
//			System.out.println("상품번호 : " + product.getNo());
//			System.out.println("상품명 : " + product.getName());
//			System.out.println("제조사 : " + product.getMaker());
//			System.out.println("가격 : " + product.getPrice());
//			System.out.println();
//		}
		Iterator<Product> iterator = products.iterator();
		while(iterator.hasNext()) {
			Product product = iterator.next();
			System.out.println("상품번호 : " + product.getNo());
			System.out.println("상품명 : " + product.getName());
			System.out.println("제조사 : " + product.getMaker());
//			System.out.println("가격 : " + CommonUtils.numberToString(product.getPrice()));
//			System.out.println("등록 날짜 : " + CommonUtils.simpleDateString(product.getCreateDate()));
			System.out.println();
		}
		
		
		
	}
}
