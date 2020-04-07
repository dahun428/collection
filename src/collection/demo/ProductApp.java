package collection.demo;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

import vo.Product;

public class ProductApp {


	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);

		ProductRepository repo = new ProductRepository();


		// 상품정보를 저장하는 ArrayList객체 생성

		while(true) {
			System.out.println("==============================================");
			System.out.println("1.전체조회	2.검색	3.등록	0.종료");
			System.out.println("==============================================");
			System.out.print("메뉴 입력 : ");
			int menuNum = sc.nextInt();

			if (menuNum == 1) {
				System.out.println("[전체 상품 조회]");
				ArrayList<Product> products = repo.getAllProducts();

				if(products.isEmpty()) {
					System.out.println("조회된 상품이 없습니다.");
				} else {
					System.out.println();
					System.out.println("=============================================");
					System.out.println("상품번호	상품명	제조사	상품가격	제조일자");
					System.out.println("=============================================");
					for(Product product : products) {
						System.out.println(product.getNo()+"\t"+product.getName()+"\t"+product.getMaker()+"\t"
								+product.getPrice()+"\t"+product.getCreateDate());
					}
				}

			}else if (menuNum == 2) {
				System.out.println("[상품 검색]");
				System.out.print("검색어를 입력하세요 : ");
				String keyword = sc.next();

				ArrayList<Product> products = repo.searchProducts(keyword);
				if(products.isEmpty()) {
					System.out.println("###["+keyword+"]에 해당하는 상품을 찾을 수 없습니다.");
				} else { 
					System.out.println("###["+products.size()+"] 건이 조회되었습니다.");
					System.out.println();
					System.out.println("=============================================");
					System.out.println("상품번호	상품명	제조사	상품가격	제조일자");
					System.out.println("=============================================");
					for(Product product : products) {
						System.out.println(product.getNo()+"\t"+product.getName()+"\t"+product.getMaker()+"\t"
								+product.getPrice()+"\t"+product.getCreateDate());
					}
				}
			}else if (menuNum == 3) {
				System.out.println("[상품 등록]");
				System.out.print("상품 명을 입력 하세요 : ");
				String name = sc.next();
				System.out.print("제조사를 입력하세요 : ");
				String maker = sc.next();
				System.out.print("상품 가격을 입력하세요  : ");
				int price = sc.nextInt();

				Product product = new Product();
				product.setName(name);
				product.setMaker(maker);
				product.setPrice(price);

				repo.insertProduct(product);

			}else if (menuNum == 0) {
				System.out.println("[프로그램 종료]");
				System.exit(0);
			}


		}


	}

}
