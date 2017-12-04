package java12;

import java.util.Scanner;

public class RectTest {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.err.print("w: ");
		int w = keyboard.nextInt();
		System.err.print("h: ");
		int h = keyboard.nextInt();

		Rect re = new Rect();

		re.setWidth(w);
		re.setHeight(h);
		
		re.printArea();	
		re.printPerimeter();
		
	}

}
