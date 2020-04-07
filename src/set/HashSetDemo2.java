//package set;
//
//import java.util.HashSet;
//import java.util.Iterator;
//
//import vo.Product;
//
//public class HashSetDemo2 {
//
//	public static void main(String[] args) {
//		
//		HashSet<Product> products = new HashSet<Product>();
//		
//		Product p1 = new Product(100,"공책","모나미",3000);
//		Product p2 = new Product(200,"노트","모나미",8000);
//		Product p3 = new Product(300,"색연필","모나미",13000);
//		Product p4 = new Product(400,"볼펜","모나미",23000);
//		Product p5 = new Product(500,"망원경","모나미",33000);
//		
//		products.add(p1);
//		products.add(p2);
//		products.add(p3);
//		products.add(p4);
//		products.add(p5);
//		
////		System.out.println(products.size());
////		for(Product product : products) {
////			System.out.println("번호 : " + product.getNo() + );
////		}  
//		
//		Iterator<Product> iter = products.iterator();
//		while(iter.hasNext()) {
//			Product p = iter.next();
////			if(p.getPrice() >= 10000) {
//				iter.remove();
//			}
////		}
////		for(Product product : products) {
//			System.out.println(product.getNo()+"\t"+product.getName()+"\t"+product.getMaker()+"\t"+product.getPrice());
//		}
//		
//		
//	}
//	
//	
//}
