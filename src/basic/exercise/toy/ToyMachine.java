package basic.exercise.toy;

import java.util.Random;
/*
 * 클래스 - 인형뽑기
 * 상품들이 존재 가능
 * 사자인형, 곰인형, 에어팟  product배열
 * 요구 조건
 * 배열을 활용해서 객체들을 담아 주세요
 */

public class ToyMachine {

	Product[] productArr = new Product[20];
	int lastIndex = 0; 
	
	public Product[] getProductArr() {
		return productArr;
	}

//	public void setProductArr(Product[] productArr) {
//		this.productArr = productArr;
//	}

	// 기계안에 상품을 담는 기능 만들기
	public void addProduct(Product product) {
		
		// 인덱스 최대 크기 확인 
		productArr[lastIndex] = product;
		lastIndex++;

	}

	public String getProductName(int index) {
		Product product = null;

		if (productArr.length <= index) {
			System.out.println("잘못된 입력입니다.");

		} else {
			product = productArr[index];
		}
		return product != null ? product.name : "꽝";
	}

	// 뽑기 기능을 만들기 - 하나의 상품을 리턴

	public void pickProduct(int index) {

		Random random1 = new Random();
		// 1 ~ 3 
		int a = random1.nextInt(2) + 1;

		if (a % 2 == 0) {
			System.out.println(this.productArr[index].name + "뽑혔습니다");
		} else {
			System.out.println("아쉽게 못뽑았습니다");
		}

		// return productArr[0].name;
	}

}
