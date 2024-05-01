package basic.ch23;

public class Father extends Thread{
	
//	BankAccount account = new BankAccount();
	BankAccount account;
	
	public Father(BankAccount account) {
		// 객체가 될 때 맨 처음 동작하는 코드는 생성자이다.
		this.account = account;
	}
	
	@Override
	public void run() {
		// 1만원 입금 처리 - 다른작업자에게 위임
		account.saveMoney(10000);
	}
	
}
