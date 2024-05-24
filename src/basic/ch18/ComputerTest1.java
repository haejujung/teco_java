package basic.ch18;

public class ComputerTest1 {
	
	public static void main(String[] args) {
		
		Computer computer = new Computer();
		Cpu cpu1 = new Cpu();
		computer.saveMemory();
		System.out.println("----------");
		computer.runCalculate();
		System.out.println("----------");
		cpu1.setName("AMD");
		
		System.out.println(cpu1.getName());
	
		
		
	}

}
