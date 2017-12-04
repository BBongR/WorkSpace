package java12;

public class Rect {

	// 필드
	private int width;
	private int height;

	// 메서드
	public void printArea() {
		double result = area();
		System.out.println("Area: " + result);
	}

	public void printPerimeter() {
		double result = perimeter();
		System.out.println("Perimeter: " + result);
	}

	/* public */ double area() {
		return width * height;
	}

	/* public */ double perimeter() {
		return 2 * (width + height);
	}

	// getter && setter
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

	// 생성자
	public Rect() {
		super();
	}
	
	public Rect(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	// toString
	@Override
	public String toString() {
		return "Rect [width=" + width + ", height=" + height + "]";
	}

}
