package basic.ch10;

public class Marine {
	
	private String name;
	private int hp;
	private int power;
	private int defense;
	private boolean isDie;
	
	
	public String getName() {
		return this.name;
	}
	public int getHp() {
		return this.hp;
	}
	public int getPower() {
		return this.power;
	}
	public int getDefense() {
		return this.defense;
	}
	public boolean getIsDie() {
		return this.isDie;
	}
	
	public void setName(String inputName) {
		this.name = inputName;
	}
	public void setHp(int inputHp) {
		this.hp = inputHp;
	}
	public void setPower(int inputPower) {
		this.power = inputPower;
	}
	public void setDefense(int inputDefense) {
		this.defense = inputDefense;
	}
	public void setIsDie(boolean inputIsDie) {
		this.isDie = inputIsDie;
	}
}
