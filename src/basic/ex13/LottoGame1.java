package basic.ex13;

public class LottoGame1 {
	
	public static void main(String[] args) {
		
		// static 변수 == 클래스 변수 라고도 불린다.
		
		int gameNumber1 = LottoNumberMaker.makeNumber();		
		int gameNumber2 = LottoNumberMaker.makeNumber();		
//		int gameNumber3 = LottoNumberMaker.makeNumber();		
//		int gameNumber4 = LottoNumberMaker.makeNumber();		
//		int gameNumber5 = LottoNumberMaker.makeNumber();		
//		int gameNumber6 = LottoNumberMaker.makeNumber();
		
		System.out.print(gameNumber1 + "\t");
		System.out.print(gameNumber2 + "\t");
//		System.out.print(gameNumber3 + "\t");
//		System.out.print(gameNumber4 + "\t");
//		System.out.print(gameNumber5 + "\t");
//		System.out.print(gameNumber6 + "\t");
		
		// 오름 차순으로 정렬해보기
		// 만약 1상자 2상자보다 크다면 어떤 행동을 하라
		// 단 변수에 값을 담고 출력 하세요.
		
		// 예상 1box = 5, 2box = 3
		int tempBox = 0;
		if(gameNumber1 > gameNumber2) {
			tempBox = gameNumber1; 
			gameNumber1 = gameNumber2;
			gameNumber2 = tempBox;
		}
		System.out.println();
		System.out.println("-----------------");
		
		System.out.print(gameNumber1 + "\t");
		System.out.print(gameNumber2 + "\t");
		
		
	} // end of main

} // end of class
