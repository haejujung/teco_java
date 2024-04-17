package basic.ch03;

/*
 * 빠른 평가란?
 * 논리 연산에 있어 첫 번째 조건의 결과를 결정할 때
 * 두 번째 조건을 평가 하지 않는 것을 의미
 */
public class Operation7 {
	
	public static void main(String[] args) {
		
		
		int number = 5; 
		int index = 0;
		
		
		// 빠른 평가가 동작하는 식을 만들어 보자.
		//									F						T  
		//                        F로 인해 빠른평가로 뒤에식을 연산하지 않음 
//									15			< 10		 0			2 
		boolean result = ( (number = number+10) < 10) && ( (index = index +2 ) <10);
		System.out.println("현재 number 변수에 값은 :" + number );
		System.out.println("현재 index 변수에 값은 :" + index ); // 
		
		System.out.println("------------------------");
		
		// number 값 재설정
		number = 5;
		// 논리합을 이용한 빠른 평가 식을 만들어 보자.
		
		
		//                 F            ||      T
		result = ( (number += 10) <10)  || ( (index += 2) < 10 );
		
		System.out.println(" number  :" + number );
		System.out.println(" index  :" + index );
		
		//                 T            ||       F
		//앞의 항의 결과가 true이므로 뒤 항의 결과를 평가하지 않음
		result = ( (index += 2) < 10 )  || ( (number += 10) <10);
		
		System.out.println(" number  :" + number );
		System.out.println(" index  :" + index );

		
	
	} // end of main


} // end of class
