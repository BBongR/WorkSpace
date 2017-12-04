package java14.st11excercise;

public class Shape {

	protected String color = "";
	protected Point pt;

	// getter & setter
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Point getPt() {
		return pt;
	}

	public void setPt(Point pt) {
		this.pt = pt;
	}

	// toString
	@Override
	public String toString() {
		return "Shape [color=" + color + ", pt=" + pt + "]";
	}

	// 생성자
	public Shape() {
		super();
		System.out.println("Shape()");
	}

	public Shape(String color, Point pt) {
		super();
		this.color = color;
		this.pt = pt;
		System.out.println("Shape(String color, Point pt)");
	}
}
