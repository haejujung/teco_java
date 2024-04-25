package basic.ch22;

public class CompleteCalc extends Calculator{

	@Override
	public int add(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1 + n2;
	}

	@Override
	public int substract(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1 - n2;
	}

	@Override
	public int times(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1 * n2;
	}
		
	public void showInfo() {
		System.out.println("계산 완료");
	}
		
	
	// ctrl + t 로 구조확인하기
	public static void main(String[] args) {
		Calc calc = new CompleteCalc(); // 업캐스팅된 상태
		
		System.out.println("add : " + calc.add(10, 20));
		System.out.println(calc.divide(10, 0));
		
		System.out.println("---------------------");
	
		((CompleteCalc)calc).showInfo(); // 다운캐스팅 형변환
		// 반복문 , 제어문을 활용한다면 instanceof 연산자를 기억하자
		// instanceof를 통해 바로위의 메서드를 인식함
		if(calc instanceof CompleteCalc) {
			((CompleteCalc) calc).showInfo();
		}
		
		// 앞대문자 참조타입
//		ArithmeticException arithmeticException;
	}

}
