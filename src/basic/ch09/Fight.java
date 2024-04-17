package basic.ch09;

import java.util.Scanner;

public class Fight {

	public static void main(String[] args) {
		boolean flag = true;

		Warrior warrior1 = new Warrior("견습기사", 200, 30, 30);
		Wizard wizard1 = new Wizard("견습마법사", 100, 50, 10);
		Archer archer1 = new Archer("견습궁수", 150, 40, 20);

		while (flag) {
			Scanner sc = new Scanner(System.in);
			System.out.println("직업을 선택하세요");
			System.out.println("1.전사 2.마법사 3.궁수 0.종료");
			int inputData = sc.nextInt();
			if (inputData == 1) {
				warrior1.showInfo();
			} else if (inputData == 2) {
				wizard1.showInfo();
			} else if (inputData == 3) {
				archer1.showInfo();
			} else if (inputData == 0) {
				break;
			} else {
				System.out.println("잘못된 입력입니다");
			}

			
		} // end of while

	} // end of main

} // end of class
