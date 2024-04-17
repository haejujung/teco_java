package basic.ch04;

import java.util.Scanner;

public class EvenSumCalculator {
	
	public static void main(String[] args) {
		
		// ctrl + shift + o  <-- import 가져오기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값을 입력 하세요 : ");
		int maxNumber = sc.nextInt();
		// 1 <--        10 -------> 2 + 4 + 6 + 8 + 10;
		int sum = 0;
		
		// 가상의 값10 이라고할 때
		// 1 2 3 4 5 6 7 8 9 10;
		// i = i + 2 -> i += 2;
		// 반복적인 패턴이 확인 된다
//		for(int i = 1; i <= maxNumber; i++) {
			for(int i = 2; i <= maxNumber; i +=2) {
		   // 1 =  0  + 1;
		   // 3 =  1  + 2;
	       // 6 =  3  + 3;
			sum = sum + i;
			
		}
		
		System.out.println(" sum :" + sum);
	} // end of main

} // end of class
