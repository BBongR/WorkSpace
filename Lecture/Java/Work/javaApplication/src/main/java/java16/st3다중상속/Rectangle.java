package java16.st3다중상속;

public class Rectangle extends Shape implements Drawable {

	public int w, h;

	@Override
	public void draw() {
		String s = "";
		s = String.format("사각형 :: (x,y)=(%d,%d), (w,h)=(%d,%d)", x, y, w, h);
		System.out.println(s);
	}
}
