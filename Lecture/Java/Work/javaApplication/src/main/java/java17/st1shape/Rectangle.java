package java17.st1shape;

public class Rectangle extends Shape {

	public int width = 0;
	public int height = 0;

	// 메서드
	@Override
	public Shape getShape() {
		return null;
	}

	@Override
	public void draw() {
		System.out.println("Rectangle.draw()");
	}

	// getter & setter
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
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
		return "Rectangle [width=" + width + ", height=" + height + ", toString()=" + super.toString() + "]";
	}

	// 생성자
	public Rectangle() {
		super();
	}

	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public Rectangle(String color, int x, int y, int width, int height) {
		super(color, x, y);
		this.width = width;
		this.height = height;
	}

	public Rectangle(String color, int x, int y) {
		super(color, x, y);
	}
}
