package useful.ch03;

public class NickNameTest {
	
	public static void main(String[] args) {
		
		NickName nick = new NickName();
		
		String inputNick = "aaa";
		
		try {
			nick.setNick(inputNick);
		} catch (NickNameException e) {
			System.out.println("우리가 정의한 nickname 예외가 발생");
		} catch (Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}
		
		
	}

}
