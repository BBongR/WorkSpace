package java14.st4shape;

public class shape {

	// 필드
	private int x = 0;
	private int y = 0;
	private String color = "";

	// getter & setter
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// toString
	@Override
	public String toString() {
		return "shape [x=" + x + ", y=" + y + ", color=" + color + "]";
	}

	// constructor
	public shape(int x, int y, String color) {
		super();
		this.x = x;
		this.y = y;
		this.color = color;
	}

	public shape() {
		super();
		System.out.println("shape()");
	}

	public shape(String color) {
		super();
		this.color = color;
		System.out.println("shape(String color)");
	}

}
