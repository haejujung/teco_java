package basic.ch03;

public class Operation2 {
	
	public static void main(String[] args) {
		
		int result1 = 5 + 3;
		int result2 = 5 - 3;
		int result3 = 5 * 3;
//		double result4 = 5 / 3;
		double result4 = 5.0 / 3;
		int result5 = 5 % 3;
		
		System.out.println("result1 " + result1);
		System.out.println("result2 " + result2);
		System.out.println("result3 " + result3);
		System.out.println("result4 " + result4);
		System.out.println("result5 " + result5);
		
		// 문제
		// 1. (12 + 3) / 3 값을 화면 출력
		// 변수명, 데이터 유형 스스로 결정하고 식만들기
		
		double result6 = (12+3) /3;
		System.out.println("result6 " + result6);
	
		
		// 2. (25 % 2) 값을 화면 출력
		// 어떤 수를 2로 나누었을 때 나머지가 0이면 짝수 1이면 홀수
		
		int result7 = 25 % 2;
		System.out.println("result7 " + result7);
		
		// 3. 15를 4로 나눈 후, 그 결과의 절대값을 출력
		
		int result8 = 15 / 4;
		Math math;
		System.out.println("result8의 절대값 :"+ Math.abs(result8));
		/*
		 * 도전문제 4. 문제를 직접 만들어보자 
		 * 아메리카노와 소금빵을 같이 구매시 10%할인 적용 (단 아메리카노1개당 각각 소금빵1개적용)
		 * 아메리카노 4500원 소금빵 3200원
		 * 아메리카노 10개 및 소금빵 4개 구매시 금액은?
		 */
		double coffee = 4500;
		double bread = 3200;
		
		

		
		
		
		
		
	} // end of main


} // end of class
