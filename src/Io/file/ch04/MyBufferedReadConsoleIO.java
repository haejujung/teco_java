package Io.file.ch04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MyBufferedReadConsoleIO {

	public static void main(String[] args) {

		// 문자 기반 스트림 + 보조 문자 기반 스트림을 사용 한다

		try (InputStreamReader isr = new InputStreamReader(System.in); 
				BufferedReader br = new BufferedReader(isr)) {

			// isr -> 한 문자씩 읽는 기능 read() 가지고 있었다.
			// br -> 한번에 한 라인씩 읽을 수 있는 기능을 가지고 있다.
			System.out.println("더 많은 텍스트를 입력 하세요(한줄 단위) -> 엔터");
			
			// isr.read(); --> 기능 확장
			String inputUserData =  br.readLine();
			System.out.println("입력 확인 : " + inputUserData);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
