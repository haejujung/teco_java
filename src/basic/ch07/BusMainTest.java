package basic.ch07;

public class BusMainTest {

	public static void main(String[] args) {

		Bus bus1 = new Bus();
		
		bus1.model = 2021;
		bus1.price = 1800;
		bus1.destination = "사상역";
		bus1.station = "백화점";
		bus1.drive();
		bus1.stop();
		
		Bus bus2 = new Bus();
		
		bus2.model = 1985;
		bus2.price = 900;
		bus2.destination = "낙동강";
		bus2.destination = "대학교";
		bus2.drive();
		bus2.stop();
		
		
	}

}
