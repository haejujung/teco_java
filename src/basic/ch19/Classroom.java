package basic.ch19;

import java.util.Iterator;

public class Classroom {

	private String className;
	private Student[] students; // Student 배열자체인 변수 // 포함관계는 아니다
	private int studentCount;
	private final int MAX_STUDEND = 30;

	public Classroom(String className) {
		this.className = className;

		students = new Student[MAX_STUDEND];
		this.studentCount = 0;
	}

	// 학생을 추가하는 기능 만들기
	public void addStudent(Student student) {
		if (studentCount < MAX_STUDEND) {
			students[studentCount] = student;
			studentCount++;
		} else {
			System.out.println("정원 초과");
		}
	}

	// 학습에 속한 모든 학생 정보를 출력하는 기능을 만드시오

	public void showStudents() {

//		students[0]
//		students[1]
//		students[2]

		for (int i = 0; i < students.length; i++) {
			// students[i] --> [객체주소] ---> heap 영역 객체를 참조
			if (students[i] != null) {
				System.out.println("이름 : " + students[i].getName() + "나이 : " + students[i].getAge());
			}
		}
	}

	public void outStudents() {

		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				students[i] = null;
			}
		}
		System.out.println("학생이 아무도 없습니다");

	}

}
