package Io.file.ch05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class CityInfoApp1 {

	public static void main(String[] args) {

		System.out.println("도시 이름 입력 : ");

		try (Scanner scanner = new Scanner(System.in)) {

			String city = scanner.nextLine();
			String fileName = city + ".txt";

			// 1. 파일에 있는 데이터를 응용프로그램으로 가져와야 한다. (문자 기반)
			// FileReader (문자 기반 스트림 이다) , 단 주의할 사항
			// 파일을 읽을 때 시스템의 기본 문자 인코딩을 사용, 운영체제, 지역에 따라 다름

			// 파일리더는 한글자 버퍼드리더는 한문장씩 읽어준다
			try (FileReader fr = new FileReader(fileName); BufferedReader br = new BufferedReader(fr)) {
				System.out.println(city + " 에 대한 정보 입니다");

				String line;
				while ((line = br.readLine()) != null) {
					System.out.println(line);

				}

			} catch (Exception e) {
				System.out.println("해당 파일을 찾을 수 없습니다.");
			}

		} catch (

		Exception e) {
			e.printStackTrace();
		}

	}

}
