package java14.st3car;

public class SportsCar extends Car {

	boolean turbo;

	// getter & setter
	public boolean isturbo() {
		return turbo;
	}

	public void setturbo(boolean turbo) {
		this.turbo = turbo;
	}

	// 생성자

	// toString
	@Override
	public String toString() {
		return "SportsCar [turbo=" + turbo + ", toString()=" + super.toString() + "]";
	}

	public SportsCar() {
		super();
	}

	public SportsCar(int speed, int gear, String color) {
		super(speed, gear, color);
	}

	public SportsCar(boolean turbo) {
		super();
		this.turbo = turbo;
	}

	public SportsCar(int speed, int gear, String color, boolean turbo) {
		super(speed, gear, color);
		this.turbo = turbo;
	}

	public SportsCar(String color, boolean turbo) {
		super(color);
		this.turbo = turbo;
	}

}
