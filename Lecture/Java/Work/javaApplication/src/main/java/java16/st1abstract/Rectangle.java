package java16.st1abstract;

public class Rectangle extends Shape {

	int width, height;

	@Override
	public void draw() {
		System.out.println("사각형 그리기 메소드");
	}
}
