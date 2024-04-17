package basic.ch02;

/*
 당신은 전자 상거래 웹사이트를 운영하고 있으며, 특정 제품에 대해 할인 행사를 진행하려고 합니다. 
 제품의 원래 가격은 59.99달러이고, 30% 할인을 적용하려고 합니다. 최종 가격을 계산한 후, 
 소수점 이하를 버리고 정수 부분만을 가격으로 표시하려고 합니다.
1. 제품의 원래 가격과 할인율을 상수로 선언하십시오.
2. 할인된 가격을 계산하고, 그 결과를 정수로 형변환하여 최종 가격을 구하십시오.
3. 최종 가격을 출력하십시오.
*/

public class DiscountCalculator {

	public static void main(String[] args) {
		
		// 상수 선언 - 원가,할인율
		final double PRICE = 59.99;
		final double DISCOUNT_RATE = 0.3; // 30%할인
		
		//할인된 가격 계산 하기(비즈니스 로직)
		
		double discountedPrice = PRICE * (1 - DISCOUNT_RATE);
		
		// 최종 가격을 정수형으로 형 변환 처리
		int finalPrice = (int)discountedPrice;
		//결과 출력
		System.out.println((int)discountedPrice);
		System.out.println("최종가격: "+ finalPrice);
		
		//
		
		
	}
}
