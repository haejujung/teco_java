package basic.ch18;

public class Computer {
	
	String name;
	int price;
	Cpu cpu;
	
	public Computer() {
		cpu = new Cpu();
		
	}
	
	public void saveMemory() {
		cpu.memory();
		System.out.println("컴퓨터에 저장합니다");
	}
	public void runCalculate() {
		cpu.calculate();
		System.out.println("컴퓨터 연산을 실행합니다");
	}
	
}
