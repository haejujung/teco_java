package basic.exercise.toy;

public class AirPods extends Product {

	String origin;
	
	public AirPods() {
		
		name = "에어팟3세대";
		price = 200000;
		origin = "중국";
		number = 1;
	}
	
	@Override
	public void put() {
		System.out.println("에어팟을 뽑습니다");
	}

}
