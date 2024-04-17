package basic.ch06;

public class Greet {

	public static void main(String[] args) {

		greet("해주");

		int result1 = square(7);
		System.out.println(result1);

		System.out.println(checkAdult(17));

		System.out.println(signOfNumber(-12));
		
		int result4 = findMax(10, 20);
		System.out.println(result4);

	}

	static void greet(String greet) {
		System.out.println("안녕하세요," + greet + " 님!");

	}

	static int square(int n1) {
		int result1; // 변수 ->> 지역변수
		result1 = n1 * n1;
		return result1;

	}

	static boolean checkAdult(int n2) {
		boolean result2;
		if (n2 >= 18) {
			 result2 = true;
		} else {
			 result2 = false;
		}
		return result2;
	}

	static String signOfNumber(int number) {
		String result3;
		if (number > 0) {
			 result3 = "Positive";
		} else if (number == 0) {
			 result3 = "zero";
		} else {
			 result3 = "negative";
		}
		return result3;
	}

	static int findMax(int m1, int m2) {
		int result4;
		result4 = Math.max(m2, m1);
		return result4;
	}

}
