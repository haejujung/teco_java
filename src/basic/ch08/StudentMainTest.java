package basic.ch08;

public class StudentMainTest {

	public static void main(String[] args) {

		//Student 에서 강제성이 생겨 String, int, int 값이 들어가야된다
		Student s1 = new Student("홍길동", 101,3); // 객체
		System.out.println(s1); // 주소값이 출력이 된다.
		s1.showInfo();
		
		System.out.println("--------------------");
		
		// 연습문제
		// s2 참조 변수에 이름으로 학생을 메모리에 올리고
		// 호출해주세요
		
		Student s2 = new Student("정해주", 202, 1);
		s2.showInfo();
		
		System.out.println("---------------------");
		
		// 변수에 직접 접근해서 값을 초기화 해보세요
		Student s3 = new Student();
		s3.name = "야스오";
		s3.grade = 2;
		s3.number = 103;
		s3.showInfo();
		
		// 생성자를 여러개 만들어 줄 수 있다.
		// 생성자 오버로딩이라고 한다.
		
		
	} // end of main

} // end of class
