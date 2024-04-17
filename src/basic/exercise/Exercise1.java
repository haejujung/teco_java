package basic.exercise;

public class Exercise1 {
		
	//코드의 시작점
	public static void main(String[] args) {
		// 1. 데이터 10,100,100 변수를 여러분들이 이름을 정해서 선언하고
		// 동시에 초기화 후 화면에 출력 하시오
		
		int aa = 10;
		int bb = 100;
		int cc = 100;
		
		System.out.println(aa);
		System.out.println(bb);
		System.out.println(cc);
		
		//  int ageBox 상자에 20을 담아 보세요
		// ageBox 상자의 값을 30으로 변경하고 
		// 기존에 담겨 있던 데이터를 다른 곳으로 옮겨 보세요 
		
		int ageBox = 20;
		int oldBox = ageBox;
		ageBox = 30;
		System.out.println("ageBox: " + ageBox);
		System.out.println("oldBox: " + oldBox);
		
		// int a = 1; int b = 3; 선언하고 a와 b에 담겨 있는 값을 서로 스위칭 해보세요 
		
		int a = 1;
		int b = 3;
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a);
		System.out.println(b);

	} // end of main

} // end of class
