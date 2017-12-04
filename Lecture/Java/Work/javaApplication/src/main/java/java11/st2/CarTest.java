package java11.st2;

public class CarTest {

	public static void main(String[] args) {

		Car myCar = new Car();

		// myCar.speedPrint();
		// myCar.speedUp(100);
		// myCar.speedPrint();
		System.out.println(myCar.toString());

		Car yourCar = new Car();
		yourCar.setColor("blue");
		yourCar.setSpeed(60);
		yourCar.setGear(3);
		System.out.println(yourCar.toString());
	}

}
