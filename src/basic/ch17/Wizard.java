package basic.ch17;

public class Wizard extends Hero{

	public Wizard(String name, int hp) {
		super(name, hp); // 부모 생성자 호출
		
	}
	@Override
	void attack() {
		System.out.println(name + "가 기본공격을 합니다");
		super.attack();
	}

	void freezing()
	{
		System.out.println(name + "가 얼음 공격을 합니다");
	}
}
