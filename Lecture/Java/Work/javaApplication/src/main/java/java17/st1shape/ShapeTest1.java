package java17.st1shape;

public class ShapeTest1 {
	public static void main(String[] args) {

		Circle c = new Circle();
		c.draw(); // Circle draw()

		Rectangle r = new Rectangle();
		r.draw(); // Rectangle draw()

		Triangle t = new Triangle();
		t.draw(); // Triangle draw()

		// 질문
		Shape s = new Rectangle();
		s.draw();
	}
}
