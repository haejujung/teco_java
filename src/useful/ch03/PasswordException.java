package useful.ch03;

/*
 * 사용자 정의 예외 클래스 생성
 * 1. 클래스를 설계 --> 상속을 받아야한다
 * 2. 활용할 수 있는 클래스에서 throws와 throw를 활용
 * 3. Password 클래스에 활용
 * 4. 코드 실행 시점에서 테스트 및 예외 처리 작성
 */

public class PasswordException extends RuntimeException{
	
	public PasswordException(String message) {
		super(message);
		
	}

}
