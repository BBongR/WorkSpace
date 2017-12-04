package java17.st1shape;

public class Circle extends Shape {

	public int radius = 0;

	// 메서드
	@Override
	public Shape getShape() {
		return null;
	}

	@Override
	public void draw() {
		System.out.println("Circle.draw()");
	}

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
	}

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public Circle(String color, int x, int y, int radius) {
		super(color, x, y);
		this.radius = radius;
	}

	public Circle(String color, int x, int y) {
		super(color, x, y);
	}
}
