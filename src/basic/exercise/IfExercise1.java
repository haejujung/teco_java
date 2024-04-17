package basic.exercise;

public class IfExercise1 {
	
	public static void main(String[] args) {
		
		/* 조건문을 완성 하세요
		 * 90점 이상 -> A 학점
		 * 80점 이상 -> B 학점
		 * 70점 이상 -> C 학점
		 * 60점 이상 -> D 학점
		 * 59점 이하 -> F 학점
		 */
		
		int score = 89;
		
		if( score >=90 ) {
			System.out.println("A학점입니다.");
		} else if ( score >=80 ) {
			System.out.println("B학점입니다.");
		} else if( score >=70 ) {
			System.out.println("C학점입니다.");
		} else if( score >=60 ) {
			System.out.println("D학점입니다.");
		} else {
			System.out.println("F학점입니다.");
		}
		
		
	}

}
