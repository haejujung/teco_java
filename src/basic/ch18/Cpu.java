package basic.ch18;

public class Cpu {
	
	String name;
	int price;
	
	void memory() {
		System.out.println("메모리에 저장합니다");
	}
	
	void calculate() {
		System.out.println("연산합니다");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
	}

}
