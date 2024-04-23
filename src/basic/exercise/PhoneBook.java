package basic.exercise;


public class PhoneBook {
	
	private String name; 
	private String number;
	private String career;

	
	public PhoneBook(String name, String number) {
		this.name = name;
		this.number = number;
	}
	
	public PhoneBook(String name, String number, String career) {
		this(name,number);
		this.career = career;
	}
	
	public String getNumber() {
		return number;
	}
	public String getName() {
		return name;
	}
	public String getCareer() {
		return career;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
}
