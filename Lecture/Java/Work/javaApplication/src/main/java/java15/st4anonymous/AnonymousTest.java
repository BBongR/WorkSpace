package java15.st4anonymous;

public class AnonymousTest {
	public static void main(String[] args) {

		// 클래스를 이용한 인스턴스 생성
		Tv tv1 = new Tv();

		// 인터페이스에 인스턴스 저장
		RemoteControl tv2 = new Tv();

		// 무명 클래스를 이용한 인스턴스 생성
		RemoteControl tv3 = new RemoteControl() {

			@Override
			public void turnOn() {

			}

			@Override
			public void turnOff() {

			}

			@Override
			public void moveRight() {

			}

			@Override
			public void moveLeft() {

			}
		};
	}

}
