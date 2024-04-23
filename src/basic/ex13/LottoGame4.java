package basic.ex13;

import java.util.Random;

public class LottoGame4 {

	// 인스턴스에 속하지 않는 함수 만들기 
	public static int[] makeNumbers() {
		int[] numbers = new int[6];
		Random random = new Random();

		
		// 중복된 랜덤 1 ~ 45 숫자가 나온다면 
		// 다시 반복문을 돌려서 중복 안되게 만들어야 한다. 
		for(int i = 0; i < 6; i++) {
			numbers[i] = random.nextInt(45) + 1;
		//  j = 0 , j < 0
			for(int j = 0; j < i; j++) {
				
			}
		}
		
		return numbers;
	}
	
}
