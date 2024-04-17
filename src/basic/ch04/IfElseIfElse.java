package basic.ch04;

public class IfElseIfElse {
	
	public static void main(String[] args) {
		
		int age = 20;
		
		
		// if else if else 사용 시 조건식에 범위 점차 크게 설정하여야 한다.
		if(age <= 7) {
			System.out.println("유치원생 입니다.");
		} else if(age <=13) {
			System.out.println("초등학생 입니다.");
		} else if(age <=16) {
			System.out.println("중학생 입니다.");
		} else if(age <=19){
			System.out.println("고등학생 입니다.");
		} else {
			System.out.println("성인 입니다.");
		} // end of if
	} // end of main

} // end of class
