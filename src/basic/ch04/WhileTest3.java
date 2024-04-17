package basic.ch04;

public class WhileTest3 {

	public static void main(String[] args) {
		
		// 1 + 2 + 3 + 4 + 5
		int start = 1;
		int sum = 0;
		
		while(start<=10) {
			
			sum = sum + start;
			start++;
			
			
			
			
		}

		System.out.println("10까지의 합계는 : " +sum);

	}

}
