package basic.ch07;

public class Bus {

	int price;
	int model;
	String station;
	String destination;
	
	
	public void drive() {
		System.out.println(+model + "년식 버스가 운행합니다");
	}
	public void stop() {
		System.out.println(destination + "정류장에 도착합니다");
	}
	
}
