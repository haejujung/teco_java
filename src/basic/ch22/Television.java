package basic.ch22;

public class Television extends HomeAppliances implements RemoteController{
	
	
	@Override
	public void turnOn() {
		System.out.println("tv를 켠다");
	}
	@Override
	public void turnOff() {
		System.out.println("tv를 끈다");
	}
	
	

}
