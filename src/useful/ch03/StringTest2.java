package useful.ch03;

public class StringTest2 {

	public static void main(String[] args) {
		
		String str3 = "abc";
		
		String str4 = "abc";
		
		// 객체의 고유한 hashcode를 리턴하는 메소드이다
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));		
		
		str3 = str3 + " : def ";
		System.out.println(System.identityHashCode(str3));
		
		// 리터럴 타입으로 생성한 String 한번 생성하면 불변이다

		
		
		
		
		
	} // end of main
} // end of class
