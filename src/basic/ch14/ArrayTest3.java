package basic.ch14;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		char[] alphbets = new char[26];
		char ch1 = 'A';
		alphbets[0] = ch1;
		
		char ch2 = 'B';
		alphbets[1] = ch2;
		
		char ch3 = 'C';
		alphbets[2] = ch3;
		
		char ch26 = 'Z';
		alphbets[25] = ch26;
		
		// 배열은 반복문과 함께 많이 사용 된다.
		int forCount = 0;
		int eCount = 0;
		for(int i = 0; i < alphbets.length; i++) {
			if(alphbets[i] != 0) {
				eCount++;
			}
//			alphbets[i];
			System.out.println(alphbets[i]);
			forCount++;
		}
		System.out.println("for 동작 횟수" + forCount);
		System.out.println("배열안에 요소의 개수는 ? " + forCount);

	
		
	}

}
