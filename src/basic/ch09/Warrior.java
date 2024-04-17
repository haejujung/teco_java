package basic.ch09;

public class Warrior {
	
	String name;
	int power;
	int hp;
	int defense;
	
	public Warrior(String myname, int myhp, int mypower, int mydefense) {
		name = myname;
		hp = myhp;
		power = mypower;
		defense = mydefense;
	}
	public void showInfo() {
		System.out.println("전사 이름 : " + name);
		System.out.println("전사 체력 : " + hp);
		System.out.println("전사 공격력 : " + power);
		System.out.println("전사 방어력 : " + defense);
	}
	
	public void attackWizard(Wizard wizard) {
		System.out.println("마법사를 공격합니다");
	}
	public void attackArcher(Archer archer) {
		System.out.println("궁수를 공격합니다");
	}
	public void beAttacked(int power) {
		if(hp<=0) {
			System.out.println("이미 죽었습니다.");
			return;
		}
		hp = hp - power;
	}

}
