package basic.exercise;

import java.util.Scanner;

public class Excercise4 {

	public static void main(String[] args) {
		boolean flag = true;
		// 사용자 한테 값을 입력 받기
		while (flag) {

			Scanner sc = new Scanner(System.in);
			int choice;
			// \n --> 무조건 한줄 내림
			System.out.println("\n메뉴 선택");
			System.out.println("1.등록 2.조회 3.수정 4.삭제 0.종료");
			System.out.print("선택: ");
			choice = sc.nextInt(); // 정수형 값 scanner에 입력시 사용함

			// 만약... 사용자가 1 -->

			if (choice == 1) {
				System.out.println("등록 선택했습니다");
			} else if (choice == 2) {
				System.out.println("조회 선택했습니다");
			} else if (choice == 3) {
				System.out.println("수정 선택했습니다");
			} else if (choice == 4) {
				System.out.println("삭제 선택했습니다");
			} else if (choice == 0) {
				System.out.println("프로그램을 종료합니다");
				break;
			} else {
				System.out.println("잘못된 입력입니다. 다시 선택해주세요");
			}
			System.out.println("------------------------------------");
		}

	} // end of main

} // end of class
