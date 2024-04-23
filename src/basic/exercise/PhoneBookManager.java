package basic.exercise;

import java.util.Scanner;

public class PhoneBookManager {

	static int LAST_INDEX_NUMBER = 0;

	public static void main(String[] args) {

		// 스캐너 사용
		// 배열 선언
		// while

		Scanner sc = new Scanner(System.in);
		PhoneBook[] phonebook = new PhoneBook[100];

		final String SAVE = "1";
		final String SEARCH_BY_TITLE = "2";
		final String SEARCH_ALL = "3";
		final String EDIT = "4";
		final String DELETE = "5";
		final String END = "0";

		boolean flag = true;

		while (flag) {
			System.out.println("@@@ 전화번호관리 메뉴 선택 @@@");
			System.out.println("1.저장 2.선택조회 3.전체조회 4.수정 5.삭제 0.프로그램 종료");

			String selectedNumber = sc.nextLine();
			if (selectedNumber.equals(SAVE)) {
				System.out.println(">> 저장 하기 <<");
				save(sc, phonebook);

			} else if (selectedNumber.equals(SEARCH_BY_TITLE)) {
				System.out.println(">> 선택 조회 하기 <<");
				readByTitle(sc, phonebook);

			} else if (selectedNumber.equals(SEARCH_ALL)) {
				System.out.println(">> 전체 조회 하기 <<");
				readAll(phonebook);

			} else if (selectedNumber.equals(EDIT)) {
				System.out.println(">> 수정 하기 <<");
				EditPhoneNumber(sc, phonebook);

			} else if (selectedNumber.equals(DELETE)) {
				System.out.println(">> 삭제 하기 <<");
				deleteAll(phonebook);

			} else if (selectedNumber.equals(END)) {
				System.out.println("프로그램을 종료합니다.");
				flag = false;

			} else {
				System.out.println("잘못된 입력입니다");
			}

		}

	} // end of main

	// 전체 조회하기

	public static void readAll(PhoneBook[] phonebook) {
		System.out.println("------ 전체 조회하기 ------");
		for (int i = 0; i < phonebook.length; i++) {
			if (phonebook[i] != null) {
				System.out.println(phonebook[i].getName() + "," + phonebook[i].getNumber());
			}
		}
	}

	// 선택 조회하기

	public static void readByTitle(Scanner sc, PhoneBook[] phonebook) {
		System.out.println("------ 선택 조회 하기 ------");
		System.out.println(">>> 이름을 입력하세요 <<<");
		String inputName = sc.nextLine();
		boolean isFind = false;

		for (int i = 0; i < phonebook.length; i++) {
			if (phonebook[i] != null) {
				if (phonebook[i].getName().equals(inputName)) {
					System.out.println(phonebook[i].getName() + "," + phonebook[i].getNumber());
					isFind = true;
					break;
				}
			}
		}
		if (isFind == false) {
			System.out.println("저장되어 있지 않는 정보입니다");
		}
	}

	// 저장하기
	public static void save(Scanner sc, PhoneBook[] phoneBooks) {
		System.out.println("------ 저장 하기 ------");
		System.out.println("저장된 이름을 입력 하세요");
		String name = sc.nextLine();
		System.out.println("저장된 번호를 입력 하세요");
		String number = sc.nextLine();
		PhoneBook phonebook = new PhoneBook(name, number);

		if (LAST_INDEX_NUMBER >= phoneBooks.length) {
			System.out.println("저장할 공간이 없습니다");
			return;

		}
		for (int i = 0; i < phoneBooks.length; i++) {
			if (phoneBooks[i] == null) {
				phoneBooks[i] = phonebook;
				LAST_INDEX_NUMBER++; // 요소의 갯수로 사용해 보자
				break;

			}

		}

	}

	// 전체 삭제하기

	public static void deleteAll(PhoneBook[] phonebooks) {
		System.out.println("----- 전체 삭제하기 -----");
		for (int i = 0; i < phonebooks.length; i++) {
			phonebooks[i] = null;
		}
	}

	public static void EditPhoneNumber(Scanner sc, PhoneBook[] phonebook) {
		System.out.println("변경하고자 하는 이름을 입력하세요");
		String name = sc.nextLine();

		for (int i = 0; i < phonebook.length; i++) {
			if (phonebook[i] != null) {
				if (phonebook[i].getName().equals(name)) {
					System.out.println("수정할 이름을 입력하세요");
					String newName = sc.nextLine();
					System.out.println("수정할 번호를 입력하세요");
					String newPhoneNumber = sc.nextLine();
					phonebook[i].setName(newName);
					phonebook[i].setNumber(newPhoneNumber);
					System.out.println("정보가 수정되었습니다.");
					break;
				} else {
					System.out.println("수정하고자 하는 회원의 정보가 없습니다.");
					break;
				}
			}
		}
	}
} // end of class
