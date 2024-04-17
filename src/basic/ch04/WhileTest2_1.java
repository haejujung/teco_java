package basic.ch04;

public class WhileTest2_1 {
	
	public static void main(String[] args) {
		
		// 1부터 5까지 덧셈 연산을 하라
		// 1+ 2 + 3 + 4 + 5
		
		int start = 1; // 시작값은 1
		int end = 5; // 5번
		int sum = 0;
		
		// 첫번째 반복
		// 6번째
		//        6 <= 5)
		boolean flag = true;
		while(true) {
			// 실행에 제어권을 반납한다.
			if(start == 10) {
				flag = false; 
			return;
			}
			
		// 1: 0 = 0   + 1 ==> sum : 1
		// 2:     1   + 2 ==> smm : 3
		// 3:     3   + 3 ==> sum : 6
		// 4:     6   + 4 ==> sum :10
		// 5:    10   +4
			sum = sum + start;
			System.out.println("sum("+start+") :" +sum);
			
			start++; // 1씩 증가
		}
		
		
	} // end of main

} // end of class

