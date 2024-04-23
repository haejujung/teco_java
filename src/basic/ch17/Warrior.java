package basic.ch17;

public class Warrior extends Hero {

	public Warrior(String name, int hp) {
		super(name, hp);
	}

	void comboAttack() {
		System.out.println(super.name + "가 2단공격을 합니다");
	}

	@Override
	void attack() {
		System.out.println(name + "가 기본 공격을 합니다");
		super.attack();
	}
	
}
