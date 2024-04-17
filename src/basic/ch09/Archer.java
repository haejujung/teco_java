package basic.ch09;

public class Archer {
	
	String name;
	int power;
	int hp;
	int defense;
	
	public Archer(String myname, int myhp, int mypower, int mydefense) {
		name = myname;
		hp = myhp;
		power = mypower;
		defense = mydefense;
	}
	public void showInfo() {
		System.out.println("궁수 이름 : " + name);
		System.out.println("궁수 체력 : " + hp);
		System.out.println("궁수 공격력 : " + power);
		System.out.println("궁수 방어력 : " + defense);
	}
	public void attackWarrior(Warrior warrior) {
		System.out.println("전사를 공격합니다");
	
	}
	public void attackWizard(Wizard wizard) {
		System.out.println("마법사를 공격합니다");
	}
	public void beAttacked(int power) {
		if(hp<=0) {
			System.out.println("이미 죽었습니다.");
			return;
		}
		hp = hp - power;
	}


}
