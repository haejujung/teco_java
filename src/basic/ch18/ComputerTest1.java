package basic.ch18;

public class ComputerTest1 {
	
	public static void main(String[] args) {
		
		Computer computer1 = new Computer();
		Cpu cpu1 = new Cpu();
		computer1.saveMemory();
		System.out.println("----------");
		computer1.runCalculate();
		System.out.println("----------");
		cpu1.setName("AMD");
		
		System.out.println(cpu1.getName());
	
		
		
	}

}
