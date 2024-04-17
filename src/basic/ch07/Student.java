package basic.ch07;

/*
 * 객체의 속성은 멤버 변수로
 * 객체의 기능은 메서드로 구현 한다.
 */
public class Student {

	// 멤버 변수
	// 특징 - 초기화 값을 넣지 않는다면 기본 값으로 초기화 된다.
	// new .. 생성자(); --> heap 메모리에 올라 갔을 시 값이 없다면
	// 기본값으로 초기화 된다.

	int studentID;
	String studentName;
	String address;
	String takeTest;
	String cleanUp;

	// 메서드 설계 하기
	public void study() {
		System.out.println(studentID + "학생이 공부를 합니다.");
	}

	public void breakTime() {
		System.out.println(studentID + "학생이 휴식을 합니다.");
	}

	public void showInfo() {
		System.out.println("------------상태창-------------");
		System.out.println("학생 ID : " + studentID);
		System.out.println("학생 ID : " + studentName);
		System.out.println("학생 ID : " + address);
	}

	// 메서드란?
	// 객체의 기능을 구현하기 위해 클래스 내부에 구현되는 함수
	// 멤버 함수(member function) 이라고도 한다.
	// 메서드 - 멤버 변수를 활용해서 기능을 구현 한다.

	// 연습 문제 ( 메소드를 정의해 보세요)
	// 1. 시험을 친다(takeTest) studentID + " 학생이 시험을 친다."

	public void takeTest() {
		System.out.println("학생이 시험을 친다" + takeTest);
	}

	public void cleanUp() {
		System.out.println("학생이 청소를 한다 " + cleanUp);
	}

} // end of class
