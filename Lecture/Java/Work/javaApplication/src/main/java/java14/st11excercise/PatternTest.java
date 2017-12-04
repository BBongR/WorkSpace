package java14.st11excercise;

import java14.st4shape.shape;

public class PatternTest {
	public static void main(String[] args) {

		Rectangle r = new Rectangle("red", new Point(25,78), 10, 20);
		System.out.println(r.toString());
		
		System.out.println("-------------------------------------------------------------------------------------");
		Circle c = new Circle("blue", new Point(20,80), 2080);
		System.out.println(c.toString());
	}
}
