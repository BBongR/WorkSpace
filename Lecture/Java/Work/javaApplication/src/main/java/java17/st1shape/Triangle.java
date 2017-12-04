package java17.st1shape;

public class Triangle extends Shape {

	public int base = 0;
	public int height = 0;

	// 메서드
	@Override
	public Shape getShape() {
		return null;
	}

	@Override
	public void draw() {
		System.out.println("Triangle.draw()");
	}

	// getter & setter
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	// toString
	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + ", toString()=" + super.toString() + "]";
	}

	// 생성자
	public Triangle() {
		super();
	}

	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}

	public Triangle(String color, int x, int y, int base, int height) {
		super(color, x, y);
		this.base = base;
		this.height = height;
	}

	public Triangle(String color, int x, int y) {
		super(color, x, y);
	}
}
