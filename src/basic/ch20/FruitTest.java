package basic.ch20;

public class FruitTest {

	public static void main(String[] args) {

		// 다형성
		// 다양한 형태로 클래스(데이터 타입을) 바라 볼 수 있다.

		Fruit fruit1 = new Banana(); // 업캐스팅된 상태 (부모의데이터타입으로 자식클래스 객체 대입)
		Fruit fruit2 = new Peach();

		fruit1.showInfo();
		fruit2.showInfo();

		Fruit banana1 = new Banana(); // 업캐스팅된 상태 (부모의데이터타입으로 자식)
		Fruit peach1 = new Peach();
		Fruit peach2 = new Peach();

		// 다형성을 사용하면 코드를 유연하게 작성할 수 있다.
		Fruit[] fruits = new Fruit[3]; // fruit 데이터 타입이 아니다
		fruits[0] = banana1;
		fruits[1] = peach1;
		fruits[2] = peach2;

		System.out.println("-----------------");
		// fruits[0] --> 바나나
		// 바나나에 속성인 origin을 출력하시오
		// 바나나에 기능인 saleBanana() 메서드를 호출하시오

		// 다운캐스팅
//		 Banana bananaCasting = (Banana)Fruits[0];
//		 bananaCasting.origin;
		System.out.println(((Banana) fruits[0]).origin);
		((Banana) fruits[0]).saleBanana();

		System.out.println("-----------------");

		// 0 --> 바나나
		// 1 --> 복숭아 다형성의 효용으로 인한 오류

		// instanceof 연산자를 알아야 해결 가능
		// 실행 시점에 객체가 특정 클래스의 인스턴스인지 확인하는 키워드

		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i] instanceof Banana) {
				((Banana) fruits[i]).saleBanana();
				System.out.println("-------");
			} else {
				fruits[i].showInfo();
			}
		}

	} // end of main

} // end of class
