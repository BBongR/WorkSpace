package java14.st11excercise;

public class Circle extends Shape {
	public int radius = 0;

	// getter & setter
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	// toString
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", toString()=" + super.toString() + "]";
	}

	// 생성자
	public Circle() {
		super();
		System.out.println("Circle()");
	}

	public Circle(int radius) {
		super();
		this.radius = radius;
		System.out.println("Circle(int radius)");
	}

	public Circle(String color, Point pt, int radius) {
		super(color, pt);
		this.radius = radius;
		System.out.println("Circle(String color, Point pt, int radius)");
	}
}
