package basic.ch02;

public class RectangleAreaCalculator {
	
	public static void main(String[] args) {
		
		// hint --> 가로길이 , 세로길이
		// 식을 작성하고
		
		final int RECWIDTH = 20;
		final int RECLENGTH = 10;
		int RESULT = RECLENGTH * RECWIDTH  ;
		
		
		//결과 출력하기
		
		System.out.println("사각형의 면적 : " + RESULT  );
		
		
		
		// 문자열은 특별한 녀석이다. 연산을 사용할 수 있습니다.
		// 문자열 + 정수, 문자열 + 실수 ...
		// 위 연산에 결과 값은 --> 문자열로 리턴 된다.
	}

}
