package basic.ch02;

public class TriangleAreaCalculator {

	public static void main(String[] args) {
		
		//삼각형에 밑변 BASE , 단 상수로 선언
		final double BASE = 25;
		//삼격형의 높이 HEIGHT , 단 상수로 선언
		final double HEIGHT = 15;
		//결과 값을 area 변수에 저장
		double AREA = BASE*HEIGHT/2;
		//결과 출력 하기
		System.out.println("삼각형의 면적 : " + AREA);

	}

}
