package basic.ch05;

public class OrderProgram {

	public static void main(String[] args) {

		Order orderBox = new Order(); // 객체 생성
		
		System.out.println(orderBox); // 주소값이 담기는 레퍼런스 변수
		
		orderBox.address = "부전동";
		orderBox.name = "정해주";
		orderBox.number = 23;
		orderBox.phone = 48859401;
		System.out.println("--------------");
		
		System.out.println(orderBox.address);
		System.out.println(orderBox.name);
		System.out.println(orderBox.number);
		System.out.println(orderBox.phone);
		
		
		
		
	}

}
