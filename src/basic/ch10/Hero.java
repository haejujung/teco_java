package basic.ch10;

public class Hero {

	private String name;
	private int hp;
	private int power;
	private double defense;
	private boolean isDie; 
	// 만약 필드 타입이 boolean일 경우, Getter는 get으로 시작하지 않고 
	// is 로 시작하는 것이 관례이다.

	// getter, setter 메서드를 만들어 주세요

	public String getName() {
		return this.name;
	}

	public int getHp() {
		return this.hp;
	}

	public int getPower() {
		return this.power;
	}

	public double getDefense() {
		return this.defense;
	}

	public boolean getIsdie() {
		return this.isDie;
	}

	public void setName(String inputName) {
		this.name = inputName;
	}

	public void setHp(int inputHp) {
		if (hp < 0) {
			System.out.println("잘못된 입력입니다.");
		} else {
			this.hp = inputHp;
		}
	}

	public void setPower(int inputPower) {
		this.power = inputPower;
	}

	public void setDefense(double inputDefense) {
		this.defense = inputDefense;
	}

	public void setIsdie(boolean inputIsDie) {
		this.isDie = inputIsDie;
	}

}
