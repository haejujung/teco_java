package basic.ch12;

public class Card {

	// 멤버 변수, static 변수

	public static String companyName = "현대카드";
	static int cardNumber = 100;

	private int cardId;
	private String name;
	private String department;

	// 생성자
	public Card(String name) {
		this.name = name;
		this.cardId = cardNumber;
		cardNumber++;

	}

	// 멤버 함수

	// get,set 작성

	public int getCardId() {
		return cardId;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	// 코드 테스트(메인 함수)
	public static void main(String[] args) {

		Card card1 = new Card("우리카드");
		Card card2 = new Card("삼성카드");
		System.out.println(card1.getName() + "번호는 " + card1.getCardId());
		System.out.println(card2.getCardId());

	} // end of main

} // end of class
