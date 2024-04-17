package basic.ch05;

public class UserProgram {

	public static void main(String[] args) {

		User userBox = new User();
		
		System.out.println(userBox);
		
		userBox.age = 20;
		userBox.id = "iamtwenty";
		userBox.name = "스무살";
		userBox.password = 1225;
		
		System.out.println(userBox.age);
		System.out.println(userBox.id);
		System.out.println(userBox.name);
		System.out.println(userBox.password);
		
		
	}

}
