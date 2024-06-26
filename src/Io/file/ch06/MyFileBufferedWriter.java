package Io.file.ch06;


import java.io.BufferedWriter;
import java.io.FileWriter;

//버퍼를 활용 파일출력 스트림에 사용
public class MyFileBufferedWriter {
	
	public static void main(String[] args) {
		
		String filePath = "output2.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
			bw.write("첫번째 줄입니다.");
			bw.newLine();
			bw.write("두번째 줄입니다");
			bw.newLine();
			bw.write("세번째 줄입니다");
			
		} catch (Exception e) {
		}
		
	} // end of main

} // end of class
