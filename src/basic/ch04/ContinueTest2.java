package basic.ch04;

public class ContinueTest2 {

	public static void main(String[] args) {

		// 1부터 100까지 숫자 중에 3의 배수를 출력 하세요
		// 만약 3의 배수라면 화면에 숫자를 출력하세요
		// 반복문은 for 을 사용하세요
		// 반복문 while 사용하여 다시 작성해주세요
//
//		for (int i = 1; i <= 100; i++) {
//
//			System.out.println((i * 3));
//			if (i == 33) {
//				break;
		// 3으로 나누었을 때 나머지가 0이면 3의 배수이다.
		// if ((i % 3) == 0){
		// System.out.println( i );
//			}
//		}
		int i = 1;

//		while (i <= 100) {
//
//			if (i % 3 == 0) {
//				System.out.println(i);
//
//			}
//			i++;
//		}
		
		// 풀이 - 2 : 특정 조건이 되었을 때 반복문을 멈추어라
		boolean flag = true;
		while(flag) {
			if( i%3 == 0) {
			System.out.println("3의 배수 :"+i);
			}
			// 특정 조건 --> 멈추기
			if(i == 100) {
				flag = false;
				// i = 100
			}
			
			i++; // i == 101
		}

	} // end of main

} // end of class
