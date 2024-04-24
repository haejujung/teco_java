package basic.exercise.toy;

public class BearDoll extends Product {

	public BearDoll() {

		name = "불곰인형";
		price = 3000;
		number = 20;
	}
	
	@Override
	public void put() {
		System.out.println("불곰인형을 뽑습니다");
	}

}
