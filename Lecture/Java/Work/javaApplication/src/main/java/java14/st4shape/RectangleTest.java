package java14.st4shape;

public class RectangleTest {

	public static void main(String[] args) {

		// Rectangle 인스턴스 r1, r2, r3, r4 만드시오
		// r1: x=1,y=1,color="black", width=0, height=0
		Rectangle r1 = new Rectangle(1, 1, "black");

		// r2: x=0,y=0,color="", width=0, height=0
		Rectangle r2 = new Rectangle();

		// r3: x=0,y=0,color="", width=100, height=200
		Rectangle r3 = new Rectangle(100, 200);

		// r4: x=1,y=1,color="black", width=100, height=200
		Rectangle r4 = new Rectangle(1, 1, "black", 100, 200);

		// Rectangle 인스턴스 r1, r2, r3, r4 의 필드 값을 출력하시오
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
	}

}
