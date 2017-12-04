package java17.st1shape;

public abstract class Shape {

	protected String color = "";
	protected int x = 0;
	protected int y = 0;

	// 메서드
	public abstract Shape getShape();

//	public abstract void draw();
	
	public void draw() {
		System.out.println("Shape.draw()");

	}

	// getter & setter
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// toString
	@Override
	public String toString() {
		return "Shape [color=" + color + ", x=" + x + ", y=" + y + "]";
	}

	// 생성자
	public Shape() {
		super();
	}

	public Shape(String color, int x, int y) {
		super();
		this.color = color;
		this.x = x;
		this.y = y;
	}
}
