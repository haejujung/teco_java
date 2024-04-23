package basic.ch18;

public class ComputerTest1 {
	
	public static void main(String[] args) {
		
		Computer computer1 = new Computer();
		computer1.saveMemory();
		System.out.println("----------");
		computer1.runCalculate();
		System.out.println("----------");
		
		computer1.cpu.name = "인텔";
		computer1.cpu.price = 5000;
		
		System.out.println(computer1.cpu.name);
		System.out.println(computer1.cpu.price);
	
		
		
	}

}
