package Io.file.ch08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MyObjectStream {

	public static void main(String[] args) {

		// 객체 직렬화
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"))) {
			Person person = new Person("손흥민", 30);
			oos.writeObject(person);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("-----------------");

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"))) {

			// 문자 기반 데이터를 읽으면 <--- 스트링 값 추출해서 코드상에 활용할 수 있도록 Object
			// 만드는 코딩을 해야한다
			Person person = (Person) ois.readObject();
			System.out.println(person);

		} catch (Exception e) {
			e.printStackTrace(); // 예외 처리 흐름 생성 가능
		}

		try (ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream("person2.txt"))) {
			Person person2 = new Person("김부각", 25);
			oos2.writeObject(person2);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try (ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("person2.txt"))) {
			Person person2 = (Person) ois2.readObject();
			System.out.println(person2);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
