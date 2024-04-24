package basic.exercise.toy;

import java.util.Scanner;

public class ToyMachineTest {

	public static void main(String[] args) {

//		Product product1 = new BearDoll();
//		Product product2 = new AirPods();
//		Product product3 = new LionDoll();
//
//		product1.showInfo();
//		product2.showInfo();
//		product3.showInfo();

		// Product[] products = new Product[20];

		Product beardoll1 = new BearDoll();
		Product airpods1 = new AirPods();
		Product liondoll1 = new LionDoll();
		
		ToyMachine toy1 = new ToyMachine();
		
		toy1.addProduct(airpods1);
		toy1.addProduct(liondoll1);
		toy1.addProduct(beardoll1);

//			System.out.println(((AirPods)products[0]).origin);

		Scanner sc = new Scanner(System.in);

		final String AIRPODSPICK = "1";
		final String LIONPICK = "2";
		final String BEARPICK = "3";
		final String END = "0";

		boolean flag = true;

		while (flag) {
			System.out.println("$$$  인형 뽑기  $$$");
			System.out.println("1.에어팟뽑기  2.사자인형뽑기  3.곰인형뽑기  0.그만하기");

			String selectedNumber = sc.nextLine();
			if (selectedNumber.equals(AIRPODSPICK)) {
				System.out.println(">> 에어팟 뽑기 <<");
				((AirPods)airpods1).put();
				toy1.pickProduct(0);
				
			} else if (selectedNumber.equals(LIONPICK)) {
				System.out.println(">> 사자인형 뽑기 <<");
				((LionDoll)liondoll1).put();
				toy1.pickProduct(1);

			} else if (selectedNumber.equals(BEARPICK)) {
				System.out.println(">> 곰인형 뽑기 <<");
				((BearDoll)beardoll1).put();
				toy1.pickProduct(2);


			} else if (selectedNumber.equals(END)) {
				System.out.println("뽑기를 끝냅니다");
			} else {
				System.out.println("잘못된 입력입니다");

			}
		}

	}

}
