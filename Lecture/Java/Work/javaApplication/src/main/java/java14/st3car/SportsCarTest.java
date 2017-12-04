package java14.st3car;

public class SportsCarTest {

	public static void main(String[] args) {

		// setter를 이용한 초기화
		SportsCar c1 = new SportsCar();

		c1.setColor("white");
		c1.setGear(6);
		c1.setSpeed(250);
		c1.setturbo(true);

		SportsCar c2 = new SportsCar(300, 5, "green", true);

		// 생성자를 이용한 초기화 : turbo 설정
		SportsCar c3 = new SportsCar(true);

		// 매개변수 2개짜리 생성자 만드시오 : color, turbo
		SportsCar c4 = new SportsCar("black", true);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}
}
