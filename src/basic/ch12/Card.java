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
	
	
	
	// 코드 테스트(메인 함수)
	public static void main(String[] args) {
		
		Card card1 = new Card("우리카드");
//		System.out.println(card1.cardId());
		
	} // end of main
	

} // end of class
