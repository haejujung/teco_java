package structure.ch05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import basic.ch22.Student;

public class MyArrayListTest {

	public static void main(String[] args) {

		List mList; // 리스트 인터페이스 계열

		// ArrayList 클래스의 인스턴스화 처리
		ArrayList list = new ArrayList();
		// 제네릭은 추후 더 설명
		// 제네릭은 타입의 명시화이다.
		ArrayList<Integer> nums = new ArrayList<Integer>();
		// 변수에 선언과 동시에 초기화 --> 값이 들어가 있는 상태인가?
		// 값을 동시에 추가 하고 싶다면
		ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		ArrayList<String> vocabulary = new ArrayList<String>();
		ArrayList<Student> members = new ArrayList<>();

		// 클래스의 정의된 기능을 알아 봐야 한다.
		// 값 추가 방법
		list.add(3);
		list.add(null);
		list.add(1, 10); // index 1위치에 요소 10을 삽입, 기존 요소가 있었다면 뒤로 자동 이동
		System.out.println(" 값 추가 확인 : " + list);
		Student student = new Student("홍박사");
		System.out.println(student);

		// 값 삭제
		list.remove(2); // 두번째 요소 값 삭제
		System.out.println("값 삭제 확인 : " + list);

		// 전체삭제
//		list.clear();
		System.out.println("전체 삭제 확인 " + list);

		// 리스트 사이즈 확인 ( 요소의 갯수, 사이즈 개념)
		System.out.println(list.size()); // 리스트 요소의 개수 확인

		// 하나의 요소를 꺼내는 방법
		try {
			System.out.println(list.get(0));
		} catch (Exception e) {
			System.out.println("프로그램이 종료 되지 않게 처리");
		}

		nums = list; // 복사 개념 필!!! 얕은 복사 개념!!!
		System.out.println(list);
		System.out.println("----------");
		list.add(10000);
		System.out.println(nums);
//		for (Integer i : list)	{} <--- list 는 컴파일 시점에 Object 타입으로 인식
		for (Integer i : nums) {
			System.out.println("i : " + i);
		}
		
		// ArrayList 안에 값이 포함 되어 있는가 확인
		System.out.println("3이 nums  리스트에 존재 하는가?" + nums.contains(3));
		System.out.println("3이 nums  리스트에 존재 하는가?" + nums.contains(500));
		
		// 요소의 위치(index) 확인
		System.out.println("요소 3이 몇 번째 인덱스에 위치 하니 -> " + nums.indexOf(3));
		System.out.println("요소 3이 몇 번째 인덱스에 위치 하니 -> " + nums.indexOf(10));
		// 값이 없는 경우 -1 반환
		System.out.println("요소 3이 몇 번째 인덱스에 위치 하니 -> " + nums.indexOf(500));
		
		
		// Iterator 요소 순회( 반복자 )
		Iterator<Integer>iter = nums.iterator();
		while(iter.hasNext()) {
			System.out.println("while 을 활용하는 방법 : " + iter.next());
		}
		
		// 배열(배열의 i번째 요소를 찾는검색이 용이하다), ArrayList
		

	} // end of main

} // end of class
