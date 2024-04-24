package basic.ch18;

public class Computer {
	
	private String name;
	private int price;
	private Cpu cpu;
	
	public Computer() {
		cpu = new Cpu();
		cpu.setName("인텔울트라5");
		
	}
	
	public void saveMemory() {
		cpu.memory();
		System.out.println("컴퓨터에 저장합니다");
	}
	public void runCalculate() {
		cpu.calculate();
		System.out.println("컴퓨터 연산을 실행합니다");
	}
	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}
	public Cpu getCPU() {
		return cpu;
	}
	
}
