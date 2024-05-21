package Io.file.ch03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedFileCopy {

	public static void main(String[] args) {
		// 기반스트림 + 보조스트림을 활용해서 파일 복사 기능을 만들고
		// 파일 복사 기능을 만들고
		// 소요 시간을 측정하시오

		String sourceFilePath = "C:\\Users\\KDP\\Documents\\Lightshot\\a.zip";

		String destinationFilePath = "copy2.zip";

		long startTime = System.nanoTime();

		try {
			FileInputStream in = new FileInputStream(sourceFilePath);
			FileOutputStream out = new FileOutputStream(destinationFilePath);
			BufferedInputStream bis = new BufferedInputStream(in);
			BufferedOutputStream bos = new BufferedOutputStream(out);

			int data;
			while ((data = bis.read()) != -1) {
				bos.write(data);
			}

			bos.flush();

		} catch (Exception e) {
		}

		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println("버퍼복사의 소요시간 : " + duration);

		double seconds = duration / 1_000_000_000.0;

		String resultFormat = String.format("버퍼의 소요시간 : %.6f초 입니다", seconds);

		System.out.println(resultFormat);

	}

}
